package xyz.bekey.tiktokOpen.request.order;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.OrderLogisticsAddParameters;
import xyz.bekey.tiktokOpen.response.order.OrderLogisticsAddResponse;

public class OrderLogisticsAddRequest extends TiktokOpenRequest<OrderLogisticsAddParameters, OrderLogisticsAddResponse> {

    public OrderLogisticsAddRequest(OrderLogisticsAddParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<OrderLogisticsAddResponse> getResponseType() {
        return OrderLogisticsAddResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/order/logisticsAdd";
    }

    @Override
    public boolean orderRequired() {
        return true;
    }
}
