package com.test.method.parameters

class MethodParamTest2 {

  /*
   * RULE :
   * If our method provides a mix of some fields with default values and others don’t, then list the fields that have default values last.*/

  // Wrong implementation
  def method1(str: String = "abc", i: Int) {
    println(s"Inside method1----$str  ,$i")
  }

  //Right Implementation
  def method2(i: Int, str: String = "abc") {
    println(s"Inside method2---$str")
  }
}

object MethodParamTest2 extends App {
  val v = new MethodParamTest2

  //  v.method1(2)        -- Invalid     If u toggle  the method arguments, then it works. 
  v.method1("abc", 20)
  v.method1(i=50, str="named params")  //named params while calling, so no need to follow the params order 

  v.method2(30)
  v.method2(40, "xyz")
}