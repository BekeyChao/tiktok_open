package xyz.bekey.tiktokOpen.response.order;

import com.alibaba.fastjson.annotation.JSONField;
import xyz.bekey.tiktokOpen.domain.Order;
import xyz.bekey.tiktokOpen.response.PageList;
import xyz.bekey.tiktokOpen.response.TiktokOpenResponse;

import java.util.ArrayList;
import java.util.List;

public class OrderListResponse extends TiktokOpenResponse<PageList<Order>> {

    @JSONField(serialize = false,deserialize = false)
    public List<Order> getContents() {
        if (getData() != null && getData().getList() != null) {
            return getData().getList();
        }
        return new ArrayList<>();
    }

}
