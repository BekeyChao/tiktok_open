package xyz.bekey.tiktokOpen;

import org.junit.Test;
import xyz.bekey.tiktokOpen.utils.AesDecryptUtils;

public class AesDecryptTests {

    @Test
    public void decrypt() {
        String msgSecret = "Vf6ClcmtqC5KDKi7//XHv8cfPtD653kt+jV+eHhyPA9ZZfDsatobIry7nQzGEqvQpBK1EAOTPbuhxl1Er/nDcQ==";
        String appSecret = "a5c5a2dc-31ca-4a7a-b743-e862d96082bd";
        String Key = appSecret.replaceAll("-", "");
        String decrypt = AesDecryptUtils.decrypt(msgSecret, Key);
        System.out.println("解密之后的数据为: " + decrypt);
    }
}
