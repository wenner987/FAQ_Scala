package grp.faq.service

import java.util.List

import grp.faq.entity.Message

trait MessageService {
  def readed(messageId: Int): Boolean = ???

  def getMessage(uid: Int): List[Message]

}
