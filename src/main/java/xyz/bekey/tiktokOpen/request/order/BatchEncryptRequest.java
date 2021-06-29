package xyz.bekey.tiktokOpen.request.order;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.BatchEncryptParameters;
import xyz.bekey.tiktokOpen.request.parameters.OrderIdParameter;
import xyz.bekey.tiktokOpen.response.order.BatchEncryptResponse;
import xyz.bekey.tiktokOpen.response.order.OrderDetailResponse;

public class BatchEncryptRequest extends TiktokOpenRequest<BatchEncryptParameters, BatchEncryptResponse> {

    public BatchEncryptRequest(BatchEncryptParameters parameter){
        super(parameter);
    }

    @Override
    public Class<BatchEncryptResponse> getResponseType() {
        return BatchEncryptResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/order/batchEncrypt";
    }
}
