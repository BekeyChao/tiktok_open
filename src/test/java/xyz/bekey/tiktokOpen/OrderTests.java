package xyz.bekey.tiktokOpen;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Before;
import org.junit.Test;
import xyz.bekey.tiktokOpen.domain.enums.OrderStatus;
import xyz.bekey.tiktokOpen.request.order.OrderDetailRequest;
import xyz.bekey.tiktokOpen.request.order.OrderListRequest;
import xyz.bekey.tiktokOpen.request.parameters.OrderIdParameter;
import xyz.bekey.tiktokOpen.request.parameters.OrderListParameters;
import xyz.bekey.tiktokOpen.response.order.OrderDetailResponse;
import xyz.bekey.tiktokOpen.response.order.OrderListResponse;

import java.time.LocalDateTime;

public class OrderTests {

    private TiktokOpen client;

    private String accessToken;

    @Before
    public void before() {

        TiktokOpenConfig config = new TiktokOpenConfig();
        config.setAppsercet(AppInfo.appSecret);
        config.setAppKey(AppInfo.appKey);
        TiktokOpen open = new TiktokOpen(config);
        this.client = open;
        this.accessToken = "token";
    }

    @Test
    public void orderList() {
        OrderStatus orderStatus = OrderStatus.Done;
        OrderListParameters parameters = new OrderListParameters();
        parameters.setOrder_status(orderStatus);
//        parameters.setStart_time(LocalDateTime.now().minusDays(30));
        parameters.setSize(10);

        OrderListRequest request = new OrderListRequest(parameters);
        OrderListResponse response = client.getTiktokResponse(request, accessToken);

        System.out.println(JSON.toJSONString(response, SerializerFeature.PrettyFormat));

    }

    @Test
    public void orderDetail() {
        OrderIdParameter parameter = new OrderIdParameter("4688001900746693110A");
        OrderDetailRequest request = new OrderDetailRequest(parameter);
        OrderDetailResponse res = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(res, SerializerFeature.PrettyFormat));
    }

}
