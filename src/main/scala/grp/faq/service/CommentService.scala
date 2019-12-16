package grp.faq.service

import grp.faq.entity.Comment

trait CommentService {
  def addComment(comment: Comment): Boolean

}
