package xyz.bekey.tiktokOpen.request.logistics;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.CustomTemplateParameter;
import xyz.bekey.tiktokOpen.response.logistics.CustomTemplateResponse;

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

    @Override
    public boolean orderRequired() {
        return true;
    }
}
