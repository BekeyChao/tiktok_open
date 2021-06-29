package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class NetSiteResult {

    // 快递公司编码
    private String logistics_code;

    // 物流服务商业务类型 1：直营 2：加盟 3：落地配 4：直营带网点
    private Integer company_type;

    // 商家已开通的网点列表信息
    private List<NetSite> netsites;

    public String getLogistics_code() {
        return logistics_code;
    }

    public void setLogistics_code(String logistics_code) {
        this.logistics_code = logistics_code;
    }

    public Integer getCompany_type() {
        return company_type;
    }

    public void setCompany_type(Integer company_type) {
        this.company_type = company_type;
    }

    public List<NetSite> getNetsites() {
        return netsites;
    }

    public void setNetsites(List<NetSite> netsites) {
        this.netsites = netsites;
    }

    public static class NetSite{

        // 网点Code
        private String netsite_code;

        // 网点名称
        private String netsite_name;

        // 电子面单余额数量
        private String amount;

        // 寄件人地址
        private List<LogisticsAddress> sender_address;

        // 已取单号数量，若业务本身无值，则传-1，前端可展示为“-”
        private Integer allocated_quantity;

        // 已取消单号数量，若业务本身无值，则传-1，前端可展示为“-”
        private Integer cancelled_quantity;

        // 已回收单号数量，若业务本身无值，则传-1，前端可展示为“-”
        private Integer recycled_quantity;

        public String getNetsite_code() {
            return netsite_code;
        }

        public void setNetsite_code(String netsite_code) {
            this.netsite_code = netsite_code;
        }

        public String getNetsite_name() {
            return netsite_name;
        }

        public void setNetsite_name(String netsite_name) {
            this.netsite_name = netsite_name;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public List<LogisticsAddress> getSender_address() {
            return sender_address;
        }

        public void setSender_address(List<LogisticsAddress> sender_address) {
            this.sender_address = sender_address;
        }

        public Integer getAllocated_quantity() {
            return allocated_quantity;
        }

        public void setAllocated_quantity(Integer allocated_quantity) {
            this.allocated_quantity = allocated_quantity;
        }

        public Integer getCancelled_quantity() {
            return cancelled_quantity;
        }

        public void setCancelled_quantity(Integer cancelled_quantity) {
            this.cancelled_quantity = cancelled_quantity;
        }

        public Integer getRecycled_quantity() {
            return recycled_quantity;
        }

        public void setRecycled_quantity(Integer recycled_quantity) {
            this.recycled_quantity = recycled_quantity;
        }
    }
}
