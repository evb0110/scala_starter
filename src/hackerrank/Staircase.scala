package hackerrank

object Staircase extends App {

  def staircase(n: Int) {
    (1 to n).foreach(i => {
      println(" " * (n - i) + "#" * i)
    })
  }

  staircase(20)


}
