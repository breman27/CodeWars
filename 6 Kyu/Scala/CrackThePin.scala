package com.example
import java.security.MessageDigest

/**
 * https://www.codewars.com/kata/5efae11e2d12df00331f91a6
 */
object CrackThePin {
  def hashStr(s: String): String = {
    val m = java.security.MessageDigest.getInstance("MD5")
    val b = s.getBytes("UTF-8")
    m.update(b, 0, b.length)
    new java.math.BigInteger(1, m.digest()).toString(16)
  }

  def crack(hash: String): String = {
    var hit = ""
    for(s <- (0 to 99999)) {
      if(hash == hashStr("%05d".format(s))) {
        hit = "%05d".format(s)
      }
    }
    hit
  }
}