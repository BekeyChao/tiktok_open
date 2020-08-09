package xyz.bekey.tiktokOpen;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.bekey.tiktokOpen.request.parameters.CidParameter;
import xyz.bekey.tiktokOpen.request.product.ProductGetGoodsCategoryRequest;
import xyz.bekey.tiktokOpen.response.product.ProductGetGoodsCategoryResponse;

public class ProductTests {

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
    public void productGetCategoryTest() {
        CidParameter cidParameter = new CidParameter(0L);
        ProductGetGoodsCategoryRequest request = new ProductGetGoodsCategoryRequest(cidParameter);
        ProductGetGoodsCategoryResponse response = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(response, SerializerFeature.PrettyFormat));

    }

    @Test
    public void addProduct() {

    }
}
