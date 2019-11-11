package grp.faq.controller;

import com.alibaba.fastjson.JSONObject;
import grp.faq.entity.GroupEntity;
import grp.faq.paramcheck.GroupControllerCheck;
import grp.faq.service.GroupService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/group", method = RequestMethod.POST)
public class GroupController {

    @Autowired
    GroupService groupService;

    @Autowired
    GroupControllerCheck groupControllerCheck;

    Logger logger = Logger.getLogger(GroupController.class);

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public String createGroup(String name, String desc){
        JSONObject json = new JSONObject();
        boolean check = false;
        logger.info("name=" + name);
        logger.debug("desc=" + desc);
        try{
            check = groupControllerCheck.checkNameAndDesc(name, desc);
        } catch (Exception e) {
            json.put("RESULT", "FAILURE");
            json.put("REASON", e.getMessage());
        }
        if(check){
            try{
                groupService.insertGroup(name, desc);
                json.put("RESULT", "SUCCESS");
            }catch (Exception e){
                json.put("RESULT", "FAILURE");
                json.put("REASON", e.getMessage());
            }
        }
        logger.info("result=" + json);
        return json.toString();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public String deleteGroup(String id) {
        JSONObject json = new JSONObject();
        boolean check = false;
        logger.info("id=" + id);
        try {
            check = groupControllerCheck.checkId(id);
        } catch (Exception e) {
            json.put("RESULT", "FAILURE");
            json.put("REASON", e.getMessage());
        }
        if(check){
            groupService.deleteGroup(id);
            json.put("RESULT", "SUCCESS");
        }
        return json.toString();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String updateGroup(String name, String desc){
        JSONObject json = new JSONObject();
        boolean check = false;
        logger.info("name=" + name);
        logger.debug("desc=" + desc);
        try{
            check = groupControllerCheck.checkNameAndDesc(name, desc);
        } catch (Exception e) {
            json.put("RESULT", "FAILURE");
            json.put("REASON", e.getMessage());
        }
        if(check){
            // TODO service wenner-20191106
//             groupService.updateGroup(name, desc);
            json.put("RESULT", "SUCCESS");
        }
        logger.info(json);
        return json.toString();
    }

    @RequestMapping(value = "/selectByName", method = RequestMethod.POST)
    @ResponseBody
    public String selectByName(String name){
        logger.info("name=" + name);
        JSONObject json = new JSONObject();
        json.put("RESULT", "SUCCESS");
        json.put("BODY", groupService.selectByName(name));
        logger.info("result=" + json);
        return json.toString();
    }
    @RequestMapping(value = "/selectAll", method = RequestMethod.POST)
    @ResponseBody
    public String selectAll(){
        JSONObject json = new JSONObject();
        List list = groupService.selectAll();
        logger.info("select result" + list);
        json.put("RESULT", "SUCCESS");
        json.put("LENGTH", list.size());
        json.put("BODY", list);
        return json.toString();
    }
    @RequestMapping(value = "/selectPagination", method = RequestMethod.POST)
    @ResponseBody
    public String selectPagination(String index){
        JSONObject json = new JSONObject();
        boolean check = false;
        Integer indexInteger = null;
        logger.info("index=" + index);
        try{
            check = groupControllerCheck.checkIndex(index);
        }catch (Exception e){
            json.put("RESULT", "FAILURE");
            json.put("REASON", e.getMessage());
        }
        if(check){
            List list = groupService.selectPagination(indexInteger);
            json.put("RESULT", "SUCCESS");
            json.put("LENGTH", list.size());
            json.put("LAST_PAGE", list.size() < 20 ? "Y" : "N");
        }
        logger.info("result=" + json);
        return json.toString();
    }
}
