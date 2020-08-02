package xyz.bekey.tiktokOpen;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Before;
import org.junit.Test;
import xyz.bekey.tiktokOpen.request.parameters.OrderListParameters;
import xyz.bekey.tiktokOpen.request.refund.RefundOrderListRequest;
import xyz.bekey.tiktokOpen.response.refund.RefundOrderListResponse;

public class RefundTests {

    private TiktokOpen client;

    private String accessToken;

    @Before
    public void before() {

        TiktokOpenConfig config = new TiktokOpenConfig();
        config.setAppsercet(AppInfo.appSecret);
        config.setAppKey(AppInfo.appKey);
        TiktokOpen open = new TiktokOpen(config);
        this.client = open;
        this.accessToken = AppInfo.accessToken;
    }

    @Test
    public void refundOrderList() {
        OrderListParameters parameters = new OrderListParameters();
        parameters.setType(2);
        RefundOrderListRequest request = new RefundOrderListRequest(parameters);
        RefundOrderListResponse response = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(response, SerializerFeature.PrettyFormat));
    }

}
