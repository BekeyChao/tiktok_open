package xyz.bekey.tiktokOpen.request.order;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.AddOrderRemarkParameters;
import xyz.bekey.tiktokOpen.response.order.OrderAddOrderRemarkResponse;

public class OrderAddOrderRemarkRequest extends TiktokOpenRequest<AddOrderRemarkParameters, OrderAddOrderRemarkResponse> {

    public OrderAddOrderRemarkRequest(AddOrderRemarkParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<OrderAddOrderRemarkResponse> getResponseType() {
        return OrderAddOrderRemarkResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/order/addOrderRemark";
    }
}
