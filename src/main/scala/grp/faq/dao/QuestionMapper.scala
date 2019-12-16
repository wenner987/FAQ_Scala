package grp.faq.dao

import java.util

import grp.faq.entity.Question
import org.apache.ibatis.annotations.Param

trait QuestionMapper {
  def getQuestion(question: Question): Question

  def addQuestion(question: Question): Int

  def getQuestionRank(@Param("index")index: Int): util.List[Question]

  def getTodayQuestion(): Long
}
