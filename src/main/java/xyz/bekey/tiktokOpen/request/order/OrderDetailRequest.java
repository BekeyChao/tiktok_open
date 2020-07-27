package xyz.bekey.tiktokOpen.request.order;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.OrderIdParameter;
import xyz.bekey.tiktokOpen.response.order.OrderDetailResponse;

public class OrderDetailRequest extends TiktokOpenRequest<OrderIdParameter, OrderDetailResponse> {

    public OrderDetailRequest(OrderIdParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<OrderDetailResponse> getResponseType() {
        return OrderDetailResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/order/detail";
    }
}
