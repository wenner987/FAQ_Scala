package grp.faq.entity

import scala.beans.BeanProperty

class Group() {
  @BeanProperty var cGid: Long = 0L
  @BeanProperty var cDesc: String = null
  @BeanProperty var cIsDelete: Int = 0
  @BeanProperty var cGroupName: String = null

  def this(cGid: Long, cDesc: String, cIsDelete: Byte, cGroupName: String) {
    this()
    this.cGid = cGid
    this.cDesc = cDesc
    this.cIsDelete = cIsDelete
    this.cGroupName = cGroupName
  }
}