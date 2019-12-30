package grp.faq.dao

import java.{lang, util}

import grp.faq.entity.Article
import org.apache.ibatis.annotations.Param
import java.util.List

trait ArticleMapper {
  def getArticleByUsername(@Param("username")username: String, @Param("index")index: Int): List[Article]

  def add(article: Article): Int

  def getTodayAritcle(): Long

  def delete(cArtid: lang.Long): Boolean

  def updateArticle(article: Article): Boolean

  def getAllArticle(): List[Article]
}
