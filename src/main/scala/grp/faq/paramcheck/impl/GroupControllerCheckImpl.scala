package grp.faq.paramcheck.impl

import grp.faq.controller.UserController
import grp.faq.paramcheck.GroupControllerCheck
import org.springframework.stereotype.Service

@Service class GroupControllerCheckImpl extends GroupControllerCheck {
  @throws[Exception]
  override def checkNameAndDesc(name: String, desc: String) = {
    if (name != null && desc != null) if (name.length > 25 || desc.length > 100) throw new Exception("The param name length have to less than 25 and desc length less than 100.")
    else throw new Exception("You have to use name and desc params.")
    true
  }

  @throws[Exception]
  override def checkId(id: String) = {
    if (id == null) throw new Exception("You have to user id param.")
    try Integer.valueOf(id)
    catch {
      case e: NumberFormatException =>
        throw new Exception("Id must be a number.")
    }
    true
  }

  @throws[Exception]
  override def checkIndex(index: String) = {
    if (index != null) try Integer.valueOf(index)
    catch {
      case e: NumberFormatException =>
        throw new Exception("The index must be integer.")
    }
    else throw new Exception("You have to use index param.")
    true
  }
}