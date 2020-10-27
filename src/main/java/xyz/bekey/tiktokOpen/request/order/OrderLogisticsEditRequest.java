package xyz.bekey.tiktokOpen.request.order;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.OrderLogisticsAddParameters;
import xyz.bekey.tiktokOpen.response.order.LogisticsEditResponse;

public class OrderLogisticsEditRequest extends TiktokOpenRequest<OrderLogisticsAddParameters, LogisticsEditResponse> {

    public OrderLogisticsEditRequest(OrderLogisticsAddParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<LogisticsEditResponse> getResponseType() {
        return LogisticsEditResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/order/logisticsEdit";
    }
}
