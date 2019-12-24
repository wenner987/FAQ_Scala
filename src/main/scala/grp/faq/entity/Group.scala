package grp.faq.entity

import scala.beans.BeanProperty

class Group() {
  @BeanProperty
  var cGid = 0L: Long
  @BeanProperty
  var cDesc: String = null
  @BeanProperty
  @BeanProperty
  var cIsDelete = 0: Byte
  @BeanProperty
  var cGroupName: String = null
  @BeanProperty
  var cAddAllow: String = null

  def this(cGid: Long, cDesc: String, cIsDelete: Byte, cGroupName: String, cAddAllow: String) {
    this()
    this.cGid = cGid
    this.cDesc = cDesc
    this.cIsDelete = cIsDelete
    this.cGroupName = cGroupName
    this.cAddAllow = cAddAllow
  }
}