package xyz.bekey.tiktokOpen.request.freightTemplate;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.NamePageParameters;
import xyz.bekey.tiktokOpen.response.freightTemplate.FreightTemplateResponse;

public class FreightTemplateListRequest extends TiktokOpenRequest<NamePageParameters, FreightTemplateResponse> {

    public FreightTemplateListRequest(NamePageParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<FreightTemplateResponse> getResponseType() {
        return FreightTemplateResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/freightTemplate/list";
    }
}
