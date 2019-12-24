package grp.faq.entity

import java.util.Date

import scala.beans.BeanProperty


class Article() {
  @BeanProperty
  var cArtid = 0L: Long
  @BeanProperty
  var cUid = 0: Byte
  @BeanProperty
  var cGid = 0L: Long
  @BeanProperty
  var cArtContext: String = null
  @BeanProperty
  var cArtTitle: String = null
  @BeanProperty
  var cArtCtime: Date = null
  @BeanProperty
  var cIsDelete = 0: Byte
  @BeanProperty
  var cLastUpdate: Date = null
  @BeanProperty
  var cBrowseCount = 0L: Long
  @BeanProperty
  var cGX = 0: Byte

  def this(cArtid: Long, cUid: Byte, cGid: Long, cArtContext: String, cArtTitle: String, cArtCtime: Date, cIsDelete: Byte, cLastUpdate: Date, cBrowseCount: Long, cGX: Byte) {
    this()
    this.cArtid = cArtid
    this.cUid = cUid
    this.cGid = cGid
    this.cArtContext = cArtContext
    this.cArtTitle = cArtTitle
    this.cArtCtime = cArtCtime
    this.cIsDelete = cIsDelete
    this.cLastUpdate = cLastUpdate
    this.cBrowseCount = cBrowseCount
    this.cGX = cGX
  }
}