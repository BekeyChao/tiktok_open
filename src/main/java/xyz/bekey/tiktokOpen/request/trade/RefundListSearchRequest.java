package xyz.bekey.tiktokOpen.request.trade;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.RefundListSearchParameters;
import xyz.bekey.tiktokOpen.response.trade.RefundListSearchResponse;

public class RefundListSearchRequest extends TiktokOpenRequest<RefundListSearchParameters, RefundListSearchResponse> {

    public RefundListSearchRequest(RefundListSearchParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<RefundListSearchResponse> getResponseType() {
        return RefundListSearchResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/trade/refundListSearch";
    }
}
