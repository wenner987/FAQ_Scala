package grp.faq.dao

import java.util.Map
import java.util.List

import com.alibaba.fastjson.JSONObject
import grp.faq.entity.Question
import org.apache.ibatis.annotations.Param

trait QuestionMapper {
  def getQUestionByUsername(@Param("username")username: String, @Param("index")index: Int): List[Question]

  def getQuestionNumber(): Int

  def getQuestion(question: Question): Map[Object,Object]

  def addQuestion(question: Question): Int

  def getQuestionRank(@Param("index")index: Int): List[Question]

  def getTodayQuestion(): Long
}
