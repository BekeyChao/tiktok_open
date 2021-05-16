package xyz.bekey.tiktokOpen.request.aftersale;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.FirmReceiveParameters;
import xyz.bekey.tiktokOpen.response.aftersale.FirmReceiveResponse;

public class FirmReceiveRequest extends TiktokOpenRequest<FirmReceiveParameters, FirmReceiveResponse> {

    public FirmReceiveRequest(FirmReceiveParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<FirmReceiveResponse> getResponseType() {
        return FirmReceiveResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/afterSale/firmReceive";
    }
}
