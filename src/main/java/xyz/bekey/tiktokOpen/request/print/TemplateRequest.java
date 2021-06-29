package xyz.bekey.tiktokOpen.request.print;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.TemplateParameter;
import xyz.bekey.tiktokOpen.response.print.TemplateResponse;

public class TemplateRequest extends TiktokOpenRequest<TemplateParameter, TemplateResponse> {

    public TemplateRequest(TemplateParameter parameter) {
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
}
