package grp.faq.entity

import scala.beans.BeanProperty

class Praise() {
  @BeanProperty var cPraiseid: Long = 0L
  @BeanProperty var cUid: Int = 0
  @BeanProperty var cPratype: Int = 0
  @BeanProperty var cCommonId: Long = 0L
  @BeanProperty var cIsDelete: Int = 0

  def this(cPraiseid: Long, cUid: Byte, cPratype: Byte, cCommonId: Long, cIsDelete: Byte) {
    this()
    this.cPraiseid = cPraiseid
    this.cUid = cUid
    this.cPratype = cPratype
    this.cCommonId = cCommonId
    this.cIsDelete = cIsDelete
  }
}