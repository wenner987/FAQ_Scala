package grp.faq.service

import java.util.List

import grp.faq.entity.Question

trait QuestionService {
  def getQuestion(question: Question): Question

  def addQuestion(question: Question): Boolean

  def getQuestionRank(index: Int): List[Question]


  def getTodayQuestion(): Long

}
