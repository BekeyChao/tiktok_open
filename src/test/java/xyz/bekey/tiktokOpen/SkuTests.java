package xyz.bekey.tiktokOpen;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Before;
import org.junit.Test;
import xyz.bekey.tiktokOpen.request.parameters.SkuAddAllParameters;
import xyz.bekey.tiktokOpen.request.sku.SkuAddAllRequest;
import xyz.bekey.tiktokOpen.response.sku.SkuAddAllResponse;

import java.util.ArrayList;

public class SkuTests {
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
    public void skuAddAll() {

//        SkuAddAllParameters parameter = new SkuAddAllParameters(1100L, new ArrayList<>());
//        SkuAddAllParameters parameter = new SkuAddAllParameters(1100L, new ArrayList<>());
//
//        SkuAddAllRequest request = new SkuAddAllRequest(parameter);
//        SkuAddAllResponse response = client.getTiktokResponse(request, accessToken);
//        System.out.println(JSON.toJSONString(response, SerializerFeature.PrettyFormat));
    }
}
