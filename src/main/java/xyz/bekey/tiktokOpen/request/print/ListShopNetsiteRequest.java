package xyz.bekey.tiktokOpen.request.print;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.ListShopNetsiteParameter;
import xyz.bekey.tiktokOpen.request.parameters.NewCreateOrderParameters;
import xyz.bekey.tiktokOpen.response.print.ListShopNetsiteResponse;
import xyz.bekey.tiktokOpen.response.print.NewCreateOrderResponse;

public class ListShopNetsiteRequest extends TiktokOpenRequest<ListShopNetsiteParameter, ListShopNetsiteResponse> {

    public ListShopNetsiteRequest(ListShopNetsiteParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<ListShopNetsiteResponse> getResponseType() {
        return ListShopNetsiteResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/logistics/listShopNetsite";
    }
}
