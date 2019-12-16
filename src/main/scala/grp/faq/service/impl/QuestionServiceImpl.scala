package grp.faq.service.impl

import java.util

import grp.faq.dao.QuestionMapper
import grp.faq.entity.Question
import grp.faq.service.QuestionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class QuestionServiceImpl extends QuestionService{
  @Autowired
  val questionDao: QuestionMapper = null
  override def getTodayQuestion(): Long = {
    questionDao.getTodayQuestion()
  }

  override def getQuestionRank(index: Int): util.List[Question] = {
    var questions: util.List[Question] = null
    try{
      questions = questionDao.getQuestionRank(index * 10)
      questions
    }
    catch {
      case e: Exception =>
        null
    }
  }

  override def addQuestion(question: Question): Boolean = {
    try{
      questionDao.addQuestion(question)
      true
    }
    catch {
      case exception: Exception =>
        false
    }
  }

  override def getQuestion(question: Question): Question = {
    try{
      questionDao.getQuestion(question)
    }
    catch {
      case exception: Exception =>
        null
    }
  }
}
