package com.ssm.demo.service.impl;

import com.ssm.demo.dao.ArticleDao;
import com.ssm.demo.entity.Article;
import com.ssm.demo.service.ArticleService;
import com.ssm.demo.utiles.PageResult;
import com.ssm.demo.utiles.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/**
 * @program: ssm-demo
 * @description: 富文本service层的实现
 * @author: Leiah1998
 * @create: 2019-08-23
 **/
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public PageResult getArticlePage(PageUtil pageUtil) {
        List<Article> articleList = articleDao.findArticles(pageUtil);
        int total = articleDao.getTotalArticles(pageUtil);
        return new PageResult(articleList, total, pageUtil.getLimit(), pageUtil.getPage());
    }

    @Override
    public Article queryObject(Integer id) {
        return articleDao.getArticleById(id);
    }

    @Override
    public List<Article> queryList(Map<String, Object> map) {
        return articleDao.findArticles(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return articleDao.getTotalArticles(map);
    }

    @Override
    public int save(Article article) {
        try {
            return articleDao.insertArticle(article);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update(Article article) {
        article.setUpdateTime(new Date());
        return articleDao.updArticle(article);
    }

    @Override
    public int delete(Integer id) {
        return articleDao.delArticle(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return articleDao.deleteBatch(ids);
    }

    @Override
    public int test(ExecutorService exec) {
        Date now = new Date();
        //创建连接池
        for (int i = 0; i < 20; i++){
            exec.submit(() -> {
                for (int i1 = 0; i1 < 30; i1++) {
                    Article article = new Article();
                    article.setAddName("Hua");
                    article.setArticleTitle("数据插入测试:" + i1 + "线程:" + Thread.currentThread().getId());
                    article.setArticleContent("数据插入测试" + i1 + "线程:" + Thread.currentThread().getName());
                    article.setCreateTime(now);
                    articleDao.insertArticle(article);
                }
            });
        }
        return 0;
    }
}
