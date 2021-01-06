package xyz.bekey.tiktokOpen.response.freightTemplate;

import com.alibaba.fastjson.annotation.JSONField;
import xyz.bekey.tiktokOpen.domain.FreightTemplate;
import xyz.bekey.tiktokOpen.response.ListPage;
import xyz.bekey.tiktokOpen.response.TiktokOpenResponse;

import java.util.ArrayList;
import java.util.List;

public class FreightTemplateResponse extends TiktokOpenResponse<ListPage<FreightTemplate>> {

    @JSONField(serialize = false, deserialize = false)
    public List<FreightTemplate> getContents() {
        if (getData() != null) {
            return getData().getList();
        }
        return new ArrayList<>();
    }

}
