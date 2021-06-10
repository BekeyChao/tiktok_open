package xyz.bekey.tiktokOpen.response.order;

import com.alibaba.fastjson.annotation.JSONField;
import xyz.bekey.tiktokOpen.domain.*;
import xyz.bekey.tiktokOpen.response.PageList;
import xyz.bekey.tiktokOpen.response.TiktokOpenResponse;
import xyz.bekey.tiktokOpen.utils.TransportUtil;

import java.util.ArrayList;
import java.util.List;

public class OrderListResponse extends TiktokOpenResponse<PageList<ShopOrder>> {

    @JSONField(serialize = false, deserialize = false)
    public List<Order> getContents() {
        List<ShopOrder> shopOrderList = getData().getShop_order_list();
        if (getData() != null && shopOrderList != null) {
            return TransportUtil.convertToOrder(shopOrderList);
        }
        return new ArrayList<>();
    }

//    @JSONField(serialize = false,deserialize = false)
//    public List<Order> getContents() {
//        if (getData() != null && getData().getList() != null) {
//            return getData().getList();
//        }
//        return new ArrayList<>();
//    }

}
