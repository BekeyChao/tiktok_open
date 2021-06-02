package xyz.bekey.tiktokOpen.request.parameters;

import xyz.bekey.tiktokOpen.domain.CombineStatus;
import xyz.bekey.tiktokOpen.domain.enums.OrderStatus;
import xyz.bekey.tiktokOpen.domain.enums.SortBy;
import xyz.bekey.tiktokOpen.utils.AssertUtils;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class OrderListParameters {

    // 可传入商品Id或名称，number型代表商品ID，其它代表商品名称
    private String product;

    // app渠道:0 站外 1 火山 2 抖音 3 头条 4 西瓜 5 微信 6 值点app 7 头条lite 8 懂车帝 9 皮皮虾 11 抖音极速版 12 TikTok 13 musically 14 穿山甲 15 火山极速版 16 服务市场
    private Integer b_type;

    // 售后状态：all-全部，in_aftersale-售后中，refund-退款中，refund_success-退款成功，refund_fail-退款失败，exchange_success-换货成功 aftersale_close-售后关闭
    private String after_sale_status_desc;

    // 物流单号
    private String tracking_no;

    // 预售类型：1 全款预售
    private Integer presell_type;

    // 订类型:0-普通订单 2-虚拟订单 4-平台券码 5-商家券码
    private Integer order_type;

    // 异常订单，1-异常取消，2-风控审核中
    private Integer abnormal_order;

    // 交易类型，1 拼团订单，2 定金预售
    private Integer trade_type;

    // order_status和main_status的状态组合
    private List<CombineStatus> combine_status;

    // 按订单创建搜索的开始时间
    private Long create_time_start;

    // 按订单创建搜索的结束时间
    private Long create_time_end;

    // 按订单更新搜索的开始时间
    private Long update_time_start;

    // 按订单更新搜索的结束时间
    private Long update_time_end;

    // 搜索时间条件：按订单创建时间create_time；按订单更新时间进行搜索update_time
    //默认创建时间
    private String order_by = "create_time";

    // 订单排序方式：最近的在前为false，最近的在后为true
    private Boolean order_asc = false;

    // 页数（默认值为0，第一页从0开始）
//    private String page;
    private Integer page;

    // 每页订单数（默认为10，最大100）
//    private String size;
    private Integer size;

    public void setProduct(String product) {
        this.product = product;
    }

    public void setB_type(Integer b_type) {
        this.b_type = b_type;
    }

    public void setAfter_sale_status_desc(String after_sale_status_desc) {
        this.after_sale_status_desc = after_sale_status_desc;
    }

    public void setTracking_no(String tracking_no) {
        this.tracking_no = tracking_no;
    }

    public void setPresell_type(Integer presell_type) {
        this.presell_type = presell_type;
    }

    public void setOrder_type(Integer order_type) {
        this.order_type = order_type;
    }

    public void setAbnormal_order(Integer abnormal_order) {
        this.abnormal_order = abnormal_order;
    }

    public void setTrade_type(Integer trade_type) {
        this.trade_type = trade_type;
    }

    public void setCombine_status(List<CombineStatus> combine_status) {
        this.combine_status = combine_status;
    }

    public void setCombine_status(OrderStatus order_status) {
        CombineStatus combineStatus = new CombineStatus();
        combineStatus.setOrder_status(order_status.toString());
        this.combine_status.add(combineStatus);
    }

    public void setCombine_status(int order_status) {
        CombineStatus combineStatus = new CombineStatus();
        combineStatus.setOrder_status(String.valueOf(order_status));
        this.combine_status.add(combineStatus);
    }

    public void setCreate_time_start(LocalDateTime create_time_start) {
        if (create_time_start != null) {
            long time_start = create_time_start.toEpochSecond(ZoneOffset.of("+8"));
            this.create_time_start = time_start;
        }
    }

    public void setCreate_time_end(LocalDateTime create_time_end) {
        if (create_time_end != null) {
            long time_end = create_time_end.toEpochSecond(ZoneOffset.of("+8"));
            this.create_time_end = time_end;
        }
    }

    public void setUpdate_time_start(LocalDateTime update_time_start) {
        if (update_time_start != null) {
            long time_start = update_time_start.toEpochSecond(ZoneOffset.of("+8"));
            this.update_time_start = time_start;
        }
    }

    public void setUpdate_time_end(LocalDateTime update_time_end) {
        if (update_time_end != null) {
            long time_end = update_time_end.toEpochSecond(ZoneOffset.of("+8"));
            this.update_time_end = time_end;
        }
    }

    public void setOrder_by(String order_by) {
        AssertUtils.isTrue(order_by.equals("create_time") || order_by.equals("update_time"),
                "请选择按 create_time or update_time 排序");
        this.order_by = order_by;
    }

    public void setOrder_asc(Boolean order_asc) {
        this.order_asc = order_asc;
    }

    public void setPage(Integer page) {
        AssertUtils.isTrue(page >= 0, "page > 0");
        this.page = page;
    }

    public void setSize(Integer size) {
        AssertUtils.isTrue(size > 0 && size <= 100,
                "size between 0 and 100");
        this.size = size;
    }

    public String getProduct() {
        return product;
    }

    public Integer getB_type() {
        return b_type;
    }

    public String getAfter_sale_status_desc() {
        return after_sale_status_desc;
    }

    public String getTracking_no() {
        return tracking_no;
    }

    public Integer getPresell_type() {
        return presell_type;
    }

    public Integer getOrder_type() {
        return order_type;
    }

    public Integer getAbnormal_order() {
        return abnormal_order;
    }

    public Integer getTrade_type() {
        return trade_type;
    }

    public List<CombineStatus> getCombine_status() {
        return combine_status;
    }

    public Long getCreate_time_start() {
        return create_time_start;
    }

    public Long getCreate_time_end() {
        return create_time_end;
    }

    public Long getUpdate_time_start() {
        return update_time_start;
    }

    public Long getUpdate_time_end() {
        return update_time_end;
    }

    public String getOrder_by() {
        return order_by;
    }

    public Boolean getOrder_asc() {
        return order_asc;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getSize() {
        return size;
    }
}
