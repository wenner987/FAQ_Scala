package grp.faq.dao

import java.util

import grp.faq.entity.Answer
import org.apache.ibatis.annotations.Param
import java.util.List
import java.util.Map

trait AnswerMapper {
  def getAnswerByUsername(@Param("username")username: String, @Param("index")index: Int): List[Map[String, String]]

  def update(answer: Answer): Int

  def delete(@Param("ansid")ansid: Int): Int

  def addAnswer(answer: Answer): Int

  def getAnswer(@Param("qid")qid: Int, @Param("uid")uid: Int): List[Map[Object,Object]]

  def getTodayAnswer(): Long
}