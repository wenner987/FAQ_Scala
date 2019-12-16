package grp.faq.service.impl

import grp.faq.dao.ArticleMapper
import grp.faq.entity.Article
import grp.faq.service.ArticleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.List

@Service
class ArticleServiceImpl extends ArticleService{

  @Autowired
  val articleDao: ArticleMapper = null

  override def getAllArticle: List[Article] = {
    try{
      articleDao.getAllArticle()
    }
    catch {
      case e: Exception =>
        null
    }
  }

  override def changeArticle(article: Article): Boolean = {
    try{
      articleDao.updateArticle(article)
      true
    }
    catch {
      case e: Exception =>
        false
    }
  }

  override def delete(article: Article): Boolean = {
    try{
      articleDao.delete(article.cArtid)
      true
    }
    catch {
      case e: Exception =>
        false
    }
  }

  override def getTodayArticle(): Long = {
    articleDao.getTodayAritcle()
  }

  override def add(article: Article): Boolean = {
    try{
      articleDao.add(article)
      true
    }
    catch {
      case e: Exception =>
        false
    }
  }
}
