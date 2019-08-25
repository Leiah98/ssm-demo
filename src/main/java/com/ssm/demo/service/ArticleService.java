package com.ssm.demo.service;

import com.ssm.demo.entity.Article;
import com.ssm.demo.utiles.PageResult;
import com.ssm.demo.utiles.PageUtil;

import java.util.List;
import java.util.Map;

/**
 * @program: ssm-demo
 * @description: 富文本的service层
 * @author: Leiah1998
 * @create: 2019-08-23
 **/
public interface ArticleService {

    PageResult getArticlePage(PageUtil pageUtil);

    Article queryObject(Integer id);

    List<Article> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(Article article);

    int update(Article article);

    int delete(Integer id);

    int deleteBatch(Integer[] ids);
}
