package xyz.bekey.tiktokOpen;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Before;
import org.junit.Test;
import xyz.bekey.tiktokOpen.request.parameters.CidParameter;
import xyz.bekey.tiktokOpen.request.parameters.ProductIdParameter;
import xyz.bekey.tiktokOpen.request.product.ProductDetailRequest;
import xyz.bekey.tiktokOpen.request.product.ProductGetGoodsCategoryRequest;
import xyz.bekey.tiktokOpen.response.product.ProductDetailResponse;
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
    public void productDetail() {
        ProductIdParameter parameter = new ProductIdParameter(3431551043593467001L, null);
        ProductDetailRequest request = new ProductDetailRequest(parameter);
        ProductDetailResponse response = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(response, SerializerFeature.PrettyFormat));
    }

    @Test
    public void addProduct() {

    }
}
