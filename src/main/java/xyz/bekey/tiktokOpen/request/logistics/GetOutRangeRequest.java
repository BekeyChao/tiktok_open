package xyz.bekey.tiktokOpen.request.logistics;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.GetOutRangeParameter;
import xyz.bekey.tiktokOpen.response.logistics.GetOutRangeResponse;

public class GetOutRangeRequest extends TiktokOpenRequest<GetOutRangeParameter, GetOutRangeResponse> {


    public GetOutRangeRequest(GetOutRangeParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<GetOutRangeResponse> getResponseType() {
        return GetOutRangeResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/logistics/getOutRange";
    }

    @Override
    public boolean orderRequired() {
        return true;
    }
}
