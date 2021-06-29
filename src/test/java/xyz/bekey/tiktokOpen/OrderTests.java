package xyz.bekey.tiktokOpen;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Before;
import org.junit.Test;
import xyz.bekey.tiktokOpen.domain.*;
import xyz.bekey.tiktokOpen.domain.enums.OrderStatus;
import xyz.bekey.tiktokOpen.domain.enums.SortBy;
import xyz.bekey.tiktokOpen.request.order.BatchEncryptRequest;
import xyz.bekey.tiktokOpen.request.order.LogisticsCompanyListRequest;
import xyz.bekey.tiktokOpen.request.order.OrderDetailRequest;
import xyz.bekey.tiktokOpen.request.order.OrderListRequest;
import xyz.bekey.tiktokOpen.request.parameters.*;
import xyz.bekey.tiktokOpen.request.print.*;
import xyz.bekey.tiktokOpen.response.order.BatchEncryptResponse;
import xyz.bekey.tiktokOpen.response.order.LogisticsCompanyListResponse;
import xyz.bekey.tiktokOpen.response.order.OrderDetailResponse;
import xyz.bekey.tiktokOpen.response.order.OrderListResponse;
import xyz.bekey.tiktokOpen.response.print.*;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public void shopOrderList() {

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
        OrderIdParameter parameter = new OrderIdParameter("4812562403373821641");
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

    @Test
    public void batchEncrypt() {
        BatchEncryptParameters parameters = new BatchEncryptParameters();
        List<Encrypt> list = Arrays.asList(new Encrypt("江夏大道31号(华一寄宿学校旁)保利·海上五月花2期", "4812210357787483422", true, 1),
                new Encrypt("魏爽", "4812210357787483422", true, 2), new Encrypt("13100656623", "4812210357787483422", true, 3));
        parameters.setBatch_encrypt_list(list);
        BatchEncryptRequest request = new BatchEncryptRequest(parameters);
        BatchEncryptResponse res = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(res));
    }

    @Test
    public void testPrint() {
        // 传入sender相关信息
        LogisticsAddress sAddress = new LogisticsAddress();
        sAddress.setCountry_code("CHN");
        sAddress.setProvince_name("广东省");
        sAddress.setCity_name("广州市");
        sAddress.setDistrict_name("番禺区");
        sAddress.setDetail_address("毅播仓储物流中心");
        LogisticsContact sContact = new LogisticsContact();
        sContact.setName("方先生");
        sContact.setMobile("18818818818");
        NewCreateOrderParameters.SenderInfo senderInfo = new NewCreateOrderParameters.SenderInfo();
        senderInfo.setAddress(sAddress);
        senderInfo.setContact(sContact);

        // 传入order相关信息
        NewCreateOrderParameters.OrderInfo orderInfo = new NewCreateOrderParameters.OrderInfo();
        orderInfo.setOrder_id("4799270329997250121");
        NewCreateOrderParameters.OrderInfo.ReceiverInfo receiverInfo = new NewCreateOrderParameters.OrderInfo.ReceiverInfo();
        LogisticsAddress rAddress = new LogisticsAddress();
        rAddress.setCountry_code("CHN");
        rAddress.setProvince_name("广东省");
        rAddress.setCity_name("广州市");
        rAddress.setDistrict_name("越秀区");
        rAddress.setDetail_address("世贸服装城");
        receiverInfo.setAddress(rAddress);
        LogisticsContact rContact = new LogisticsContact();
        rContact.setName("方先生");
        rContact.setMobile("18818818818");
        receiverInfo.setContact(rContact);
        orderInfo.setReceiver_info(receiverInfo);
        NewCreateOrderParameters.OrderInfo.Item item = new NewCreateOrderParameters.OrderInfo.Item();
        item.setItem_name("杨A1B050-1625-蓝色均码");
        item.setItem_count(1);
        item.setItem_specs("测试");
        orderInfo.setItems(Arrays.asList(item));

        NewCreateOrderParameters parameters = new NewCreateOrderParameters();
        parameters.setSender_info(senderInfo);
        parameters.setOrder_infos(Arrays.asList(orderInfo));
        parameters.setLogistics_code("yuantong");

        NewCreateOrderRequest request = new NewCreateOrderRequest(parameters);
        NewCreateOrderResponse response = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void testListShopNetsite(){

        String logistics_code = "yuantong";
        ListShopNetsiteParameter parameter = new ListShopNetsiteParameter();
        parameter.setLogistics_code(logistics_code);
        ListShopNetsiteRequest request = new ListShopNetsiteRequest(parameter);
        ListShopNetsiteResponse response = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void testGetOutRange(){

        String logistics_code = "huitongkuaidi";
        LogisticsAddress address = new LogisticsAddress();
        address.setProvince_name("广东省");
        address.setCity_name("广州市");
        address.setDistrict_name("越秀区");
        address.setDetail_address("站前路195号-115档广州世贸服装城(黑山九街)");
        GetOutRangeParameter parameter = new GetOutRangeParameter();
        parameter.setLogistics_code(logistics_code);
        parameter.setReceiver_address(address);
        parameter.setType(2);
        GetOutRangeRequest request = new GetOutRangeRequest(parameter);
        GetOutRangeResponse response = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(response));

    }

    @Test
    public void testTemplate(){
        TemplateParameter parameter = new TemplateParameter();
        TemplateRequest request = new TemplateRequest(parameter);
        TemplateResponse response = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void testWaybillApply(){

        String track_no = "YT3201620199296";
        String logistics_code = "yuantong";
        WaybillInfo waybillInfo = new WaybillInfo();
        waybillInfo.setLogistics_code(logistics_code);
        waybillInfo.setTrack_no(track_no);
        WaybillApplyParameter parameter = new WaybillApplyParameter();
        parameter.setWaybill_applies(Arrays.asList(waybillInfo));
        WaybillApplyRequest request = new WaybillApplyRequest(parameter);

        WaybillApplyResponse response = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void testCustomTemplate(){

        String logistics_code = "yuantong";
        CustomTemplateParameter parameter = new CustomTemplateParameter();
        parameter.setLogistics_code(logistics_code);
        CustomTemplateRequest request = new CustomTemplateRequest(parameter);
        CustomTemplateResponse response = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(response));
    }
}
