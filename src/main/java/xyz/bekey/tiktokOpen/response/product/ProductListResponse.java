package xyz.bekey.tiktokOpen.response.product;

import com.alibaba.fastjson.annotation.JSONField;
import xyz.bekey.tiktokOpen.domain.Product;
import xyz.bekey.tiktokOpen.response.PageData;
import xyz.bekey.tiktokOpen.response.TiktokOpenResponse;

import java.util.ArrayList;
import java.util.List;

public class ProductListResponse extends TiktokOpenResponse<PageData<Product>> {

    @JSONField(serialize = false,deserialize = false)
    public List<Product> getContents() {
        if (getData() != null && getData().getData() != null)
            return getData().getData();
        return new ArrayList<>();
    }

}
