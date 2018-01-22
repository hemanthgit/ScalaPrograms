package com.test.method.parameters

class MethodParamTest {
  
  def singleArgMethod(str: String) {
    println(s"Inside twoStrArgMethod ---$str")
  }

  def singleArgMethod(i : Int) {
    println(s"Inside singleArgMethod----$i")
  }
}

object MethodParamTest extends App {
  val v = new MethodParamTest
}