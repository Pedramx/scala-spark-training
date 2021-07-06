package ScalaBasics

import scala.annotation.tailrec

object TailRecursion extends App {
  //stack frame, tail recursion

  def factorial(n: Int): Int = {
    if(n <= 1) 1
    else {
      println("computing Factorial of " + n + " first need to have n - 1 factorial")
      val results = n * factorial(n - 1)
      println("computed factorial of " + n)
      results
    }
  }
  //java.lang.StackOverFlow
  //println(factorial(1233444556))
  println(factorial(10))

  def goodFactorial(n: Int): BigInt = {
    def facthelper(x: Int, accumulator: Int): BigInt =
      if(x <= 1) accumulator else facthelper(x - 1, x * accumulator)
    facthelper(n, 1) // tail recursion is calling your recursive function as last line in codeblocks @tailrec
  }

  println(goodFactorial(1235678999))
}
