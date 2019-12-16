package grp.faq.dao

import java.util.Map
import java.util.List

import grp.faq.entity.Question
import org.apache.ibatis.annotations.Param

trait QuestionMapper {
  def getQuestion(question: Question): Map[Object,Object]

  def addQuestion(question: Question): Int

  def getQuestionRank(@Param("index")index: Int): List[Question]

  def getTodayQuestion(): Long
}
