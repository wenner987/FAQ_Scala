package grp.faq.paramcheck.impl;

import grp.faq.paramcheck.GroupControllerCheck;
import org.springframework.stereotype.Service;

@Service
public class GroupControllerCheckImpl implements GroupControllerCheck {

    public Boolean checkNameAndDesc(String name, String desc)throws Exception{
        if(name != null && desc != null){
            if(name.length() > 25 || desc.length() > 100){
                throw new Exception("The param name length have to less than 25 and desc length less than 100.");
            }
        }else{
            throw new Exception("You have to use name and desc params.");
        }
        return true;
    }

    public Boolean checkId(String id) throws Exception {
        if(id == null){
            throw new Exception("You have to user id param.");
        }
        try{
            Integer.valueOf(id);
        }catch (NumberFormatException e){
            throw new Exception("Id must be a number.");
        }
        return true;
    }

    public Boolean checkIndex(String index) throws Exception {
        if(index != null){
            try{
                Integer.valueOf(index);
            }
            catch (NumberFormatException e){
                throw new Exception("The index must be integer.");
            }
        }else{
            throw new Exception("You have to use index param.");
        }
        return true;
    }

}
