package ScalaFunctionStyle

object MapFlatMapFilterFor extends App {

  val list: List[Int] = List.apply(1, 2, 3, 4, 5)
  println(list.head)
  println(list.tail)

  // map => each and every element it will apply

  println(list.map(x => x + 1))
  println(list.map(_ + 1))

  // filter act on each element but filter element based on condition matched

  println(list.filter(x => x % 2 == 0))
  println(list.filter(_ % 2 == 0))

  // flatMap

  val oneMoreList: List[String] = List("paven is teaching spark", "paven is teaching scala")
  val myValue = oneMoreList.map(_.split(" "))
  println(myValue)

  // flatMap if I want to flatten internal structure to pne structure
  val myFlatMapValue = oneMoreList.flatMap(_.split(" "))
  println(myFlatMapValue)

  val myPair = (x: Int) => List(x, x + 1) // list(1, 2, 3, 4, 5) => list(1, 2), list(2, 3), list(3, 4) ...
  println(list.flatMap(myPair))

  // looping must follow (combinations)
  val number = List(1, 2, 3, 4, 5)
  val chars = List('a', 'b', 'c', 'd')
  val name = List("Paven", "Pedram", "Ali")

  val alternateLoop = number.flatMap(n => chars.flatMap(c => name.map(na => " " + c + n + na)))
  println(alternateLoop)

  // for-comprehension
  val forLoop = for {
    n <- number
    c <- chars
    na <- name
  } yield " " + c + n + na

  println(forLoop)


}

