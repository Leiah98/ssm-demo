package test.simple;

import com.ssm.demo.utiles.MD5Util;
import org.junit.Test;

/**
 * @program: ssm-demo
 * @description: 得到MD5加密内容
 * @author: Leiah1998
 * @create: 2019-08-26
 **/
public class md5Test {

    @Test
    public void md5Test1() {
        System.out.println(MD5Util.MD5Encode("123456", "utf-8"));
        //e10adc3949ba59abbe56e057f20f883e
    }
}
