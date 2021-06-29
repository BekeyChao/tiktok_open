package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class NewCreateOrderResult {

    private List<EbillInfo> ebill_infos;

    private List<ErrInfo> err_infos;

    public List<EbillInfo> getEbill_infos() {
        return ebill_infos;
    }

    public void setEbill_infos(List<EbillInfo> ebill_infos) {
        this.ebill_infos = ebill_infos;
    }

    public List<ErrInfo> getErr_infos() {
        return err_infos;
    }

    public void setErr_infos(List<ErrInfo> err_infos) {
        this.err_infos = err_infos;
    }

    public static class ErrInfo{

        private String order_id;

        private String pack_id;

        private String err_code;

        private String err_msg;

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

        public String getErr_code() {
            return err_code;
        }

        public void setErr_code(String err_code) {
            this.err_code = err_code;
        }

        public String getErr_msg() {
            return err_msg;
        }

        public void setErr_msg(String err_msg) {
            this.err_msg = err_msg;
        }
    }
}
