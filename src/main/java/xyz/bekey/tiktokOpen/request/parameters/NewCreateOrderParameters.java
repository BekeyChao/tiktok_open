package xyz.bekey.tiktokOpen.request.parameters;

import xyz.bekey.tiktokOpen.domain.LogisticsAddress;
import xyz.bekey.tiktokOpen.domain.LogisticsContact;

import java.util.List;

public class NewCreateOrderParameters {

    private SenderInfo sender_info;

    private String logistics_code;

    private List<OrderInfo> order_infos;

    private Long user_id;

    // 非必须，A店铺有订购关系，B店铺没有订购关系，B取号想要使用A的订购关系时，user_id传B店铺的店铺ID，A店铺自身取号传0即可
    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public SenderInfo getSender_info() {
        return sender_info;
    }

    public void setSender_info(SenderInfo sender_info) {
        this.sender_info = sender_info;
    }

    public String getLogistics_code() {
        return logistics_code;
    }

    public void setLogistics_code(String logistics_code) {
        this.logistics_code = logistics_code;
    }

    public List<OrderInfo> getOrder_infos() {
        return order_infos;
    }

    public void setOrder_infos(List<OrderInfo> order_infos) {
        this.order_infos = order_infos;
    }

    public static class OrderInfo{

        private String order_id;

        // 非必须，包裹id（只能传入数字、字母和下划线；大小写敏感，即123A,123a 不可当做相同ID，否则存在一定可能取号失败）
        // 一单一包裹是不需要传，有2个以上时，从第二个开始都需要传不同id
        private String pack_id;

        private ReceiverInfo receiver_info;

        private List<Item> items;

        // 非必须，要求上门取件时间段
        private String sender_fetch_time;

        // 非必须，是否返回签回单（签单返还）的运单号，支持以下值：1：要求 0：不要求"
        private Integer is_sign_back;

        // 非必须，订单备注
        private String remark;

        // 非必须，备用字段
        private String extra;

        // 非必须，子母件场景。需要大于1，示例 33 (部分物流商支持，目前仅德邦）
        private Integer total_pack_count;

        public String getOrder_id() {
            return order_id;
        }

        public void setOrder_id(String order_id) {
            this.order_id = order_id;
        }

        public String getPack_id() {
            return pack_id;
        }

        public void setPack_id(String pack_id) {
            this.pack_id = pack_id;
        }

        public ReceiverInfo getReceiver_info() {
            return receiver_info;
        }

        public void setReceiver_info(ReceiverInfo receiver_info) {
            this.receiver_info = receiver_info;
        }

        public List<Item> getItems() {
            return items;
        }

        public void setItems(List<Item> items) {
            this.items = items;
        }

        public String getSender_fetch_time() {
            return sender_fetch_time;
        }

        public void setSender_fetch_time(String sender_fetch_time) {
            this.sender_fetch_time = sender_fetch_time;
        }

        public Integer getIs_sign_back() {
            return is_sign_back;
        }

        public void setIs_sign_back(Integer is_sign_back) {
            this.is_sign_back = is_sign_back;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getExtra() {
            return extra;
        }

        public void setExtra(String extra) {
            this.extra = extra;
        }

        public Integer getTotal_pack_count() {
            return total_pack_count;
        }

        public void setTotal_pack_count(Integer total_pack_count) {
            this.total_pack_count = total_pack_count;
        }

        public static class ReceiverInfo{

            private LogisticsAddress address;

            private LogisticsContact contact;

            public LogisticsAddress getAddress() {
                return address;
            }

            public void setAddress(LogisticsAddress address) {
                this.address = address;
            }

            public LogisticsContact getContact() {
                return contact;
            }

            public void setContact(LogisticsContact contact) {
                this.contact = contact;
            }
        }

        public static class Item{

            // 商品名称
            private String item_name;

            // 商品规格
            private String item_specs;

            // 商品数量
            private Integer item_count;

            // 非必须，单件商品体积（cm3
            private Double item_volume;

            // 非必须，单件商品重量（g)
            private Double item_weight;

            // 非必须，单件总净重量（g）
            private Double item_net_weight;

            public String getItem_name() {
                return item_name;
            }

            public void setItem_name(String item_name) {
                this.item_name = item_name;
            }

            public String getItem_specs() {
                return item_specs;
            }

            public void setItem_specs(String item_specs) {
                this.item_specs = item_specs;
            }

            public Integer getItem_count() {
                return item_count;
            }

            public void setItem_count(Integer item_count) {
                this.item_count = item_count;
            }

            public Double getItem_volume() {
                return item_volume;
            }

            public void setItem_volume(Double item_volume) {
                this.item_volume = item_volume;
            }

            public Double getItem_weight() {
                return item_weight;
            }

            public void setItem_weight(Double item_weight) {
                this.item_weight = item_weight;
            }

            public Double getItem_net_weight() {
                return item_net_weight;
            }

            public void setItem_net_weight(Double item_net_weight) {
                this.item_net_weight = item_net_weight;
            }
        }

    }

    public static class SenderInfo{

        private LogisticsAddress address;

        private LogisticsContact contact;

        public LogisticsAddress getAddress() {
            return address;
        }

        public void setAddress(LogisticsAddress address) {
            this.address = address;
        }

        public LogisticsContact getContact() {
            return contact;
        }

        public void setContact(LogisticsContact contact) {
            this.contact = contact;
        }

    }
}
