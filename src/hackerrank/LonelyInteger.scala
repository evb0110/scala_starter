package hackerrank

import scala.collection.mutable

object LonelyInteger extends App {

  def lonelyinteger(a: Array[Int]): Int = {
    var set: Set[Int] = Set()

    a.foreach(el =>
      if (!set(el)) set += el
      else set -= el)

    val b = set.toArray
    b(0)

  }

  println(lonelyinteger(Array(1, 2, 3, 4, 3, 2, 1)))
}
