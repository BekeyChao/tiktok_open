package xyz.bekey.tiktokOpen.response.order;

import com.alibaba.fastjson.annotation.JSONField;
import xyz.bekey.tiktokOpen.domain.*;
import xyz.bekey.tiktokOpen.response.PageList;
import xyz.bekey.tiktokOpen.response.TiktokOpenResponse;
import xyz.bekey.tiktokOpen.utils.TransportUtil;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrderDetailResponse extends TiktokOpenResponse<PageList<ShopOrder>> {

    @JSONField(serialize = false,deserialize = false)
    public Order getContents() {
        ShopOrder shopOrderDetail = getData().getShop_order_detail();
        if (getData() != null && shopOrderDetail != null) {
            List<Order> orderList = TransportUtil.convertToOrder(Arrays.asList(shopOrderDetail));
            return orderList.get(0);
        }
        return new Order();
    }
}
