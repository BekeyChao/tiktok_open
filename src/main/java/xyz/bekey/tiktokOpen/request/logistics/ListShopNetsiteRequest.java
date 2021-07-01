package xyz.bekey.tiktokOpen.request.logistics;

import xyz.bekey.tiktokOpen.request.TiktokOpenRequest;
import xyz.bekey.tiktokOpen.request.parameters.ListShopNetsiteParameter;
import xyz.bekey.tiktokOpen.response.logistics.ListShopNetsiteResponse;

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

    @Override
    public boolean orderRequired() {
        return true;
    }
}
