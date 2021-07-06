package ScalaBasics

object StringOppDemo extends App {
  val mystr = "Hello I am teaching sparck and scala"
  println(mystr.charAt(3))
  println(mystr.substring(1, 8))
  println(mystr.split(" ").toList)
  println(mystr.startsWith("Hello"))
  println(mystr.replace(" ", "%"))
  println(mystr.toLowerCase)

  val numberString = "54"
  val myNum = numberString.toInt
  println('a' +: numberString :+ 'b')

  var name = "Pedram"
  var age = 20

  //s interpretation for string
  val myStatement = s"Hi my name is $name and my age is ${age + 1}"

  println(myStatement)
}
