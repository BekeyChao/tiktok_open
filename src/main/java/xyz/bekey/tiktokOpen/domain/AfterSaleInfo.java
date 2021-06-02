package xyz.bekey.tiktokOpen.domain;

public class AfterSaleInfo {

    // 售后状态，
    // 0 售后初始
    //6 售后申请
    //27 拒绝售后申请
    //12 售后成功
    //28 售后失败
    //7 售后退货中
    //11 售后已发货
    //29 售后退货拒绝
    //13 售后换货商家发货
    //14 售后换货用户收货
    private Integer after_sale_status;

    // 售后类型，售后退货退款0  售后退款1  售前退款2  换货3
    private Integer after_sale_type;

    public Integer getAfter_sale_status() {
        return after_sale_status;
    }

    public void setAfter_sale_status(Integer after_sale_status) {
        this.after_sale_status = after_sale_status;
    }

    public Integer getAfter_sale_type() {
        return after_sale_type;
    }

    public void setAfter_sale_type(Integer after_sale_type) {
            this.after_sale_type = after_sale_type;
    }
}
