package xyz.bekey.tiktokOpen.domain;

public class GetOutRangeResult {

    // 是否超区响应结果（超区-true；未超区-fasle）
    private Boolean is_out_range;

    // 超区原因
    private String out_range_reason;

    public Boolean getIs_out_range() {
        return is_out_range;
    }

    public void setIs_out_range(Boolean is_out_range) {
        this.is_out_range = is_out_range;
    }

    public String getOut_range_reason() {
        return out_range_reason;
    }

    public void setOut_range_reason(String out_range_reason) {
        this.out_range_reason = out_range_reason;
    }
}
