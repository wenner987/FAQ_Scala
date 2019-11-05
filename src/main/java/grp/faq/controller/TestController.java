package grp.faq.controller;


import grp.faq.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/action", method = RequestMethod.GET)
public class TestController {

    @Autowired
    private GroupService groupService;

    @RequestMapping(value = "/action.action")
    public String test(Model a){
//        groupService.insert("admin", "管理员组");
        return "index";
    }
}
