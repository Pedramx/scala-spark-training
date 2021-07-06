package ScalaFunctionStyle

object HigherOrderFunctionAdvanceCurries extends App {

  // function( function1 ) Higher Order Function Function() : Fun2()

  // Write a Function which applies a function n times over a value x

  //myNTime(f, n, x)
  //myFTime(f, 3, x) = f(f(f(x))) = myNTime(f, 2, f(x)) = myNTime(f, 1, f(f(x)))

  def myNTime(f: Int => Int, n: Int, x: Int) : Int = if(x <= 0) x else myNTime(f, n - 1, f(x))

  val plusOne = (x: Int) => x + 1

  // making things complex by specify multiple parameters/ intelligently I can divide them in multiple functions

  def betterNTimes(f: Int => Int, n: Int): Int => Int =
    if(n <= 0) (x: Int) => x
    else (x: Int) => betterNTimes(f, n - 1)(f(x))

  val myIncrementor = betterNTimes(plusOne, 10)
  println(myIncrementor(1))

  //curried function

  val myAdder = (x: Int) => (y: Int) => x + y
  println(myAdder(3)(4))

  val add4 = myAdder(4)
  println(add4(8))

  // function with multiple parameter list

  def curriedFormater(c: String)(x: Double): String = c.format(x)

  val myFormat: (Double => String) = curriedFormater("%4.2f")
  println(myFormat(Math.PI))

  // Scala and spark support very very good inbuilt higher order function (transformations)

  // FlatMap, map, filter, for
}
