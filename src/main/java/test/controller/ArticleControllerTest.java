package test.controller;

import com.alibaba.fastjson.JSONObject;
import com.ssm.demo.entity.Article;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath:applicationContext.xml", "classpath:spring-mvc.xml", "classpath:mybatis-config.xml"})
public class ArticleControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        this.mockMvc = webAppContextSetup(this.wac).build();
    }

    @Test
    public void testArticleById() throws Exception{
        //请求方式为get
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder =
                MockMvcRequestBuilders.request(HttpMethod.GET, "/article/info/1");
        mockMvc.perform(mockHttpServletRequestBuilder).andExpect(status().isOk()).andDo(print());
    }


    @Test
    public void testArticleAdd() throws Exception{
        //创建对象
        Article article = new Article();
        article.setAddName("2567");
        article.setArticleTitle("Controller测试文章101");
        article.setArticleContent("Controller单元测试添加文章");
        //封装参数
        String requestParam = JSONObject.toJSONString(article);
        //请求方式为post
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder =
                MockMvcRequestBuilders.post("/articles/save");
        mockMvc.perform(mockHttpServletRequestBuilder
                .header("token", "3fd4edc35538b01ba9cbfc3d3eb1cb1c")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestParam)).andExpect(status().isOk()).andDo(print());
    }
}