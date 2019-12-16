package grp.faq.controller

import com.alibaba.fastjson.JSONObject
import grp.faq.entity.Article
import grp.faq.service.ArticleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}
import java.util.List

@Controller
@RequestMapping(value = Array("/article"))
class ArticleController {

  @Autowired
  val articleService: ArticleService = null

  @RequestMapping(value = Array("/get_all"), method = Array(RequestMethod.POST))
  @ResponseBody
  def getAllArticles: String = {
    val json = new JSONObject()
    val articles: List[Article] = articleService.getAllArticle()
    if(articles != null){
      json.put("ARTICLES", articles)
      json.put("ERROR", 0)
    }
    else{
      json.put("ERROR", 1)
    }
    json.toJSONString
  }

  @RequestMapping(value = Array("/update"), method = Array(RequestMethod.POST))
  def updateArticle(article: Article): String = {
    val json: JSONObject = new JSONObject()
    json.put("ERROR", if(articleService.changeArticle(article)) 0 else 1)
    json.put("SUCCESS", if(json.get("ERROR") == 1) 0 else 1)
    json.toJSONString
  }

  @RequestMapping(value = Array("/delete"), method = Array(RequestMethod.POST))
  @ResponseBody
  def deleteArticle(article: Article): String = {
    val json: JSONObject = new JSONObject()
    articleService.delete(article)
    json.toJSONString
  }
  @RequestMapping(value = Array("/getTodayAnswer"), method = Array(RequestMethod.POST))
  @ResponseBody
  def getTodayAnswer(): String ={
    val json = new JSONObject()
    json.put("COUNT", articleService.getTodayArticle())
    json.put("ERROR", 0)
    json.toJSONString
  }
}
