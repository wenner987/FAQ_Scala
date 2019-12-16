package grp.faq.service

import grp.faq.entity.Comment
import java.util.List
import java.util.Map

trait CommentService {
  def getComment(commentType: Int, commentId: Int): List[Map[Object,Object]]


  def addComment(comment: Comment): Boolean

}
