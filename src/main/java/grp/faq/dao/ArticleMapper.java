package grp.faq.dao;

import grp.faq.entity.Article;

public interface ArticleMapper {
    int deleteByPrimaryKey(Long cArtid);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Long cArtid);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);
}
