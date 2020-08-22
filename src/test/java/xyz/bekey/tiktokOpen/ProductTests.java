package xyz.bekey.tiktokOpen;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Before;
import org.junit.Test;
import xyz.bekey.tiktokOpen.request.parameters.CidParameter;
import xyz.bekey.tiktokOpen.request.parameters.ProductParameter;
import xyz.bekey.tiktokOpen.request.product.ProductDetailRequest;
import xyz.bekey.tiktokOpen.request.product.ProductGetGoodsCategoryRequest;
import xyz.bekey.tiktokOpen.response.product.ProductDetailResponse;
import xyz.bekey.tiktokOpen.response.product.ProductGetGoodsCategoryResponse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        ProductParameter parameter = new ProductParameter(3431551043593467001L, null);
        ProductDetailRequest request = new ProductDetailRequest(parameter);
        ProductDetailResponse response = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(response, SerializerFeature.PrettyFormat));


        String str = response.getData().getDescription();
        Pattern pattern = Pattern.compile("src=[\"']+http.+?[\"']+");
        Matcher matcher = pattern.matcher(str);

        System.out.println(str);
//        for (int i = 0; i < matcher.groupCount(); i++) {
//            System.out.println(matcher.group(i));
//        }
        if (matcher.find()) {
            System.out.println(matcher.groupCount());
            System.out.println(matcher.group(0));
        }

    }

    @Test
    public void addProduct() {

    }
}
