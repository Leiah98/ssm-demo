package test.dao;

import com.ssm.demo.dao.PictureDao;
import com.ssm.demo.entity.Picture;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class PictureDaoTest {

    @Autowired
    private PictureDao pictureDao;

    /**
     * pictureDao的insertPicture()方法单元测试
     */
    @Test
    public void insertPicture() {
        Picture picture = new Picture();
        picture.setPath("path");
        picture.setRemark("DAO单元测试");
        Assert.assertTrue(pictureDao.insertPicture(picture) > 0);
    }

    /**
     * pictureDao的findPictureById()方法的单元测试
     */
    @Test
    public void findPictureById() {
        Picture picture1 = pictureDao.findPictureById(900);
        //id为900的图片为空
        Assert.assertNull(picture1);

        Picture picture2 = pictureDao.findPictureById(21);
        //id为21的图片不为空
        Assert.assertNotNull(picture2);
    }
}