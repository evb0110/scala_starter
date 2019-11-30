package hackerrank

object CompareTriplets extends App {
  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {

    @scala.annotation.tailrec
    def helper(a: Array[Int], b: Array[Int], aCount: Int, bCount: Int): Array[Int] = {
      if (a.length == 0) Array(aCount, bCount)

      else {
        val aEl = a(0)
        val bEl = b(0)
        val newA = a.slice(1, a.length)
        val newB = b.slice(1, b.length)

        if (aEl > bEl) helper(newA, newB, aCount + 1, bCount)
        else if (aEl < bEl) helper(newA, newB, aCount, bCount + 1)
        else helper(newA, newB, aCount, bCount)}
    }


    helper(a, b, 0, 0)
  }

  println(compareTriplets(Array(17, 28, 30), Array(99, 16, 8)).mkString("-"))
}
