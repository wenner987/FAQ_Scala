package grp.faq.dao;

import grp.faq.entity.Question;

public interface QuestionMapper {
    int deleteByPrimaryKey(Long cQid);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(Long cQid);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}