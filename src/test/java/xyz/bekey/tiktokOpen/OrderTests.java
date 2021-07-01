package xyz.bekey.tiktokOpen;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Before;
import org.junit.Test;
import xyz.bekey.tiktokOpen.domain.*;
import xyz.bekey.tiktokOpen.request.order.*;
import xyz.bekey.tiktokOpen.request.parameters.*;
import xyz.bekey.tiktokOpen.request.logistics.*;
import xyz.bekey.tiktokOpen.response.order.*;
import xyz.bekey.tiktokOpen.response.logistics.*;

import java.time.LocalDateTime;
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
        OrderIdParameter parameter = new OrderIdParameter("4799270329997250121");
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
        List<Encrypt> list = Arrays.asList(new Encrypt("南岔区兴林小区", "4799297895116734430", true, 1),
                new Encrypt("任桂荣", "4799297895116734430", true, 2), new Encrypt("18845829005", "4799297895116734430", true, 3));
        parameters.setBatch_encrypt_list(list);
        BatchEncryptRequest request = new BatchEncryptRequest(parameters);
        BatchEncryptResponse res = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(res));
    }

    @Test
    public void testNewCreateOrder() {
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
        orderInfo.setOrder_id("4814826740189544201");
        NewCreateOrderParameters.OrderInfo.ReceiverInfo receiverInfo = new NewCreateOrderParameters.OrderInfo.ReceiverInfo();
        LogisticsAddress rAddress = new LogisticsAddress();
        rAddress.setCountry_code("CHN");
//        哈尔滨市南岗区宣西小区2号楼4单元504 秦松竹,13349416761,
        rAddress.setProvince_name("黑龙江省");
        rAddress.setCity_name("哈尔滨市");
        rAddress.setDistrict_name("南岗区");
        rAddress.setDetail_address("宣西小区2号楼4单元504");
        receiverInfo.setAddress(rAddress);
        LogisticsContact rContact = new LogisticsContact();
        rContact.setName("秦松竹");
        rContact.setMobile("13349416761");
        receiverInfo.setContact(rContact);
        orderInfo.setReceiver_info(receiverInfo);
        NewCreateOrderParameters.OrderInfo.Item item = new NewCreateOrderParameters.OrderInfo.Item();
        item.setItem_name("蓝色S(80-105)");
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

        TemplateRequest request = new TemplateRequest(NoParameters.getInstance());
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

    @Test
    public void testGetShopKey(){

        GetShopKeyRequest request = new GetShopKeyRequest(NoParameters.getInstance());
        GetShopKeyResponse response = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void testBatchSensitiveOrDecrypt(){

        BatchSenOrDecParameters.CipherInfo cipherInfo = new BatchSenOrDecParameters.CipherInfo();
        cipherInfo.setAuth_id("4812210357787483422");
        cipherInfo.setCipher_text("$xnZagfIcafy84mbvohjTHvmX4uAoFpCHclCjJgUadX8=$4I6aijG0MBGPWi920albh5TjMm0f6aBF2YwW7WeHm1x9T4INlKg9lvIQEPECs9I+rEPGrAcoeP3KSBAkpUJsW2luEcR+u0ZZ1E6k0Lk=*CgwIARCtHBiqICABKAESPgo8aDPVvPcR3Fp1110Z2CnzBncJkCZjMi7YdVwiL4g46LUeUIS9zuBlPr9LTyt7AuEs0EQwxirtqesychhiGgA=$1$$");
        BatchSenOrDecParameters parameters = new BatchSenOrDecParameters();
        parameters.setCipher_infos(Arrays.asList(cipherInfo));
        BatchSensitiveRequest request = new BatchSensitiveRequest(parameters);
        BatchSensitiveResponse response = client.getTiktokResponse(request, accessToken);
        BatchDecryptRequest batchDecryptRequest = new BatchDecryptRequest(parameters);
        BatchDecryptResponse tiktokResponse = client.getTiktokResponse(batchDecryptRequest, accessToken);
        System.out.println(JSON.toJSONString(response));
        System.out.println(JSON.toJSONString(tiktokResponse));
    }

    @Test
    public void testEncryptToDecrypt(){

        OrderIdParameter parameter = new OrderIdParameter("4746123459786217313");
        OrderDetailRequest request = new OrderDetailRequest(parameter);
        OrderDetailResponse res = client.getTiktokResponse(request, accessToken);
        Order order = res.getContents();
        System.out.println("姓名：" + order.getEncrypt_post_receiver());
        System.out.println("联系电话：" + order.getEncrypt_post_tel());
        System.out.println("收件地址：" + order.getPost_addr().getEncrypt_detail());

        BatchSenOrDecParameters.CipherInfo cipherInfo1 = new BatchSenOrDecParameters.CipherInfo();
        cipherInfo1.setAuth_id(order.getOrder_id());
        cipherInfo1.setCipher_text(order.getEncrypt_post_receiver());
        BatchSenOrDecParameters.CipherInfo cipherInfo2 = new BatchSenOrDecParameters.CipherInfo();
        cipherInfo2.setAuth_id(order.getOrder_id());
        cipherInfo2.setCipher_text(order.getEncrypt_post_tel());
        BatchSenOrDecParameters.CipherInfo cipherInfo3 = new BatchSenOrDecParameters.CipherInfo();
        cipherInfo3.setAuth_id(order.getOrder_id());
        cipherInfo3.setCipher_text(order.getPost_addr().getEncrypt_detail());
        BatchSenOrDecParameters parameters = new BatchSenOrDecParameters();
        parameters.setCipher_infos(Arrays.asList(cipherInfo1,cipherInfo2,cipherInfo3));
        BatchSensitiveRequest sRequest = new BatchSensitiveRequest(parameters);
        BatchSensitiveResponse response = client.getTiktokResponse(sRequest, accessToken);
        System.out.println("姓名：" + response.getData().getDecrypt_infos().get(0).getDecrypt_text());
        System.out.println("联系电话：" + response.getData().getDecrypt_infos().get(1).getDecrypt_text());
        System.out.println("收件地址：" + response.getData().getDecrypt_infos().get(2).getDecrypt_text());

        BatchDecryptRequest batchDecryptRequest = new BatchDecryptRequest(parameters);
        BatchDecryptResponse tiktokResponse = client.getTiktokResponse(batchDecryptRequest, accessToken);
        System.out.println("姓名：" + tiktokResponse.getData().getDecrypt_infos().get(0).getDecrypt_text());
        System.out.println("联系电话：" + tiktokResponse.getData().getDecrypt_infos().get(1).getDecrypt_text());
        System.out.println("收件地址：" + tiktokResponse.getData().getDecrypt_infos().get(2).getDecrypt_text());

    }
}
