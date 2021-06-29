package xyz.bekey.tiktokOpen.request.parameters;

import xyz.bekey.tiktokOpen.domain.WaybillInfo;

import java.util.List;

public class WaybillApplyParameter {

    private List<WaybillInfo> waybill_applies;

    public List<WaybillInfo> getWaybill_applies() {
        return waybill_applies;
    }

    public void setWaybill_applies(List<WaybillInfo> waybill_applies) {
        this.waybill_applies = waybill_applies;
    }
}
