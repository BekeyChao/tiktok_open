package xyz.bekey.tiktokOpen.request.print;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.CancelOrderParameters;
import xyz.bekey.tiktokOpen.response.print.CancelOrderResponse;

public class CancelOrderRequest extends TiktokOpenRequest<CancelOrderParameters, CancelOrderResponse> {

    public CancelOrderRequest(CancelOrderParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<CancelOrderResponse> getResponseType() {
        return CancelOrderResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/logistics/cancelOrder";
    }
}
