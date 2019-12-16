package grp.faq.service.impl

import java.util

import grp.faq.dao.MessageMapper
import grp.faq.entity.Message
import grp.faq.service.MessageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.List

@Service
class MessageServiceImpl extends MessageService{
  @Autowired
  val messageDao: MessageMapper = null
  override def getMessage(uid: Int): util.List[Message] = {
    var messages: List[Message] = null
    try{
      messages = messageDao.getMessage(uid)
      messages
    }
    catch {
      case e: Exception =>
        null
    }
  }
}
