package grp.faq.service

import java.util.List
import java.util.Map

import grp.faq.entity.Question

trait QuestionService {
  def getQuestion(question: Question): Map[Object,Object]

  def addQuestion(question: Question): Boolean

  def getQuestionRank(index: Int): List[Question]


  def getTodayQuestion(): Long

}
