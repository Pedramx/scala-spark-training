package ScalaBasics

object ThisKeyWord extends App {

  class Person(name: String, age: Int) {
    val x = 2
    def this () = this("Pedram", 24)
    def introduction(name: String ) = println(s"${this.name} introduces to $name")
  }

  val myObj = new Person("Pedram", 24)
  myObj.introduction("Ali")

}
