package grp.faq.dao

import grp.faq.entity.Praise

trait PraiseMapper {
  def deleteByPrimaryKey(cPraiseid: Long): Int

  def insert(record: Praise): Int

  def insertSelective(record: Praise): Int

  def selectByPrimaryKey(cPraiseid: Long): Praise

  def updateByPrimaryKeySelective(record: Praise): Int

  def updateByPrimaryKey(record: Praise): Int
}