package xyz.bekey.tiktokOpen.request.spec;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.IDParameter;
import xyz.bekey.tiktokOpen.response.spec.SpecSpecDetailResponse;

/**
 * 查看规格详细
 */
public class SpecSpecDetailRequest extends TiktokOpenRequest<IDParameter,SpecSpecDetailResponse> {

    public SpecSpecDetailRequest(IDParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<SpecSpecDetailResponse> getResponseType() {
        return SpecSpecDetailResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/spec/specDetail";
    }
}
