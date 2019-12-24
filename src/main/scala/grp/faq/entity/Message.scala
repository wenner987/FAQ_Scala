package grp.faq.entity

import scala.beans.BeanProperty

class Message() {
  @BeanProperty
  var cMessageId: Integer = null
  @BeanProperty
  var cMessageSource: String = null
  @BeanProperty
  var cMessageType: Integer = null
  @BeanProperty
  var cReaded: Integer = null

  def this(cMessageId: Integer, cMessageSource: String, cMessageType: Integer, cReaded: Integer) {
    this()
    this.cMessageId = cMessageId
    this.cMessageSource = cMessageSource
    this.cMessageType = cMessageType
    this.cReaded = cReaded
  }
}