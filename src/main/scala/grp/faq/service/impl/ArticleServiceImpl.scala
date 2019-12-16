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
    articleDao.getAllArticle()
  }

  override def changeArticle(article: Article): Boolean = {
    articleDao.updateArticle(article)
  }

  override def delete(article: Article): Boolean = {
    articleDao.delete(article.cArtid)
  }

  override def getTodayArticle(): Long = {
    articleDao.getTodayAritcle()
  }
}
