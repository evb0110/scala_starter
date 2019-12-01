package hackerrank

object PlusMinus extends App {

  def plusMinus(arr: Array[Int]) {
    var plusCounter: Int = 0
    var minusCounter: Int = 0
    var zeroCounter: Int = 0

    arr.foreach(el => {
      if (el > 0) plusCounter += 1
      else if (el < 0) minusCounter += 1
      else if (el == 0) zeroCounter += 1
    })

    println(plusCounter.toFloat / arr.length)
    println(minusCounter.toFloat / arr.length)
    println(zeroCounter.toFloat / arr.length)

  }

  plusMinus(Array(-4, 3, -9, 0, 4, 1))

}
