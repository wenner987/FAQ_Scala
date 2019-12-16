package grp.faq.service.impl

import grp.faq.dao.AnswerMapper
import grp.faq.service.AnswerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AnswerServiceImpl extends AnswerService{
  @Autowired
  val answerDao: AnswerMapper = null
  override def getTodayAnswer(): Long = {
    answerDao.getTodayAnswer()
  }
}
