package grp.faq.entity

import java.util.Date

import scala.beans.BeanProperty

class Answer() {
  @BeanProperty var cAnsid: Long = 0L
  @BeanProperty var cUid: Int = 0
  @BeanProperty var cQid: Long = 0L
  @BeanProperty var cAnsTime: Date = null
  @BeanProperty var cAnsContext: String = null
  @BeanProperty var cIsDelete = 0
  @BeanProperty var cLastUpdate: Date = null
  @BeanProperty var cIsFold = 0

  def this(cAnsid: Long, cUid: Byte, cQid: Long, cAnsTime: Date, cAnsContext: String, cIsDelete: Byte, cLastUpdate: Date, cIsFold: Byte) {
    this()
    this.cAnsid = cAnsid
    this.cUid = cUid
    this.cQid = cQid
    this.cAnsTime = cAnsTime
    this.cAnsContext = cAnsContext
    this.cIsDelete = cIsDelete
    this.cLastUpdate = cLastUpdate
    this.cIsFold = cIsFold
  }
}