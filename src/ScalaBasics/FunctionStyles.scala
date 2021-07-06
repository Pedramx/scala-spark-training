package ScalaBasics

object FunctionStyles extends App {

  class Person(val name: String, favMovie: String) {
    def likes(movie: String): Boolean = movie == favMovie
  }

  val pedram = new Person("Pedram", "Avengers: End Game")
  println(pedram.likes("Avengers: End Game"))
  //INFIX NOTATION (OBJ FUNC PARAMETER => OBJ.FUND(PARAMETER))
  //INFIX NOTATION WORKS ONLY WITH SINGLE PARAMETERS
  println(pedram likes "Avengers: End Game")

  //ALL OPERATORS ARE INTERNALLY NOTHING BUT FUNCTION
  println(2.+(3))

  //PREFIX NOTATION
  val x = -5
  val x1 = 5.unary_-
  println(x1)

  //POSTFIX NOTATIONS
  //if my function does not have any parameter I can use post fix operator 

}
