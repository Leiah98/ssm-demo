package com.ssm.demo.utiles;

import org.apache.log4j.Logger;

/**
 * @program: ssm-demo
 * @description: log4j日志输出测试
 * @author: Leiah1998
 * @create: 2019-08-25
 **/
public class Log4JTest {
    static Logger log = Logger.getLogger(Log4JTest.class);//获取日志记录器

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            log.info("Log4J:" + i);
        }
    }
}
