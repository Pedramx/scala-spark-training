package ScalaBasics

object FunctionBasics extends App {

  def fConcat (a: String, b: String): String = {
    return a + b
  }

  def fSum (a: Int, b: Int ): Int = a + b


  println(fConcat("hello", "world"))
  println(fSum(12, 13))

  // calling a function is also an expression

  def paramless(): Unit = {
    println("hello scala world")
  }

  println(paramless())
  println(paramless)

  def factorial(n: Int): Int = {
    if(n == 0) 1
    else n * factorial(n - 1)
  }

  println(factorial(3))

  def finonachi(n: Int) : Int = {
    if(n <= 2) 1
    else finonachi(n-1) + finonachi(n-2)
  }

  println(finonachi(8))
}
