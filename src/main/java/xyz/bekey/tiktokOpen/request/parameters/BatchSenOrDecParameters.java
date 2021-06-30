package xyz.bekey.tiktokOpen.request.parameters;

import java.util.List;

public class BatchSenOrDecParameters {

    private List<CipherInfo> cipher_infos;

    public List<CipherInfo> getCipher_infos() {
        return cipher_infos;
    }

    public void setCipher_infos(List<CipherInfo> cipher_infos) {
        this.cipher_infos = cipher_infos;
    }

    public static class CipherInfo{

        private String auth_id;

        private String cipher_text;

        public String getAuth_id() {
            return auth_id;
        }

        public void setAuth_id(String auth_id) {
            this.auth_id = auth_id;
        }

        public String getCipher_text() {
            return cipher_text;
        }

        public void setCipher_text(String cipher_text) {
            this.cipher_text = cipher_text;
        }
    }
}
