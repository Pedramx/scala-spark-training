package ScalaCollections

object SequencesDemo extends App {

  // very generic trait ( order and indexed)  seq

  val seqCollection = Seq(1, 2, 3, 4)
  println(seqCollection)
  println(seqCollection.reverse)
  println(seqCollection(2))
  val unsortedSeq = seqCollection ++ Seq(6, 5, 7)
  println(unsortedSeq)
  println(unsortedSeq.sorted)

  // range collection

  println(1 to 100)

  val myRange: Seq[Int] = 1 to 10
  val myRange2: Seq[Int] = 1 until 10
  myRange.foreach(print)
  println()
  myRange2.foreach(print)
  println()

  (1 to 4).foreach(x => println("hello"))

  // List
  val myList = List(1, 2, 3)

  val prepend = 47 +: myList :+ 80
  println(prepend)

  // List.functionalities

  val pedram5 = List.fill(5)("Pedram")
  println(pedram5)

  println(myList.mkString("-|-"))

  // Arrays ( fixed length size )

  val numbers = Array(1, 2, 3, 4)

  val threeElements = Array.ofDim[String](3)
  threeElements.foreach(println)

  numbers.update(1, 0)
  numbers(2) = 0
  numbers.foreach(println)

  // Implicits
  // array and seq

  val numberSeq: Seq[Int] = numbers
  println(numberSeq)


}
