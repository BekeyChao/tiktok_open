package xyz.bekey.tiktokOpen.request.spec;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.SpecAddParameters;
import xyz.bekey.tiktokOpen.response.spec.SpecAddResponse;


/**
 * 添加规格
 */
public class SpecAddRequest extends TiktokOpenRequest<SpecAddParameters, SpecAddResponse> {

    public SpecAddRequest(SpecAddParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<SpecAddResponse> getResponseType() {
        return SpecAddResponse.class;
    }


    @Override
    public String getContentPath() {
        return "/spec/add";
    }
}
