package com.ssm.demo.utiles;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: ssm-demo
 * @description: 日期工具类
 * @author: Leiah1998
 * @create: 2019-08-22
 **/
public class DateUtil {
    /**
     * 格式化date
     * @param date
     * @return
     */
    public static String getDateString(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(date);
    }
}
