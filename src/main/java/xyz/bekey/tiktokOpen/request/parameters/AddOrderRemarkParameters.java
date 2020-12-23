package xyz.bekey.tiktokOpen.request.parameters;

import xyz.bekey.tiktokOpen.utils.AssertUtils;

import java.util.Objects;

public class AddOrderRemarkParameters {

    // 父订单ID，后面需带大写字母A
    private String order_id;
    //备注内容，最大不得超过60个字符
    private String remark;
    // 是否加旗标，不填则默认为否
    //true：需要加旗标
    //false：不加旗标
    private Boolean is_add_star;
    // 标星等级，范围0～5
    //0为灰色旗标，5为红色旗标，数字越大颜色越深
    //0灰 1紫 2青 3绿 4橙 5红
    private Integer star;

    public AddOrderRemarkParameters(String order_id, String remark) {
        AssertUtils.isTrue(remark != null && remark.length() <= 60,
                "备注内容，最大不得超过60个字符");
        this.order_id = order_id;
        this.remark = remark;
    }

    public AddOrderRemarkParameters(String order_id, String remark, int star) {
        this(order_id, remark);
        AssertUtils.isTrue(star >= 0 && star <= 5,
                "标星等级，范围0～5");
        this.is_add_star = Boolean.TRUE;
        this.star = star;
    }

    public String getOrder_id() {
        return order_id;
    }

    public String getRemark() {
        return remark;
    }

    public String getIs_add_star() {
        return Objects.toString(is_add_star, null);
    }

    public String getStar() {
        return Objects.toString(star, null);
    }
}
