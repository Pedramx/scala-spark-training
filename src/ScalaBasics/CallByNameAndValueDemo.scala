package ScalaBasics

object CallByNameAndValueDemo extends App {

  def callByValue(x: Long) = {
    println("by value :" + x)
    println("by value :" + x)
  }

  def callByName(x: => Long) = {
    println("by name :" + x)
    println("by name :" + x)
  }

  callByValue(System.nanoTime()) // callByValue(88345658652400)
  callByName(System.nanoTime()) // evaluate your expression in lazy fashion

}
