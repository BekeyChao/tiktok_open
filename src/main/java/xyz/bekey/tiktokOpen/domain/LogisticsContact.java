package xyz.bekey.tiktokOpen.domain;

public class LogisticsContact {

    private  String name;

    // 非必须,寄件人固话（和mobile二选一）
    private String phone;

    // 非必须,寄件人移动电话（和mobile二选一）
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
