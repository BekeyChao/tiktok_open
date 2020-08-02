package xyz.bekey.tiktokOpen.request.parameters;

import xyz.bekey.tiktokOpen.domain.enums.OrderStatus;
import xyz.bekey.tiktokOpen.domain.enums.SortBy;
import xyz.bekey.tiktokOpen.utils.AssertUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OrderListParameters {

    // 	子订单状态
    private String order_status;

    // 开始时间
    private String start_time;

    // 结束时间
    private String end_time;

    // 搜索时间条件：按订单创建时间create_time；按订单更新时间进行搜索update_time
    //默认创建时间
    private String order_by = "create_time";

    // 订单排序方式：最近的在前，1；最近的在后，0
    private SortBy is_desc;

    // 页数（默认值为0，第一页从0开始）
    private String page;

    // 每页订单数（默认为10，最大100）
    private String size;

    private String type;

    public void setOrder_status(OrderStatus order_status) {
        this.order_status = order_status.toString();
    }

    public void setOrder_status(int order_status) {
        this.order_status = String.valueOf(order_status);
    }

    public void setStart_time(LocalDateTime start_time) {
        if (start_time != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            this.start_time = start_time.format(formatter);
        }
    }

    public void setEnd_time(LocalDateTime end_time) {
        if (end_time != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            this.end_time = end_time.format(formatter);
        }
    }

    public void setOrder_by(String order_by) {
        AssertUtils.isTrue(order_by.equals("create_time") || order_by.equals("update_time"),
                "请选择按 create_time or update_time 排序");
        this.order_by = order_by;
    }

    public void setIs_desc(SortBy is_desc) {
        this.is_desc = is_desc;
    }

    public void setPage(Integer page) {
        AssertUtils.isTrue(page >= 0, "page > 0");
        this.page = page.toString();
    }

    public void setType(int type) {
        this.type = type + "";
    }

    public String getType() {
        return this.type;
    }

    public void setSize(Integer size) {
        AssertUtils.isTrue(size > 0 && size <= 100,
                "size between 0 and 100");
        this.size = size.toString();
    }

    public String getOrder_status() {
        return order_status;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public String getOrder_by() {
        return order_by;
    }

    public SortBy getIs_desc() {
        return is_desc;
    }

    public String getPage() {
        return page;
    }

    public String getSize() {
        return size;
    }
}
