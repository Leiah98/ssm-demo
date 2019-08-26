package test.simple;

import org.junit.Test;

/**
 * @program: ssm-demo
 * @description: 简单单元测试
 * @author: Leiah1998
 * @create: 2019-08-26
 **/
public class ApiTest {

    @Test
    public void subStringTest() {
        String url = "https://github.com/Leiah98/ssm-demo/network/alert/pom.xml/commons-fileupload:commons-fileupload/open";
        url = url.substring(url.lastIndexOf("/"));
        System.out.println(url);
        //lastIndexOf会返回包含索引，最后出现的字符串，即：/open。
    }
}
