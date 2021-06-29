package xyz.bekey.tiktokOpen.request.parameters;

import xyz.bekey.tiktokOpen.domain.Encrypt;

import java.util.List;

public class BatchEncryptParameters {

    // 待加密列表
    private List<Encrypt> batch_encrypt_list;

    // 版本信息，非必须
    private String version;

    public List<Encrypt> getBatch_encrypt_list() {
        return batch_encrypt_list;
    }

    public void setBatch_encrypt_list(List<Encrypt> batch_encrypt_list) {
        this.batch_encrypt_list = batch_encrypt_list;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
