package xyz.bekey.tiktokOpen.request.order;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.NoParameters;
import xyz.bekey.tiktokOpen.response.order.LogisticsCompanyListResponse;

public class LogisticsCompanyListRequest extends TiktokOpenRequest<NoParameters, LogisticsCompanyListResponse> {

    public LogisticsCompanyListRequest() {
        super(NoParameters.getInstance());
    }

    public LogisticsCompanyListRequest(NoParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<LogisticsCompanyListResponse> getResponseType() {
        return LogisticsCompanyListResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/order/logisticsCompanyList";
    }

    @Override
    public boolean orderRequired() {
        return true;
    }
}
