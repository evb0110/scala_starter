package basic_syntax

object factorial extends App {

  def factorial(n: BigInt): BigInt = {
    def helper(i: BigInt, acc: BigInt): BigInt = {
      if (i > n) acc
      else helper(i + 1, acc * i)
    }

    helper(1, 1)
  }

  println(factorial(5000))
}
