package xyz.bekey.tiktokOpen.request.parameters;

import com.alibaba.fastjson.JSON;
import xyz.bekey.tiktokOpen.domain.MultiPack;

public class MultiPackParameters {

    // 父订单ID，需在结尾带上大写字母A
    private String order_id;

    private String pack_list;

    private String request_id;

    public MultiPackParameters(String orderId, MultiPack pack, String request_id) {
        this.order_id = orderId;
        this.request_id = request_id;
        this.pack_list = JSON.toJSONString(pack);

    }
}
