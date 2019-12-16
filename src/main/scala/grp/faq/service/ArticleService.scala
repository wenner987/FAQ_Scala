package grp.faq.service

import grp.faq.entity.Article
import java.util.List

trait ArticleService {
  def getTodayArticle(): Long

  def delete(article: Article): Boolean

  def getAllArticle(): List[Article]

  def changeArticle(article: Article): Boolean
}
