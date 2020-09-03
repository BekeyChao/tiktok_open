package xyz.bekey.tiktokOpen.domain;

public class AllianceInfo {

    // 作者账号(抖音/火山作者)
    private String author_account;
    // 实际值的10000倍,譬如佣金率是10%, 该值为0.1*10000=1000
    private Integer commission_rate;
    // 火山/抖音号id
    private Long short_id;
    // 实际佣金,单位是分
    private Integer real_commission;

    public String getAuthor_account() {
        return author_account;
    }

    public void setAuthor_account(String author_account) {
        this.author_account = author_account;
    }

    public Integer getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(Integer commission_rate) {
        this.commission_rate = commission_rate;
    }

    public Long getShort_id() {
        return short_id;
    }

    public void setShort_id(Long short_id) {
        this.short_id = short_id;
    }

    public Integer getReal_commission() {
        return real_commission;
    }

    public void setReal_commission(Integer real_commission) {
        this.real_commission = real_commission;
    }
}
