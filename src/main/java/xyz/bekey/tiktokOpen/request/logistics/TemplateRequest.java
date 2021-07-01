package xyz.bekey.tiktokOpen.request.logistics;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.NoParameters;
import xyz.bekey.tiktokOpen.response.logistics.TemplateResponse;

public class TemplateRequest extends TiktokOpenRequest<NoParameters, TemplateResponse> {

    public TemplateRequest(NoParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<TemplateResponse> getResponseType() {
        return TemplateResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/logistics/templateList";
    }

    @Override
    public boolean orderRequired() {
        return true;
    }
}
