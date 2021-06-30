package xyz.bekey.tiktokOpen.request.print;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.GetShopKeyParameter;
import xyz.bekey.tiktokOpen.request.parameters.NoParameters;
import xyz.bekey.tiktokOpen.response.print.GetShopKeyResponse;

public class GetShopKeyRequest extends TiktokOpenRequest<NoParameters, GetShopKeyResponse> {

    public GetShopKeyRequest(NoParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<GetShopKeyResponse> getResponseType() {
        return GetShopKeyResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/logistics/getShopKey";
    }
}
