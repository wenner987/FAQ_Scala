package grp.faq.entity

import java.util.Date


class Comment() {
  var cComid = 0L: Long
  var cUid = 0: Byte
  var cContext: String = null
  var cCreateTime: Date = null
  var cIsDelete = 0: Byte
  var cComType = 0: Byte
  var cCommonId = 0L: Long

  def this(cComid: Long, cUid: Byte, cContext: String, cCreateTime: Date, cIsDelete: Byte, cComType: Byte, cCommonId: Long) {
    this()
    this.cComid = cComid
    this.cUid = cUid
    this.cContext = cContext
    this.cCreateTime = cCreateTime
    this.cIsDelete = cIsDelete
    this.cComType = cComType
    this.cCommonId = cCommonId
  }
}