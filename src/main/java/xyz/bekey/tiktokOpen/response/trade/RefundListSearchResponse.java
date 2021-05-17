package xyz.bekey.tiktokOpen.response.trade;

import xyz.bekey.tiktokOpen.domain.AfterSale;
import xyz.bekey.tiktokOpen.response.AftersaleList;
import xyz.bekey.tiktokOpen.response.TiktokOpenResponse;

import java.util.List;

public class RefundListSearchResponse extends TiktokOpenResponse<AftersaleList<AfterSale>> {

    public List<AfterSale> getContent() {
        return getData().getAftersale_list();
    }

}
