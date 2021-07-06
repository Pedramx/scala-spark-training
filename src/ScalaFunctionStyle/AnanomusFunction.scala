package ScalaFunctionStyle

object AnanomusFunction  extends App {

  var doubler: Int => Int = new Function[Int, Int] {
    override def apply(v1: Int): Int = v1 * 2
  }

  // functional approach
  val doubler1: Int => Int = (x: Int) => x * 2

  val adder: (Int, Int)=> Int = (x: Int , y: Int) => x + y

  // lambda: ananomus function
  val multiply = (x: Int, y: Int, z: Int) => x * y * z

  // I don't have parameters
  val paramless = () => "Hi whasaaapppp?"
  println(paramless) //function itself
  println(paramless())// call lambda function

  //lambda sugars

  val sugarIncrementer: Int => Int = _ + 1  // (x: Int) => x + 1
  println(sugarIncrementer(10))

  val sugarAdder: (Int, Int) => Int = _ + _

  val myAdder = (x: Int) => (y: Int) => x + y

  // Function Currying
  println(myAdder(4)(5))
}
