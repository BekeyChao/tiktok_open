package xyz.bekey.tiktokOpen;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Before;
import org.junit.Test;
import xyz.bekey.tiktokOpen.domain.Order;
import xyz.bekey.tiktokOpen.domain.ShopOrder;
import xyz.bekey.tiktokOpen.domain.enums.OrderStatus;
import xyz.bekey.tiktokOpen.domain.enums.SortBy;
import xyz.bekey.tiktokOpen.request.order.LogisticsCompanyListRequest;
import xyz.bekey.tiktokOpen.request.order.OrderDetailRequest;
import xyz.bekey.tiktokOpen.request.order.OrderListRequest;
import xyz.bekey.tiktokOpen.request.parameters.OrderIdParameter;
import xyz.bekey.tiktokOpen.request.parameters.OrderListParameters;
import xyz.bekey.tiktokOpen.response.order.LogisticsCompanyListResponse;
import xyz.bekey.tiktokOpen.response.order.OrderDetailResponse;
import xyz.bekey.tiktokOpen.response.order.OrderListResponse;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;

public class OrderTests {

    private TiktokOpen client;

    private String accessToken;

    @Before
    public void before() {

        TiktokOpenConfig config = new TiktokOpenConfig();
        config.setAppsercet(AppInfo.appSecret);
        config.setAppKey(AppInfo.appKey);
        TiktokOpen open = new TiktokOpen(config);
        open.setErrNoHandleConfig(new ErrNoHandleConfig());
        this.client = open;
        this.accessToken = AppInfo.accessToken;
    }

//    @Test
//    public void orderList() {
////        OrderStatus orderStatus = OrderStatus.Done;
//        OrderListParameters parameters = new OrderListParameters();
////        parameters.setOrder_status(orderStatus);
////        parameters.setStart_time(LocalDateTime.now().minusDays(30));
//        parameters.setIs_desc(SortBy.ASC);
//        parameters.setStart_time(LocalDateTime.now().minusDays(3));
//        parameters.setPage(0);
//        parameters.setSize(10);
//
//        OrderListRequest request = new OrderListRequest(parameters);
//        OrderListResponse response = client.getTiktokResponse(request, accessToken);
//
//        System.out.println(JSON.toJSONString(response, SerializerFeature.PrettyFormat));
//    }

    @Test
    public void shopOrderList(){

        Integer page = 0;
        Integer size = 20;
        OrderListParameters parameters = new OrderListParameters();
        parameters.setPage(page);
        parameters.setSize(size);
        parameters.setCreate_time_start(LocalDateTime.now().minusDays(3));
        parameters.setUpdate_time_start(LocalDateTime.now().minusDays(3));
        OrderListRequest request = new OrderListRequest(parameters);
        OrderListResponse response = client.getTiktokResponse(request, accessToken);

        System.out.println(JSON.toJSONString(response.getContents(), SerializerFeature.PrettyFormat));

    }

    @Test
    public void shopOrderDetail() {
        OrderIdParameter parameter = new OrderIdParameter("4804032774411726152");
        OrderDetailRequest request = new OrderDetailRequest(parameter);
        OrderDetailResponse res = client.getTiktokResponse(request, accessToken);
        Order order = res.getContents();
        System.out.println(JSON.toJSONString(order, SerializerFeature.PrettyFormat));
    }


    @Test
    public void orderDetail() {
        OrderIdParameter parameter = new OrderIdParameter("4688001900746693110A");
        OrderDetailRequest request = new OrderDetailRequest(parameter);
        OrderDetailResponse res = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(res, SerializerFeature.PrettyFormat));
    }

    @Test
    public void logisticsCompanyList() {
        //
        LogisticsCompanyListRequest request = new LogisticsCompanyListRequest();
        LogisticsCompanyListResponse response = client.getTiktokResponse(request, accessToken);

        System.out.println(JSON.toJSONString(response.getData()));
        System.out.println(JSON.toJSONString(response));
    }
}
