package grp.faq.service

import java.util

import grp.faq.entity.Question

trait QuestionService {
  def getQuestionRank(index: Int): util.List[Question]


  def getTodayQuestion(): Long

}
