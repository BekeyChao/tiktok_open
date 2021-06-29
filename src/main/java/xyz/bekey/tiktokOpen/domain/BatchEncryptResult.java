package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class BatchEncryptResult {

    private List<EncryptInfo> encrypt_infos;

    private CustomErr custom_err;

    public List<EncryptInfo> getEncrypt_infos() {
        return encrypt_infos;
    }

    public void setEncrypt_infos(List<EncryptInfo> encrypt_infos) {
        this.encrypt_infos = encrypt_infos;
    }

    public CustomErr getCustom_err() {
        return custom_err;
    }

    public void setCustom_err(CustomErr custom_err) {
        this.custom_err = custom_err;
    }
}
