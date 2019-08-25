package com.ssm.demo.utiles;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @program: ssm-demo
 * @description:
 * @author: Leiah1998
 * @create: 2019-08-08 14:12
 **/
public class SystemUtil {
    private SystemUtil() {

    }

    public static String getToken(String src) {
        if (null == src || "".equals(src)) {
            return null;
        }
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(src.getBytes());
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            return null;
        }
    }
}
