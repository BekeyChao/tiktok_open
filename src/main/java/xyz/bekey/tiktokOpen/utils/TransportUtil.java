package xyz.bekey.tiktokOpen.utils;

import xyz.bekey.tiktokOpen.domain.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TransportUtil {

    /**
     * @param shopOrderList
     * @return
     * @Description 适配操作，将响应获得的ShopOrder集合转化为Order集合
     */
    public static List<Order> convertToOrder(List<ShopOrder> shopOrderList) {

        List<Order> orderList = new ArrayList<>();
        orderList = shopOrderList.stream().map(shopOrder -> {

            Order order = new Order();
            copySameFields(order, shopOrder);
            order.setCoupon_amount(shopOrder.getPromotion_platform_amount()); // 平台优惠券金额
            order.setLogistics_time(shopOrder.getShip_time()); // 发货时间
            order.setReceipt_time(shopOrder.getFinish_time()); // 订单完成时间
            order.setShop_coupon_amount(shopOrder.getPromotion_shop_amount()); // 店铺优惠券金额
            order.setOrder_total_amount(shopOrder.getPay_amount()); // 实际支付总金额
            order.setC_biz(shopOrder.getBiz()); // 订单业务类型

            // **********以上为父订单信息适配，以下为子订单信息适配**********

            shopOrder.getSku_order_list().stream().map(skuOrder -> {

                Order subOrder = new Order();
                copySameFields(subOrder, skuOrder);
                subOrder.setPid(skuOrder.getParent_order_id()); // 父订单号
                try {
                    subOrder.setOut_product_id(Long.parseLong(skuOrder.getOut_product_id())); // out_product_id
                } catch (NumberFormatException e) {
                    subOrder.setOut_product_id(null);
                }

                subOrder.setC_biz(skuOrder.getBiz()); // 订单业务类型
                subOrder.setBuyer_words(order.getBuyer_words()); // 买家留言，取自父订单
                subOrder.setCombo_id(skuOrder.getSku_id()); // skuId
                subOrder.setSpec_desc(skuOrder.getSpec()); // 商品规格说明
                Long skuId = skuOrder.getSku_id();
                List<LogisticsInfo> logisticsInfos = shopOrder.getLogistics_info().stream().filter(logisticsInfo ->

                        logisticsInfo.getProduct_info().stream().filter(productInfo ->

                                productInfo.getSku_id() == skuId

                        ).collect(Collectors.toList()) != null

                ).collect(Collectors.toList());

                List<String> itemIds = subOrder.getItem_ids();
                if (itemIds == null) {
                    itemIds = new ArrayList<>();
                }
                Integer shippedNum = 0;
                if (logisticsInfos == null || logisticsInfos.size() == 0) {
                    subOrder.setLogistics_code("");
                    subOrder.setLogistics_time(0L);
                    subOrder.setLogistics_id(0);
                } else {
                    LogisticsInfo logisticsInfo = logisticsInfos.get(0);
                    subOrder.setLogistics_code(logisticsInfo.getTracking_no()); // 物流单号
                    subOrder.setLogistics_time(logisticsInfo.getShip_time()); // 发货时间
                    subOrder.setLogistics_company(logisticsInfo.getCompany_name()); // 物流公司名称
                    for (LogisticsInfo info : logisticsInfos) {
                        List<ProductInfo> productInfo = info.getProduct_info();
                        if (productInfo != null) {
                            for (ProductInfo product : productInfo) {
                                if (skuId.equals(product.getSku_id())) {
                                    shippedNum += product.getProduct_count();
                                    itemIds.add(product.getSku_order_id());
                                }
                            }
                        }
                    }

                }

                subOrder.setPay_time(skuOrder.getPay_time() * 1000); // pay_time以毫秒为单位
                subOrder.setOut_skuid(skuOrder.getOut_sku_id());
                subOrder.setItem_ids(itemIds); // 	子订单中的商品id列表
                subOrder.setShipped_num(shippedNum); // 子订单已发货商品数量
                subOrder.setSeller_words(order.getSeller_words()); // 商家备注，取自父订单
                subOrder.setSeller_remark_stars(order.getSeller_remark_stars()); // 卖家订单标，取自父订单
                subOrder.setShop_id(order.getShop_id()); // 店铺id，取自父订单
                subOrder.setReceipt_time(skuOrder.getLogistics_receipt_time()); // 物流收货时间
                // 如果售后状态码为0，则final_status用order_status表示，否则用after_sale_status表示
                Integer afterSaleStatus = skuOrder.getAfter_sale_info().getAfter_sale_status();
                subOrder.setAfter_sale_status(afterSaleStatus);
                Integer finalStatus = (afterSaleStatus == 0 ? skuOrder.getOrder_status() : afterSaleStatus);
                subOrder.setFinal_status(finalStatus); // final_status赋值
                subOrder.setAfter_sale_type(skuOrder.getAfter_sale_info().getAfter_sale_type()); // 售后类型，主要用以区分换货还是退货
                subOrder.setCombo_amount(skuOrder.getOrigin_amount()); // 商品售价
                subOrder.setCombo_num(skuOrder.getItem_num()); //商品数量
                subOrder.setCoupon_amount(skuOrder.getPromotion_platform_amount()); // 平台优惠券金额
                subOrder.setShop_coupon_amount(skuOrder.getPromotion_shop_amount()); // 店铺优惠券金额
                subOrder.setTotal_amount(skuOrder.getPay_amount()); // 单件实付金额
                List<Inventory> inventoryList = skuOrder.getInventory_list();
                if (inventoryList != null && inventoryList.size() != 0) { // 仓库信息，取第1个
                    Inventory inventory = inventoryList.get(0);
                    try {
                        subOrder.setWarehouse_id(Integer.parseInt(inventory.getWarehouse_id())); // 仓库id
                        subOrder.setOut_warehouse_id(Integer.parseInt(inventory.getOut_warehouse_id())); //外部仓库id
                        subOrder.setWarehouse_supplier(Integer.parseInt(skuOrder.getSupplier_id())); // 供应商id
                    } catch (NumberFormatException e) {
//                    e.printStackTrace();
                    }
                }
                List<Order> child = order.getChild();
                if (child == null) {
                    child = new ArrayList<Order>();
                    order.setChild(child);
                }
                child.add(subOrder);
                return child;
            }).collect(Collectors.toList());

            return order;
        }).collect(Collectors.toList());
        return orderList;
    }

    /**
     * @param order
     * @param obj
     * @Description 利用反射的方式复制同名称的属性
     */
    private static void copySameFields(Order order, Object obj) {

        Field[] thisFields = obj.getClass().getDeclaredFields();
        Field[] superFields = obj.getClass().getSuperclass().getDeclaredFields();
        Field orderField;
        for (Field field : thisFields) {
            field.setAccessible(true);
            try {
                orderField = order.getClass().getDeclaredField(field.getName());
                orderField.setAccessible(true);
                orderField.set(order, field.get(obj));
            } catch (Exception e) {
                continue;
            }
        }
        for (Field field : superFields) {
            field.setAccessible(true);
            try {
                orderField = order.getClass().getDeclaredField(field.getName());
                orderField.setAccessible(true);
                orderField.set(order, field.get(obj));
            } catch (Exception e) {
                continue;
            }
        }
    }
}
