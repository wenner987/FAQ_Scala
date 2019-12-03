package grp.faq.dao;

import grp.faq.entity.Praise;

public interface PraiseMapper {
    int deleteByPrimaryKey(Long cPraiseid);

    int insert(Praise record);

    int insertSelective(Praise record);

    Praise selectByPrimaryKey(Long cPraiseid);

    int updateByPrimaryKeySelective(Praise record);

    int updateByPrimaryKey(Praise record);
}