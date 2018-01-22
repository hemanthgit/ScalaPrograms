package com.test.method.parameters

class MethodParamTest1 {
  def method1(str: String = "abc", i: Int = 10) {
    println(s"Inside method1----$str  ,$i")
  }
  
  
}

object MethodParamTest1 extends App {

  val v = new MethodParamTest1
  
  v.method1()
  v.method1("xyz")
  //  v.method1(20)   //-- invalid
  
  v.method1(i=20)
}