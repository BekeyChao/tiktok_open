package xyz.bekey.tiktokOpen.request.parameters;

import com.alibaba.fastjson.JSON;
import xyz.bekey.tiktokOpen.domain.MultiPack;

import java.util.List;

public class MultiPackParameters {

    // 父订单ID，需在结尾带上大写字母A
    private String order_id;

    private List<MultiPack.PackListBean> pack_list;

    private String request_id;

    public MultiPackParameters(String orderId, List<MultiPack.PackListBean> pack, String request_id) {
        this.order_id = orderId;
        this.request_id = request_id;
        this.pack_list = pack;
    }

    public String getOrder_id() {
        return order_id;
    }

    public String getPack_list() {
        return JSON.toJSONString(pack_list);
    }

    public String getRequest_id() {
        return request_id;
    }
}
