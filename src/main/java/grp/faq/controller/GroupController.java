package grp.faq.controller;

import com.alibaba.fastjson.JSONObject;
import grp.faq.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/group", method = RequestMethod.POST)
public class GroupController {
    @Autowired
    GroupService groupService;
    @RequestMapping(value = "create", method = RequestMethod.POST)
    @ResponseBody
    public String createGroup(String name, String desc){
        JSONObject json = new JSONObject();
        return json.toString();
    }
}
