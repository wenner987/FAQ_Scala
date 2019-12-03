package grp.faq.dao;

import grp.faq.entity.Answer;

public interface AnswerMapper {
    int deleteByPrimaryKey(Long cAnsid);

    int insert(Answer record);

    int insertSelective(Answer record);

    Answer selectByPrimaryKey(Long cAnsid);

    int updateByPrimaryKeySelective(Answer record);

    int updateByPrimaryKey(Answer record);

    int count();
}