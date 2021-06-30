package xyz.bekey.tiktokOpen.domain;

import java.util.List;

public class BatchSenOrDecResult {

    private List<EncryptInfo> decrypt_infos;

    private CustomErr custom_err;

    public List<EncryptInfo> getDecrypt_infos() {
        return decrypt_infos;
    }

    public void setDecrypt_infos(List<EncryptInfo> decrypt_infos) {
        this.decrypt_infos = decrypt_infos;
    }

    public CustomErr getCustom_err() {
        return custom_err;
    }

    public void setCustom_err(CustomErr custom_err) {
        this.custom_err = custom_err;
    }
}
