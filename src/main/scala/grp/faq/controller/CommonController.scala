package grp.faq.controller

import com.alibaba.fastjson.JSONObject
import grp.faq.entity.Comment
import grp.faq.service.CommentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody}

@Controller
@RequestMapping(value = Array("/comment"))
class CommonController {

  @Autowired
  val commentService: CommentService = null

  @RequestMapping(value = Array("/add"), method = Array(RequestMethod.POST))
  @ResponseBody
  def addComment(common: Comment): String ={
    val json = new JSONObject()
    json.put("ERROR", if(commentService.addComment(common)) 0 else 1)
    json.toJSONString
  }
  @RequestMapping(value = Array("/get"), method = Array(RequestMethod.POST))
  @ResponseBody
  def getComment(commentType: Int, commentId: Int): String ={
    val json = new JSONObject()
    val comment = commentService.getComment(commentType, commentId)
    if(comment != null){
      json.put("COMMENTS", comment)
      json.put("ERROR", 0)
    }
    else{
      json.put("ERROR", 1)
    }
    json.toJSONString
  }
}
