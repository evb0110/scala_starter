package hackerrank

object DiagonalDifference extends App {

  def diagonalDifference(arr: Array[Array[Int]]): Int = {

    val dimension: Int = arr.length

    val d1 = (0 until dimension).fold(0)((acc, j) => {
      acc + arr(j)(j)

    })

    val d2 = (0 until dimension).fold(0)((acc, j) => acc + arr(j)(dimension - 1 - j))
    scala.math.abs(d2 - d1)

  }

  println(
    diagonalDifference(Array(Array(1, 2, 3), Array(4, 5, 6), Array(10, 8, 9)))
  )

}
