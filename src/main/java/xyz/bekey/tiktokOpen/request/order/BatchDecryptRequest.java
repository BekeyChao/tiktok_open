package xyz.bekey.tiktokOpen.request.order;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.BatchSenOrDecParameters;
import xyz.bekey.tiktokOpen.response.order.BatchDecryptResponse;

public class BatchDecryptRequest extends TiktokOpenRequest<BatchSenOrDecParameters, BatchDecryptResponse> {


    public BatchDecryptRequest(BatchSenOrDecParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<BatchDecryptResponse> getResponseType() {
        return BatchDecryptResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/order/batchDecrypt";
    }
}
