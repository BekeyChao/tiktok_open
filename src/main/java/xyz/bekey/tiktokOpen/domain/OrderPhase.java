package xyz.bekey.tiktokOpen.domain;

public class OrderPhase {

    private String phase_order_id;

    private Integer total_phase;

    private Integer current_phase;

    private Boolean pay_success;

    private String sku_order_id;

    private Long campaign_id;

    private Integer phase_payable_price;

    private Integer phase_pay_type;

    private Long phase_open_time;

    private Long phase_pay_time;

    private Long phase_close_time;

    private String channel_payment_no;

    private Integer phase_order_amount;

    private Integer phase_sum_amount;

    private Integer phase_post_amount;

    private Integer phase_pay_amount;

    private Integer phase_promotion_amount;

    private String current_phase_status_desc;

    private Integer sku_price;

    public String getPhase_order_id() {
        return phase_order_id;
    }

    public void setPhase_order_id(String phase_order_id) {
        this.phase_order_id = phase_order_id;
    }

    public Integer getTotal_phase() {
        return total_phase;
    }

    public void setTotal_phase(Integer total_phase) {
        this.total_phase = total_phase;
    }

    public Integer getCurrent_phase() {
        return current_phase;
    }

    public void setCurrent_phase(Integer current_phase) {
        this.current_phase = current_phase;
    }

    public Boolean getPay_success() {
        return pay_success;
    }

    public void setPay_success(Boolean pay_success) {
        this.pay_success = pay_success;
    }

    public String getSku_order_id() {
        return sku_order_id;
    }

    public void setSku_order_id(String sku_order_id) {
        this.sku_order_id = sku_order_id;
    }

    public Long getCampaign_id() {
        return campaign_id;
    }

    public void setCampaign_id(Long campaign_id) {
        this.campaign_id = campaign_id;
    }

    public Integer getPhase_payable_price() {
        return phase_payable_price;
    }

    public void setPhase_payable_price(Integer phase_payable_price) {
        this.phase_payable_price = phase_payable_price;
    }

    public Integer getPhase_pay_type() {
        return phase_pay_type;
    }

    public void setPhase_pay_type(Integer phase_pay_type) {
        this.phase_pay_type = phase_pay_type;
    }

    public Long getPhase_open_time() {
        return phase_open_time;
    }

    public void setPhase_open_time(Long phase_open_time) {
        this.phase_open_time = phase_open_time;
    }

    public Long getPhase_pay_time() {
        return phase_pay_time;
    }

    public void setPhase_pay_time(Long phase_pay_time) {
        this.phase_pay_time = phase_pay_time;
    }

    public Long getPhase_close_time() {
        return phase_close_time;
    }

    public void setPhase_close_time(Long phase_close_time) {
        this.phase_close_time = phase_close_time;
    }

    public String getChannel_payment_no() {
        return channel_payment_no;
    }

    public void setChannel_payment_no(String channel_payment_no) {
        this.channel_payment_no = channel_payment_no;
    }

    public Integer getPhase_order_amount() {
        return phase_order_amount;
    }

    public void setPhase_order_amount(Integer phase_order_amount) {
        this.phase_order_amount = phase_order_amount;
    }

    public Integer getPhase_sum_amount() {
        return phase_sum_amount;
    }

    public void setPhase_sum_amount(Integer phase_sum_amount) {
        this.phase_sum_amount = phase_sum_amount;
    }

    public Integer getPhase_post_amount() {
        return phase_post_amount;
    }

    public void setPhase_post_amount(Integer phase_post_amount) {
        this.phase_post_amount = phase_post_amount;
    }

    public Integer getPhase_pay_amount() {
        return phase_pay_amount;
    }

    public void setPhase_pay_amount(Integer phase_pay_amount) {
        this.phase_pay_amount = phase_pay_amount;
    }

    public Integer getPhase_promotion_amount() {
        return phase_promotion_amount;
    }

    public void setPhase_promotion_amount(Integer phase_promotion_amount) {
        this.phase_promotion_amount = phase_promotion_amount;
    }

    public String getCurrent_phase_status_desc() {
        return current_phase_status_desc;
    }

    public void setCurrent_phase_status_desc(String current_phase_status_desc) {
        this.current_phase_status_desc = current_phase_status_desc;
    }

    public Integer getSku_price() {
        return sku_price;
    }

    public void setSku_price(Integer sku_price) {
        this.sku_price = sku_price;
    }
}
