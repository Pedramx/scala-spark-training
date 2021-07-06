package ScalaBasics

import com.sun.tools.doclint.Entity

object BasicOperation extends App {

  // variable deceleration and expressions

  /*
  1. VAL TYPE = value type
  2. VAR TYPE = variable type
   */

  var a: Int = 3 // mutable in nature
  a = 25
  println(a)

  val b = 3 + 4 // immutable in nature

  // SCALA DATA TYPES

  val stringVal = "Hello World"
  val intVal = 3
  val charVal = 'a'
  val longVal = 12345678999L
  val decimalVal: Double = 4.3
  val floatVal: Float = 4.3f

  // EXPRESSIONS

  val x = 3 + 4

  // MATH EXPRESSIONS ( + , - , * , /)

  val y = 3 + 4 * 2
  println(y)

  // EQUALITY ==, !=, > <, >=

  println(x < y)

  // LOGICAL NEGATION

  println(!(x < y))

  // INCREMENTAL AND DECREMENTAL OPERATIONS

  var someVal = 4
  someVal += 3
  println(someVal)

  // side effects (println/ while loops/ reassigning any value)
  val z: Unit = println("Hello guys")
  var p = 4
  val sideffectvalue: Unit = (p = 5)
  println(sideffectvalue)

  // EXPRESSIONS VS INSTRUCTIONS

  val simplecond = false
  // IF-ELSE EXPRESSION
  val mycondval: Any = if(simplecond) 5 else "paven"

  println(mycondval)

  var i = 20
  while(i > 10){
    println(i)
    i -= 1
  }

  // CODE BLOCK {} last expression you have that is nothing but return type
  val myCodeBlock = {
    val alocal = 2
    val blocal = 5

    if ( alocal > 2 ) "Hello" else "eeeeeeeeeeeeeee"
  }

  println(myCodeBlock)
  // var and functions declared inside codeblocks will be visible with in block
  // println(blocal)

  val somemore = {
    var someValue = true
    if(someValue) 239 else 496.0
  }

  println(somemore)


}
