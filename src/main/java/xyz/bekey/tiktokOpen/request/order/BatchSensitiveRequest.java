package xyz.bekey.tiktokOpen.request.order;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.BatchSenOrDecParameters;
import xyz.bekey.tiktokOpen.response.order.BatchSensitiveResponse;

public class BatchSensitiveRequest extends TiktokOpenRequest<BatchSenOrDecParameters, BatchSensitiveResponse> {

    public BatchSensitiveRequest(BatchSenOrDecParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<BatchSensitiveResponse> getResponseType() {
        return BatchSensitiveResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/order/batchSensitive";
    }

    @Override
    public boolean orderRequired() {
        return true;
    }
}
