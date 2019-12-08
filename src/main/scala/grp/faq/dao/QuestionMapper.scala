package grp.faq.dao

import grp.faq.entity.Question

trait QuestionMapper {
  def deleteByPrimaryKey(cQid: Long): Int

  def insert(record: Question): Int

  def insertSelective(record: Question): Int

  def selectByPrimaryKey(cQid: Long): Question

  def updateByPrimaryKeySelective(record: Question): Int

  def updateByPrimaryKey(record: Question): Int
}