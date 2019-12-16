package grp.faq.dao

import java.lang

import grp.faq.entity.Article
import org.apache.ibatis.annotations.Param
import java.util.List

trait ArticleMapper {
  def getTodayAritcle(): Long

  def delete(cArtid: lang.Long): Boolean

  def updateArticle(article: Article): Boolean

  def getAllArticle(): List[Article]
}
