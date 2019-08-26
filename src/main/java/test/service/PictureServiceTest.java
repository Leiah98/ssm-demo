package test.service;

import com.ssm.demo.entity.Picture;
import com.ssm.demo.service.PictureService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class PictureServiceTest {

    @Autowired
    private PictureService pictureService;

    /**
     * pictureService的save()方法单元测试
     */
    @Test
    public void save() {
        Picture picture = new Picture();
        picture.setPath("http://localhost:8080/dist/img/avatar5.png");
        picture.setRemark("Service单元测试");
        Assert.assertTrue(pictureService.save(picture) > 0);
    }
}