package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class AfterSale {
    private Long order_id;
    private Long aftersale_id;
    private String apply_time;
    //0 售后退货退款
    //1 售后退款
    //2 售前退款
    //3 换货
    private Integer aftersale_type;
    // 超时自动流转截止时间
    private String status_deadline;
    // 自动流转类型
    private Integer deadline_type;
    private String aftersale_process_desc;
    private String aftersale_status_desc;
    private String return_status_desc;
    private String reason_desc;
    // 0 全额退款
    //1 部分退款
    private Integer part_type;
    // 店铺订单id（主订单id）
    private Long pid;
    private String aftersale_refund_type_desc;
    //0 原路退回
    //1 货到付款线下退款
    //2 备用金退款
    //3 保证金退款
    //4 无需退款
    private Integer refund_type;
    //0 无需退款
    //1 待退款
    //2 退款中
    //3 退款成功
    //4 退款失败
    private Integer refund_status;
    //0 售后初始
    //6 售后申请
    //27 拒绝售后申请
    //12 售后成功
    //28 售后失败
    //7 售后退货中
    //11 售后已发货
    //29 售后退货拒绝
    //13 售后换货商家发货
    //14 售后换货用户收货
    private Integer aftersale_status;
    private String post_receiver;
    //0 无仲裁记录
    //1 仲裁中
    //2 客服同意
    //3 客服拒绝
    private Integer arbitrate_status;
    //剩余的催发货短信次数
    private Integer urge_sms_cnt;
    private List<AfterSale> aftersale_items;
    private List<AfterSale> aftersale_record_items;
    private String product_name;
    private Long product_id;
    private String product_img;
    private Integer num;
    private Integer pay_amount;
    private Integer post_amount;
    private Integer refund_amount;
    private Integer refund_post_amount;
    // 售后标签：七天无理由，极速退等
    private List<String> aftersale_service;
    private List<NameValue> sku_spec;
    private List<ProductTag> product_tag;
    private String insurances_tag;
    //    private Integer part_type;
    //操作角色，system：系统、
//service：平台客服、
//user：用户、
//shop：商家
    private String role;
    private String op_type;
    private String op_name;
    //操作结果，1：同意
    //2:拒绝
    //3:立即退款
    private Integer conclusion;
    private String op_time;
    private String comment;
    private List<String> evidence;
    private String remark;
    //收到货物说明，0代表未收到货，1代表已收到货
    private Integer got_pkg;
    private String logistics_code;
    private String company_code;
    private String company_name;
    //售后单对应订单类型,1代表商品单，2代表店铺单，0表示历史单（可通过创建时间来判断，即20年11月之后的都是新的数据
    private Integer aftersale_order_type;

    public static class ProductTag {
        private String tag_detail;
        private String tag_detail_en;
        private String tag_link_url;

        public String getTag_detail() {
            return tag_detail;
        }

        public void setTag_detail(String tag_detail) {
            this.tag_detail = tag_detail;
        }

        public String getTag_detail_en() {
            return tag_detail_en;
        }

        public void setTag_detail_en(String tag_detail_en) {
            this.tag_detail_en = tag_detail_en;
        }

        public String getTag_link_url() {
            return tag_link_url;
        }

        public void setTag_link_url(String tag_link_url) {
            this.tag_link_url = tag_link_url;
        }
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Long getAftersale_id() {
        return aftersale_id;
    }

    public void setAftersale_id(Long aftersale_id) {
        this.aftersale_id = aftersale_id;
    }

    public String getApply_time() {
        return apply_time;
    }

    public void setApply_time(String apply_time) {
        this.apply_time = apply_time;
    }

    public Integer getAftersale_type() {
        return aftersale_type;
    }

    public void setAftersale_type(Integer aftersale_type) {
        this.aftersale_type = aftersale_type;
    }

    public String getStatus_deadline() {
        return status_deadline;
    }

    public void setStatus_deadline(String status_deadline) {
        this.status_deadline = status_deadline;
    }

    public Integer getDeadline_type() {
        return deadline_type;
    }

    public void setDeadline_type(Integer deadline_type) {
        this.deadline_type = deadline_type;
    }

    public String getAftersale_process_desc() {
        return aftersale_process_desc;
    }

    public void setAftersale_process_desc(String aftersale_process_desc) {
        this.aftersale_process_desc = aftersale_process_desc;
    }

    public String getAftersale_status_desc() {
        return aftersale_status_desc;
    }

    public void setAftersale_status_desc(String aftersale_status_desc) {
        this.aftersale_status_desc = aftersale_status_desc;
    }

    public String getReturn_status_desc() {
        return return_status_desc;
    }

    public void setReturn_status_desc(String return_status_desc) {
        this.return_status_desc = return_status_desc;
    }

    public String getReason_desc() {
        return reason_desc;
    }

    public void setReason_desc(String reason_desc) {
        this.reason_desc = reason_desc;
    }

    public Integer getPart_type() {
        return part_type;
    }

    public void setPart_type(Integer part_type) {
        this.part_type = part_type;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getAftersale_refund_type_desc() {
        return aftersale_refund_type_desc;
    }

    public void setAftersale_refund_type_desc(String aftersale_refund_type_desc) {
        this.aftersale_refund_type_desc = aftersale_refund_type_desc;
    }

    public Integer getRefund_type() {
        return refund_type;
    }

    public void setRefund_type(Integer refund_type) {
        this.refund_type = refund_type;
    }

    public Integer getRefund_status() {
        return refund_status;
    }

    public void setRefund_status(Integer refund_status) {
        this.refund_status = refund_status;
    }

    public Integer getAftersale_status() {
        return aftersale_status;
    }

    public void setAftersale_status(Integer aftersale_status) {
        this.aftersale_status = aftersale_status;
    }

    public String getPost_receiver() {
        return post_receiver;
    }

    public void setPost_receiver(String post_receiver) {
        this.post_receiver = post_receiver;
    }

    public Integer getArbitrate_status() {
        return arbitrate_status;
    }

    public void setArbitrate_status(Integer arbitrate_status) {
        this.arbitrate_status = arbitrate_status;
    }

    public Integer getUrge_sms_cnt() {
        return urge_sms_cnt;
    }

    public void setUrge_sms_cnt(Integer urge_sms_cnt) {
        this.urge_sms_cnt = urge_sms_cnt;
    }

    public List<AfterSale> getAftersale_items() {
        return aftersale_items;
    }

    public void setAftersale_items(List<AfterSale> aftersale_items) {
        this.aftersale_items = aftersale_items;
    }

    public List<AfterSale> getAftersale_record_items() {
        return aftersale_record_items;
    }

    public void setAftersale_record_items(List<AfterSale> aftersale_record_items) {
        this.aftersale_record_items = aftersale_record_items;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_img() {
        return product_img;
    }

    public void setProduct_img(String product_img) {
        this.product_img = product_img;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(Integer pay_amount) {
        this.pay_amount = pay_amount;
    }

    public Integer getPost_amount() {
        return post_amount;
    }

    public void setPost_amount(Integer post_amount) {
        this.post_amount = post_amount;
    }

    public Integer getRefund_amount() {
        return refund_amount;
    }

    public void setRefund_amount(Integer refund_amount) {
        this.refund_amount = refund_amount;
    }

    public Integer getRefund_post_amount() {
        return refund_post_amount;
    }

    public void setRefund_post_amount(Integer refund_post_amount) {
        this.refund_post_amount = refund_post_amount;
    }

    public List<String> getAftersale_service() {
        return aftersale_service;
    }

    public void setAftersale_service(List<String> aftersale_service) {
        this.aftersale_service = aftersale_service;
    }

    public List<NameValue> getSku_spec() {
        return sku_spec;
    }

    public void setSku_spec(List<NameValue> sku_spec) {
        this.sku_spec = sku_spec;
    }

    public List<ProductTag> getProduct_tag() {
        return product_tag;
    }

    public void setProduct_tag(List<ProductTag> product_tag) {
        this.product_tag = product_tag;
    }

    public String getInsurances_tag() {
        return insurances_tag;
    }

    public void setInsurances_tag(String insurances_tag) {
        this.insurances_tag = insurances_tag;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOp_type() {
        return op_type;
    }

    public void setOp_type(String op_type) {
        this.op_type = op_type;
    }

    public String getOp_name() {
        return op_name;
    }

    public void setOp_name(String op_name) {
        this.op_name = op_name;
    }

    public Integer getConclusion() {
        return conclusion;
    }

    public void setConclusion(Integer conclusion) {
        this.conclusion = conclusion;
    }

    public String getOp_time() {
        return op_time;
    }

    public void setOp_time(String op_time) {
        this.op_time = op_time;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<String> getEvidence() {
        return evidence;
    }

    public void setEvidence(List<String> evidence) {
        this.evidence = evidence;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getGot_pkg() {
        return got_pkg;
    }

    public void setGot_pkg(Integer got_pkg) {
        this.got_pkg = got_pkg;
    }

    public String getLogistics_code() {
        return logistics_code;
    }

    public void setLogistics_code(String logistics_code) {
        this.logistics_code = logistics_code;
    }

    public String getCompany_code() {
        return company_code;
    }

    public void setCompany_code(String company_code) {
        this.company_code = company_code;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Integer getAftersale_order_type() {
        return aftersale_order_type;
    }

    public void setAftersale_order_type(Integer aftersale_order_type) {
        this.aftersale_order_type = aftersale_order_type;
    }
}
