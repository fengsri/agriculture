package com.xhu.agriculture.util;

import org.apache.commons.codec.digest.DigestUtils;


/**
 * @Description 加密解密
 * @Author chenlinghong
 * @Date 2018/12/1 23:13
 **/
public final class EncryptionUtil {

    private static String salt = "fh15,.>?>..'dsfg345ig435fggdfdgfd6546;';':'.'.345fds30R%&*Y&GUGi;';]::";

    /**
     * CC MD5加密
     *
     * @param plaintext 明文
     * @return 密文
     */
    public static String ccMD5(String plaintext) {
        String base = plaintext + "/" + salt;
        return DigestUtils.md5Hex(base.getBytes());
    }


}
