package xyz.bekey.tiktokOpen.request.print;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.WaybillApplyParameter;
import xyz.bekey.tiktokOpen.response.print.WaybillApplyResponse;

public class WaybillApplyRequest extends TiktokOpenRequest<WaybillApplyParameter, WaybillApplyResponse> {

    public WaybillApplyRequest(WaybillApplyParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<WaybillApplyResponse> getResponseType() {
        return WaybillApplyResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/logistics/waybillApply";
    }
}
