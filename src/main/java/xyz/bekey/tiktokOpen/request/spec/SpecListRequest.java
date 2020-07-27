package xyz.bekey.tiktokOpen.request.spec;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.NoParameters;
import xyz.bekey.tiktokOpen.response.spec.SpecListResponse;

/**、
 * 获取规格列表
 */
public class SpecListRequest extends TiktokOpenRequest<NoParameters,SpecListResponse> {

    public SpecListRequest() {
        super(NoParameters.getInstance());
    }

    @Override
    public Class<SpecListResponse> getResponseType() {
        return SpecListResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/spec/list";
    }
}
