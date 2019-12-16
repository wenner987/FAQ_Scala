package grp.faq.service

import java.util.List

import grp.faq.entity.Message

trait MessageService {
  def getMessage(uid: Int): List[Message]

}
