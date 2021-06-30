package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class WaybillApplyResult {

    private List<WaybillInfo> waybill_infos;

    private List<WaybillInfo> err_infos;

    public List<WaybillInfo> getWaybill_infos() {
        return waybill_infos;
    }

    public void setWaybill_infos(List<WaybillInfo> waybill_infos) {
        this.waybill_infos = waybill_infos;
    }

    public List<WaybillInfo> getErr_infos() {
        return err_infos;
    }

    public void setErr_infos(List<WaybillInfo> err_infos) {
        this.err_infos = err_infos;
    }
}
