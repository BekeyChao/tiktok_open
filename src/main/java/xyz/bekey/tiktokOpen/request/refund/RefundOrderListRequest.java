package xyz.bekey.tiktokOpen.request.refund;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.OrderListParameters;
import xyz.bekey.tiktokOpen.response.refund.RefundOrderListResponse;

public class RefundOrderListRequest extends TiktokOpenRequest<OrderListParameters, RefundOrderListResponse> {

    public RefundOrderListRequest(OrderListParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<RefundOrderListResponse> getResponseType() {
        return RefundOrderListResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/refund/orderList";
    }
}
