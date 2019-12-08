package grp.faq.service

import grp.faq.entity.Group

trait GroupService {
  def add(group: Group): Boolean

}
