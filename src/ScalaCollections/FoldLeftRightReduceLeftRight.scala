package ScalaCollections

object FoldLeftRightReduceLeftRight extends App {

  // foldLeft, foldRight, reduceLeft, reduceRight

  val list1 = List(1, 2, 3, 4, 5, 6, 9, 13)
  val list2 = List("A", "B", "C", "D", "E")

  println(list1.reduceLeft(_ + _))
  println(list1.reduceRight(_ + _))

  println(list2.reduceLeft(_ + _))
  println(list2.reduceRight(_ + _))

  println(list1.reduceLeft(_ - _))
  println(list1.reduceRight(_ - _))

  println(list1.reduceLeft((x, y) => {
    println(x + " - " + y)
    x - y
  }))

  println(list1.reduceRight((x, y) => {
    println(x + " - " + y)
    x - y
  }))

  // foldLeft and foldRight

  println(list1.foldRight(10)(_ + _))
  println(list2.foldRight("X")(_ + _))
  println(list2.foldLeft("X")(_ + _))

  // scanLeft, scanRight

  println(list1.scanRight(10)(_ + _))
  println(list1.scanLeft(10)(_ + _))
  println(list2.scanRight("X")(_ + _))

}
