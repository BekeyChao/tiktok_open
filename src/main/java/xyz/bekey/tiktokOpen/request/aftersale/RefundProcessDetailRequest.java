package xyz.bekey.tiktokOpen.request.aftersale;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.OrderIdParameter;
import xyz.bekey.tiktokOpen.response.aftersale.RefundProcessDetailResponse;

public class RefundProcessDetailRequest extends TiktokOpenRequest<OrderIdParameter, RefundProcessDetailResponse> {

    public RefundProcessDetailRequest(OrderIdParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<RefundProcessDetailResponse> getResponseType() {
        return RefundProcessDetailResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/afterSale/refundProcessDetail";
    }
}
