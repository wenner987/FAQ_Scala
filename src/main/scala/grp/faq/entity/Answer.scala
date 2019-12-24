package grp.faq.entity

import java.util.Date

import scala.beans.BeanProperty


class Answer() {
  @BeanProperty
  var cAnsid = 0L: Long
  @BeanProperty
  var cUid = 0: Byte
  @BeanProperty
  var cQid = 0L: Long
  @BeanProperty
  var cAnsTime: Date = null
  @BeanProperty
  var cAnsContext: String = null
  @BeanProperty
  var cIsDelete = 0: Byte
  @BeanProperty
  var cLastUpdate: Date = null
  @BeanProperty
  var cIsFold = 0: Byte

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