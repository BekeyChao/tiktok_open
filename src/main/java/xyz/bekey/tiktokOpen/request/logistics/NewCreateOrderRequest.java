package xyz.bekey.tiktokOpen.request.logistics;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.NewCreateOrderParameters;
import xyz.bekey.tiktokOpen.response.logistics.NewCreateOrderResponse;

public class NewCreateOrderRequest extends TiktokOpenRequest<NewCreateOrderParameters, NewCreateOrderResponse>{

    public NewCreateOrderRequest(NewCreateOrderParameters parameters){
        super(parameters);
    }

    @Override
    public Class<NewCreateOrderResponse> getResponseType() {
        return NewCreateOrderResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/logistics/newCreateOrder";
    }

    @Override
    public boolean orderRequired() {
        return true;
    }
}
