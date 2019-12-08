package grp.faq.dao

import grp.faq.entity.Group

trait GroupMapper {
  def deleteByPrimaryKey(cGid: Long): Int

  def insert(record: Group): Int

  def insertSelective(record: Group): Int

  def selectByPrimaryKey(cGid: Long): Group

  def updateByPrimaryKeySelective(record: Group): Int

  def updateByPrimaryKey(record: Group): Int
}