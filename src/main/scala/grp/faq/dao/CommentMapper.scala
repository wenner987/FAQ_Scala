package grp.faq.dao

import grp.faq.entity.Comment

trait CommentMapper {
  def addComment(comment: Comment): Int

}
