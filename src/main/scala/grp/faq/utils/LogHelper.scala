package grp.faq.utils

import org.apache.log4j.Logger

trait LogHelper {
  lazy val logger = Logger.getLogger(this.getClass)

  def fun: Unit = println(2333)
}
