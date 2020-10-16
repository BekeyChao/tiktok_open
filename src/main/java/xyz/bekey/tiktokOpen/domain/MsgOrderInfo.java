package xyz.bekey.tiktokOpen.domain;

public class MsgOrderInfo {
    // 应用ID
    private long app_id;
    private PushOrderInfo order_info;

    public long getApp_id() {
        return app_id;
    }

    public void setApp_id(long app_id) {
        this.app_id = app_id;
    }

    public PushOrderInfo getOrder_info() {
        return order_info;
    }

    public void setOrder_info(PushOrderInfo order_info) {
        this.order_info = order_info;
    }

    public static class PushOrderInfo {
        private long order_id;
        private long shop_id;
        // 服务开始时间
        private long service_start_time;
        // 服务结束时间
        private long service_end_time;
        // 1：订单待付款，4：订单取消，5：已完成
        private int status;
        // 	店铺所有者的手机号
        private String phone;
        // 	用户实际支付的金额，以分为单位
        private long pay_amount;
        //
        private long pay_time;
        private long order_create_time;
        // 1：微信，2：支付宝，4：该订单为试用订单，0元单
        private int pay_type;
        private PushSkuInfo  push_sku_info;

        public long getOrder_id() {
            return order_id;
        }

        public void setOrder_id(long order_id) {
            this.order_id = order_id;
        }

        public long getShop_id() {
            return shop_id;
        }

        public void setShop_id(long shop_id) {
            this.shop_id = shop_id;
        }

        public long getService_start_time() {
            return service_start_time;
        }

        public void setService_start_time(long service_start_time) {
            this.service_start_time = service_start_time;
        }

        public long getService_end_time() {
            return service_end_time;
        }

        public void setService_end_time(long service_end_time) {
            this.service_end_time = service_end_time;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public long getPay_amount() {
            return pay_amount;
        }

        public void setPay_amount(long pay_amount) {
            this.pay_amount = pay_amount;
        }

        public long getPay_time() {
            return pay_time;
        }

        public void setPay_time(long pay_time) {
            this.pay_time = pay_time;
        }

        public long getOrder_create_time() {
            return order_create_time;
        }

        public void setOrder_create_time(long order_create_time) {
            this.order_create_time = order_create_time;
        }

        public int getPay_type() {
            return pay_type;
        }

        public void setPay_type(int pay_type) {
            this.pay_type = pay_type;
        }

        public PushSkuInfo getPush_sku_info() {
            return push_sku_info;
        }

        public void setPush_sku_info(PushSkuInfo push_sku_info) {
            this.push_sku_info = push_sku_info;
        }
    }

    public static class PushSkuInfo {
        // 规格类型--0: 版本，其他待定
        private int spec_type;
        // 规格名称
        private String spec_value;
        // sku价格
        private long price;
        // 使用时长
        private int duration;
        // 使用时长单位
        private int duration_unit;
        // sku名称
        private String title;

        public int getSpec_type() {
            return spec_type;
        }

        public void setSpec_type(int spec_type) {
            this.spec_type = spec_type;
        }

        public String getSpec_value() {
            return spec_value;
        }

        public void setSpec_value(String spec_value) {
            this.spec_value = spec_value;
        }

        public long getPrice() {
            return price;
        }

        public void setPrice(long price) {
            this.price = price;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getDuration_unit() {
            return duration_unit;
        }

        public void setDuration_unit(int duration_unit) {
            this.duration_unit = duration_unit;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
