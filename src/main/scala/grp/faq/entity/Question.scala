package grp.faq.entity

import java.util.Date

import scala.beans.BeanProperty

class Question() {
  @BeanProperty var cQid: Long = 0L
  @BeanProperty var cUid: Int = 0
  @BeanProperty var cQTitle: String = null
  @BeanProperty var cClose: Int = 0
  @BeanProperty var cCreateTime: Date = null
  @BeanProperty var cQContext: String = null
  @BeanProperty var cGX: Int = 0

  def this(cQid: Long, cUid: Byte, cQTitle: String, cClose: Byte, cCreateTime: Date, cQContext: String, cGX: Byte) {
    this()
    this.cQid = cQid
    this.cUid = cUid
    this.cQTitle = cQTitle
    this.cClose = cClose
    this.cCreateTime = cCreateTime
    this.cQContext = cQContext
    this.cGX = cGX
  }
}