package grp.faq.dao

import grp.faq.entity.Article

trait ArticleMapper {
  def deleteByPrimaryKey(cArtid: Long): Int

  def insert(record: Article): Int

  def insertSelective(record: Article): Int

  def selectByPrimaryKey(cArtid: Long): Article

  def updateByPrimaryKeySelective(record: Article): Int

  def updateByPrimaryKey(record: Article): Int
}