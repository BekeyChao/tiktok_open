package xyz.bekey.tiktokOpen.domain;

public class AccessToken {
    private Integer err_no;
    private String message;
    private Token data;

    public static class Token {
        private String access_token;
        private String refresh_token;
        // 单位（秒）
        private Long expires_in;
        // 授权作用域，使用逗号,分隔。预留字段
        private String scope;
        private String shop_id;
        private String shop_name;

        public String getAccess_token() {
            return access_token;
        }

        public void setAccess_token(String access_token) {
            this.access_token = access_token;
        }

        public String getRefresh_token() {
            return refresh_token;
        }

        public void setRefresh_token(String refresh_token) {
            this.refresh_token = refresh_token;
        }

        public Long getExpires_in() {
            return expires_in;
        }

        public void setExpires_in(Long expires_in) {
            this.expires_in = expires_in;
        }

        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        public String getShop_id() {
            return shop_id;
        }

        public void setShop_id(String shop_id) {
            this.shop_id = shop_id;
        }

        public String getShop_name() {
            return shop_name;
        }

        public void setShop_name(String shop_name) {
            this.shop_name = shop_name;
        }
    }

    public Integer getErr_no() {
        return err_no;
    }

    public void setErr_no(Integer err_no) {
        this.err_no = err_no;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Token getData() {
        return data;
    }

    public void setData(Token data) {
        this.data = data;
    }
}
