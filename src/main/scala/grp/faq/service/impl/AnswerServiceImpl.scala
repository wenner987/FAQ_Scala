package grp.faq.service.impl

import java.util

import grp.faq.dao.AnswerMapper
import grp.faq.entity.Answer
import grp.faq.service.AnswerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.List
import java.util.Map

@Service
class AnswerServiceImpl extends AnswerService{
  @Autowired
  val answerDao: AnswerMapper = null
  override def getTodayAnswer(): Long = {
    answerDao.getTodayAnswer()
  }

  override def getAnswer(qid: Int, uid: Int): List[Map[Object,Object]]= {
    answerDao.getAnswer(qid, uid)
  }

  override def addAnswer(answer: Answer): Boolean = {
    try{
      answerDao.addAnswer(answer)
      true
    }
    catch {
      case e: Exception =>
        false
    }

  }

  override def delete(ansid: Int): Boolean = {
    try{
      answerDao.delete(ansid)
      true
    }
    catch {
      case e: Exception =>
        false
    }
  }

  override def update(answer: Answer): Boolean = {
    try{
      answerDao.update(answer)
      true
    }
    catch {
      case e: Exception =>
        false
    }
  }

  override def getAnswerByUsername(username: String, index: Int): util.List[Map[String, String]] = {
    try{
      answerDao.getAnswerByUsername(username, index)
    }
    catch {
      case exception: Exception =>
        null
    }
  }
}
