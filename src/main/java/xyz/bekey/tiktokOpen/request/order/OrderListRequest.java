package xyz.bekey.tiktokOpen.request.order;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.OrderListParameters;
import xyz.bekey.tiktokOpen.response.order.OrderListResponse;

public class OrderListRequest extends TiktokOpenRequest<OrderListParameters, OrderListResponse> {

    public OrderListRequest(OrderListParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<OrderListResponse> getResponseType() {
        return OrderListResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/order/list";
    }

    // 不输出 info 太长
    @Override
    public boolean infoEnabled() {
        return false;
    }
}
