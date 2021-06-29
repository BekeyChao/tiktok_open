package xyz.bekey.tiktokOpen.request.print;

import xyz.bekey.tiktokOpen.domain.WaybillInfo;
import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.CustomTemplateParameter;
import xyz.bekey.tiktokOpen.response.print.CustomTemplateResponse;

public class CustomTemplateRequest extends TiktokOpenRequest<CustomTemplateParameter, CustomTemplateResponse> {

    public CustomTemplateRequest(CustomTemplateParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<CustomTemplateResponse> getResponseType() {
        return CustomTemplateResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/logistics/customTemplateList";
    }
}
