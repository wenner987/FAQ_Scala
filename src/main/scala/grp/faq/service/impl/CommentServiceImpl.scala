package grp.faq.service.impl

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
}
