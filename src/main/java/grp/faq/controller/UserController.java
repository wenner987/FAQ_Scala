package grp.faq.controller;

import grp.faq.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/user", method = RequestMethod.GET)
public class UserController {

    @Autowired
    UserService userService;


    Logger logger = Logger.getLogger(UserController.class);

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(String username, String password, String code, HttpSession session){
        String stdCode = (String) session.getAttribute("code");
        logger.debug("log info");
        if(stdCode != null && stdCode.equals(code)){
            if(userService.loginCheck(username, password)) {
                return "index";
            }
            else{
                return "login";
            }
        }
        else {
            return "login";
        }
    }
}
