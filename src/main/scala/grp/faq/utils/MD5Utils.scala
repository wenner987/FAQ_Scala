package gqp.faq.utils

import org.springframework.util.DigestUtils

object MD5Utils {

  val salt = "ashkfnsdaofy389u3278bn"

  def getMd5(seckillId: String): String = {
    val base = seckillId + "/" + salt
    DigestUtils.md5DigestAsHex(base.getBytes)
  }
}
