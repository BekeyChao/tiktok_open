package xyz.bekey.tiktokOpen.request.order;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.OrderIdParameter;
import xyz.bekey.tiktokOpen.response.order.OrderDetailResponse;

public class OrderDetailRequest extends TiktokOpenRequest<OrderIdParameter, OrderDetailResponse> {

    public OrderDetailRequest(OrderIdParameter parameter) {
        super(parameter);
        setLogLevel(0);
    }

    @Override
    public Class<OrderDetailResponse> getResponseType() {
        return OrderDetailResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/order/detail";
    }

    // 长年累月数据量很大 根据需求调整
//    @Override
//    public boolean infoEnabled() {
//        return false;
//    }
}
