package grp.faq.dao

import grp.faq.entity.Praise
import org.apache.ibatis.annotations.Param

trait PraiseMapper {
  def praise(@Param("type")praiseType: Int, @Param("id")id: Long, @Param("uid")uid: Long): Int
}