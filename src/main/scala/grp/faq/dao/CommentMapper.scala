package grp.faq.dao

import java.util

import grp.faq.entity.Comment
import org.apache.ibatis.annotations.Param

trait CommentMapper {
  def getCommentByQid(@Param("qid")qid: Int): util.List[Comment]

  def getComment(@Param("commentType")commentType: Int, @Param("commentId")commentId: Int): util.List[util.Map[Object, Object]]

  def addComment(comment: Comment): Int

}
