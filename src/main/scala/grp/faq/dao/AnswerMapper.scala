package grp.faq.dao

import grp.faq.entity.Answer

trait AnswerMapper {
  def deleteByPrimaryKey(cAnsid: Long): Int

  def insert(record: Answer): Int

  def insertSelective(record: Answer): Int

  def selectByPrimaryKey(cAnsid: Long): Answer

  def updateByPrimaryKeySelective(record: Answer): Int

  def updateByPrimaryKey(record: Answer): Int
}