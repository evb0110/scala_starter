package hackerrank

import scala.annotation.tailrec

object PokerNim extends App {

  def aVeryBigSum(ar: Array[Long]): Long = {

    @scala.annotation.tailrec
    def helper(ar: Array[Long], sum: Long): Long = {
      if (ar.length == 0) sum
      else {
        val el = ar(0)
        val newAr = ar.drop(1)
        helper(newAr, sum + el)
      }
    }



    //    helper(ar, 0)
    ar.sum

  }

  println(aVeryBigSum(Array(12345678, 34567890)))

}
