package com.ssm.demo.utiles;

/**
 * @program: ssm-demo
 * @description:
 * @author: Leiah1998
 * @create: 2019-08-08 14:10
 **/
public class NumberUtil {
    private NumberUtil() {

    }

    /**
     * 生成指定长度的随机数
     * @param length
     * @return
     */
    public static int genRandomNum(int length) {
        int num = 1;
        double random = Math.random();
        if (random < 0.1) {
            random = random + 0.1;
        }
        for (int i = 0; i < length; i++) {
            num = num * 10;
        }
        return (int) (random * 10);
    }
}
