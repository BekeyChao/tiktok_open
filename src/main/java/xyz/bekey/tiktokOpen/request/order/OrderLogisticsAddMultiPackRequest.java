package xyz.bekey.tiktokOpen.request.order;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.MultiPackParameters;
import xyz.bekey.tiktokOpen.response.order.OrderLogisticsAddMultiPackResponse;

public class OrderLogisticsAddMultiPackRequest extends TiktokOpenRequest<MultiPackParameters, OrderLogisticsAddMultiPackResponse> {

    public OrderLogisticsAddMultiPackRequest(MultiPackParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<OrderLogisticsAddMultiPackResponse> getResponseType() {
        return OrderLogisticsAddMultiPackResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/order/logisticsAddMultiPack";
    }
}
