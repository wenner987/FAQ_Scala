package grp.faq.service.impl

import java.util

import grp.faq.dao.CommentMapper
import grp.faq.entity.Comment
import grp.faq.service.CommentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CommentServiceImpl extends CommentService{
  @Autowired
  val commentDao: CommentMapper = null
  override def addComment(comment: Comment): Boolean = {
    try{
      commentDao.addComment(comment)
      true
    }
    catch {
      case e: Exception =>
        false
    }
  }

  override def getComment(commentType: Int, commentId: Int): util.List[util.Map[Object, Object]] = {
    try{
      commentDao.getComment(commentType, commentId)
    }
    catch {
      case e: Exception =>
        null
    }
  }

  override def getCommentByQid(qid: Int): util.List[Comment] = {
    var comments: util.List[Comment] = null
    try{
      comments = commentDao.getCommentByQid(qid)
      comments
    }
    catch {
      case e: Exception =>
        null
    }
  }
}
