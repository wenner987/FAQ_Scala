package grp.faq.dao

import java.util

import grp.faq.entity.Message
import org.apache.ibatis.annotations.Param

trait MessageMapper {
  def getMessage(@Param("uid")uid: Int): util.List[Message]

}
