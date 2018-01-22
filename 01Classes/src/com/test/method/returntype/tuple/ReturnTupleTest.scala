package com.test.method.returntype.tuple

class ReturnTupleTest {

  // this method returns the type Tuple2
  def getFullName(firstName: String, lastName: String): Tuple2[String, String] = {
    val a = (firstName, lastName)
    println(a) // a is Tuple2
    val b = new Tuple2(firstName, lastName);
    println(s"Tuple value is ....$b")
    println("First Name is .." + b._1)// use ._1,._2,._3.... to access Tuple values.
    println("First Name is .." + b._2)
    b
  }
}

object ReturnTupleTest extends App {
  val v = new ReturnTupleTest
  val a = v.getFullName("John", "Doe")
  println(a)
  println(a.getClass)
  println(a._1)
  println(a._2)
}