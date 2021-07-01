package xyz.bekey.tiktokOpen.request.logistics;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.CancelOrderParameters;
import xyz.bekey.tiktokOpen.response.logistics.CancelOrderResponse;

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

    @Override
    public boolean orderRequired() {
        return true;
    }
}
