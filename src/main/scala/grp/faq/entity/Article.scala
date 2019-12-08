package grp.faq.entity

import java.util.Date

import scala.beans.BeanProperty

class Article() {
  @BeanProperty var cArtid: Long = 0L
  @BeanProperty var cUid: Int = 0
  @BeanProperty var cGid: Long = 0L
  @BeanProperty var cArtContext: String = null
  @BeanProperty var cArtTitle: String = null
  @BeanProperty var cArtCtime: Date = null
  @BeanProperty var cIsDelete: Int = 0
  @BeanProperty var cLastUpdate: Date = null
  @BeanProperty var cBrowseCount: Long = 0L
  @BeanProperty var cGX: Int = 0

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