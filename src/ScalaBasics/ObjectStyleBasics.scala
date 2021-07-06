package ScalaBasics

object ObjectStyleBasics {

  class MyTest {
    var i = 10
    def myFun: Unit = {
      println("I am using my function")
    }
    val testObj = new MyTest

    println(testObj.i)
    println(testObj.myFun)
  }

  // class parameters you can say a Primary Constructor
  // class parameters does not act as fields

  class Person(name: String, age: Int) {
    // if I want to convert this class parameter as class fields need to add var
  }

  class Person2(var name: String,var age: Int) {
    //auxilary constructor
    def this(name: String) = this (name, 24)

    def this() = this(" ", 0)
  }

  val personObj = new Person("Pedram", 24)
  val personObj2 = new Person2("Pedram");

}
