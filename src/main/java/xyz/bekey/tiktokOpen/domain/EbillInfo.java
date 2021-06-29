package xyz.bekey.tiktokOpen.domain;

public class EbillInfo {

    // 订单id
    private String order_id;

    // 包裹id
    private String pack_id;

    // 运单号
    private String track_no;

    // 分拣码（三段码）
    private String sort_code;

    // 集包地代码
    private String package_center_code;

    // 集包名称
    private String package_center_name;

    // 大头笔编码
    private String short_address_code;

    // 大头笔名称
    private String short_address_name;

    // 扩展字段
    private String extra_resp;

    // 子母件列表英文逗号分隔
    private String sub_waybill_codes;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getPack_id() {
        return pack_id;
    }

    public void setPack_id(String pack_id) {
        this.pack_id = pack_id;
    }

    public String getTrack_no() {
        return track_no;
    }

    public void setTrack_no(String track_no) {
        this.track_no = track_no;
    }

    public String getSort_code() {
        return sort_code;
    }

    public void setSort_code(String sort_code) {
        this.sort_code = sort_code;
    }

    public String getPackage_center_code() {
        return package_center_code;
    }

    public void setPackage_center_code(String package_center_code) {
        this.package_center_code = package_center_code;
    }

    public String getPackage_center_name() {
        return package_center_name;
    }

    public void setPackage_center_name(String package_center_name) {
        this.package_center_name = package_center_name;
    }

    public String getShort_address_code() {
        return short_address_code;
    }

    public void setShort_address_code(String short_address_code) {
        this.short_address_code = short_address_code;
    }

    public String getShort_address_name() {
        return short_address_name;
    }

    public void setShort_address_name(String short_address_name) {
        this.short_address_name = short_address_name;
    }

    public String getExtra_resp() {
        return extra_resp;
    }

    public void setExtra_resp(String extra_resp) {
        this.extra_resp = extra_resp;
    }

    public String getSub_waybill_codes() {
        return sub_waybill_codes;
    }

    public void setSub_waybill_codes(String sub_waybill_codes) {
        this.sub_waybill_codes = sub_waybill_codes;
    }
}
