package xyz.bekey.tiktokOpen.request.parameters;

import xyz.bekey.tiktokOpen.utils.AssertUtils;

public class OrderIdParameter {

//    private String order_id;
//
//    public OrderIdParameter(String order_id) {
//        AssertUtils.isTrue(order_id != null
//        && order_id.endsWith("A"), "请传入父订单ID");
//        this.order_id = order_id;
//    }
//
//    public String getOrder_id() {
//        return order_id;
//    }

    private String shop_order_id;

    public OrderIdParameter(String shop_order_id) {
        AssertUtils.isTrue(shop_order_id != null, "请传入店铺订单号");
        this.shop_order_id = shop_order_id;
    }

    public String getShop_order_id() {
        return shop_order_id;
    }
}
