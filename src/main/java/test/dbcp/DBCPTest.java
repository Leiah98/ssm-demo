package test.dbcp;

import com.ssm.demo.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: ssm-demo
 * @description: dbcp连接池测试
 * @author: Leiah1998
 * @create: 2019-08-26
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DBCPTest {

    @Autowired
    private ArticleService articleService;

    @Test
    public void DBCTTest1() {
        Long begin = System.currentTimeMillis() / 1000;
        ExecutorService exec = Executors.newFixedThreadPool(30);
        articleService.test(exec);
        exec.shutdown();
        while (true) {
            if (exec.isTerminated()){
                Long end = System.currentTimeMillis() / 1000;
                Long total = end - begin;
                System.out.println("花费时间：" + total);
                break;
            }
        }
    }
}
