package xyz.bekey.tiktokOpen.request.spec;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.IDParameter;
import xyz.bekey.tiktokOpen.response.spec.SpecDelResponse;

/**
 * 删除规格
 * 注意 : 删除spec后将导致原有绑定该spec的sku全部失效, 请慎重操作
 */
public class SpecDelRequest extends TiktokOpenRequest<IDParameter,SpecDelResponse> {

    public SpecDelRequest(IDParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<SpecDelResponse> getResponseType() {
        return SpecDelResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/spec/del";
    }
}
