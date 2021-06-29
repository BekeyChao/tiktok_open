package xyz.bekey.tiktokOpen.domain;

public class EncryptInfo {

    // 明文
    private String decrypt_text;

    // 鉴权ID
    private String auth_id;

    // 密文
    private String cipher_text;

    private Integer err_no;

    private String err_msg;

    public String getDecrypt_text() {
        return decrypt_text;
    }

    public void setDecrypt_text(String decrypt_text) {
        this.decrypt_text = decrypt_text;
    }

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

    public Integer getErr_no() {
        return err_no;
    }

    public void setErr_no(Integer err_no) {
        this.err_no = err_no;
    }

    public String getErr_msg() {
        return err_msg;
    }

    public void setErr_msg(String err_msg) {
        this.err_msg = err_msg;
    }
}
