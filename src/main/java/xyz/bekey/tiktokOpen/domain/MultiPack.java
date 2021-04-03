package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class MultiPack {

    private List<PackListBean> pack_list;

    public List<PackListBean> getPack_list() {
        return pack_list;
    }

    public void setPack_list(List<PackListBean> pack_list) {
        this.pack_list = pack_list;
    }

    public static class PackListBean {
        /**
         * shipped_order_info : [{"shipped_order_id":"4705288465508532862","shipped_item_ids":["4705288465508532862","4705288465508532862"],"shipped_num":"1"},{"shipped_order_id":"4705288465508532862","shipped_item_ids":["4705288465508532862","4705288465508532862"],"shipped_num":"1"}]
         * pack_id : 4705288465508532862
         * logistics_code : 111111111111111
         */

        private String pack_id;
        private String logistics_code;
        private String logistics_id;
        private List<ShippedOrderInfoBean> shipped_order_info;

        public String getPack_id() {
            return pack_id;
        }

        public void setPack_id(String pack_id) {
            this.pack_id = pack_id;
        }

        public String getLogistics_code() {
            return logistics_code;
        }

        public void setLogistics_code(String logistics_code) {
            this.logistics_code = logistics_code;
        }

        public List<ShippedOrderInfoBean> getShipped_order_info() {
            return shipped_order_info;
        }

        public void setShipped_order_info(List<ShippedOrderInfoBean> shipped_order_info) {
            this.shipped_order_info = shipped_order_info;
        }

        public String getLogistics_id() {
            return logistics_id;
        }

        public void setLogistics_id(String logistics_id) {
            this.logistics_id = logistics_id;
        }

        public static class ShippedOrderInfoBean {
            /**
             * shipped_order_id : 4705288465508532862
             * shipped_item_ids : ["4705288465508532862","4705288465508532862"]
             * shipped_num : 1
             */

            private String shipped_order_id;
            private String shipped_num;
            private List<String> shipped_item_ids;

            public String getShipped_order_id() {
                return shipped_order_id;
            }

            public void setShipped_order_id(String shipped_order_id) {
                this.shipped_order_id = shipped_order_id;
            }

            public String getShipped_num() {
                return shipped_num;
            }

            public void setShipped_num(String shipped_num) {
                this.shipped_num = shipped_num;
            }

            public List<String> getShipped_item_ids() {
                return shipped_item_ids;
            }

            public void setShipped_item_ids(List<String> shipped_item_ids) {
                this.shipped_item_ids = shipped_item_ids;
            }
        }
    }
}
