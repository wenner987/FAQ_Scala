package grp.faq.entity

import java.util.Date

import scala.beans.BeanProperty

class User() {
  @BeanProperty var cUid: Byte = 0
  @BeanProperty var cGid: Long = 0L
  @BeanProperty var cAdmin: Int = 0
  @BeanProperty var cUsername: String = null
  @BeanProperty var cPassword: String = null
  @BeanProperty var cScore: Long = 0L
  @BeanProperty var cLastLogin: Date = null
  @BeanProperty var cMailBox: String = null
  @BeanProperty var cIsDelete: Int = 0

  def this(cUid: Byte, cGid: Long, cAdmin: Byte, cUsername: String, cPassword: String, cScore: Long, cLastLogin: Date, cMailBox: String, cIsDelete: Byte) {
    this()
    this.cUid = cUid
    this.cGid = cGid
    this.cAdmin = cAdmin
    this.cUsername = cUsername
    this.cPassword = cPassword
    this.cScore = cScore
    this.cLastLogin = cLastLogin
    this.cMailBox = cMailBox
    this.cIsDelete = cIsDelete
  }
}
