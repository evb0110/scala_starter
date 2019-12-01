package hackerrank

object ArraysDS extends App {
  def reverseArray(a: Array[Int]): Array[Int] = {
    a.reverse
  }

  val a = Array(1, 2, 3, 4, 5)
  println(reverseArray(a).mkString(", "))
}
