package xyz.bekey.tiktokOpen.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * AES加密算法 来自抖店文档java示例
 */
public class AesDecryptUtils {

    private static Logger logger = LoggerFactory.getLogger(AesDecryptUtils.class);


    /**
     * 解密
     *
     * @param sSrc 源文本
     * @param sKey 密钥为32位，appSecret为36位，需要去除其中的4位"-"即可
     * @return 明文
     * @throws Exception 解密错误
     */
    public static String decrypt(String sSrc, String sKey) {
        try {
            byte[] raw = sKey.getBytes("ASCII");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            int blockSize = cipher.getBlockSize();
            IvParameterSpec iv = new IvParameterSpec(sKey.substring(0, blockSize).getBytes());
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

//            byte[] encrypted1 = new BASE64Decoder().decodeBuffer(sSrc);//先用base64解密
            byte[] encrypted1 = Base64.getDecoder().decode(sSrc); //先用base64解密

            byte[] original = cipher.doFinal(encrypted1);
            String originalString = new String(original, "utf-8");
            return originalString;
        } catch (Exception ex) {
            logger.error("解密错误,秘文: {}", sSrc, ex);
            return null;
        }
    }
}
