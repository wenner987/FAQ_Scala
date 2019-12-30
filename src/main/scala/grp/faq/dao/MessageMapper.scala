package grp.faq.dao

import java.util

import grp.faq.entity.Message
import org.apache.ibatis.annotations.Param

trait MessageMapper {
  def addMessage(@Param("uid")uid:Long, @Param("messageType")messageType:Int, @Param("source")source:String): Int

  def readed(@Param("messageId")messageId: Int): Int

  def getMessage(@Param("uid")uid: Int): util.List[Message]

}
