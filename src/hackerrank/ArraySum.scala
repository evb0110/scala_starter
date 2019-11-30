package hackerrank

object ArraySum extends App{
  def simpleArraySum(ar: Array[Int]): Int = {

    @scala.annotation.tailrec
    def helper(ar: Array[Int], sum: Int): Int = {
      if (ar.length == 0) sum
      else {
        val el = ar(0)
        val newAr = ar.slice(1, ar.length)
        helper(newAr, el + sum)
      }
    }

    helper(ar, 0)

  }

  val ar1 = Array(1, 2, 3, 4)
  println(simpleArraySum(ar1))

}
