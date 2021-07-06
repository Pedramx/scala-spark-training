package ScalaCollections

object TuplesAndMapDemo extends App {

  // Tuple is special collection object which does have ability to store different types (22)
  // Tuple internally follow all our function1 - 22 parameter set

  val myTuple: (Int, String, Float) = (2, "Pedram", 3.14f) // Tuple3[Int, String, Float]
  val myTuple2 = Tuple3(2, "Pedram", 3.14f)
  println(myTuple)

  println(myTuple._1)
  println(myTuple._2)

  // a copy method
  println(myTuple.copy(_2 = "hi scala I am a tuple"))

  // swap
  val anotherTuple = ("Pedram", 4)
  println(anotherTuple.swap)
  //println(myTuple.swap)

  // Map => ( Key -> Value ) (name, phone number)
  val phoneBook = Map(("Pedram", 12345), ("Ali", 45436), ("Hamid", 876456))

  // use key value seperator as ->

  val phoneBook1 = Map("Pedram" -> 12345, "Ali" -> 45436, "Hamid"-> 876456 )

  println(phoneBook)

  // Map Operations

  println(phoneBook.contains("Pedram"))
  println(phoneBook.contains("Asghar"))
  println(phoneBook("Pedram"))

  // add new key value to existing map

  val newkv = "Asghar" -> 345678
  val newPhoneBook = phoneBook + newkv
  println(newPhoneBook)

  // map, flatMap, filter

  println(phoneBook.map(pair => pair._1.toUpperCase -> pair._2))

  println(phoneBook.filter(_._1.startsWith("P")))

  // conversion into another format
  println(phoneBook.toList)

  println(List(("Pedram",12345), ("Ali",45436), ("Hamid",876456)).toMap)

  // more operations

  val names = List("Pedram", "Paria", "Hamid", "Asghar")

  println(names.groupBy(_.charAt(0)))

}
