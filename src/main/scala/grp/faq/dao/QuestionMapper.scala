package grp.faq.dao

import java.util

import grp.faq.entity.Question
import org.apache.ibatis.annotations.Param

trait QuestionMapper {
  def getQuestionRank(@Param("index")index: Int): util.List[Question]

  def getTodayQuestion(): Long
}
