package ScalaBasics

import scala.annotation.tailrec

object DefaultArgsDemo extends App {

  def goodFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: Int = 1): BigInt =
      if(x <= 1) accumulator else factHelper(x - 1, x * accumulator)
    factHelper(n) // tail recursion is calling your recursive function as last line in codeblocks @tailrec
  }

  def students(id: Int = 1000, name: String = "xyz", age: Int = 11) = {
    s"students details id: $id , name: $name , age: $age"
  }

  println(students(1024))
  println(students(name = "Pedram"))

}
