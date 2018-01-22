package com.test.superclass.method

class Child extends Human with Father with Mother {

  def printSuper = { println(super.greet); super.greet }
  def printHuman = { println(super[Human].greet); super[Human].greet }
  def printMother = { println(super[Mother].greet); super[Mother].greet }
  def printFather = { println(super[Father].greet); super[Father].greet }
}

object Child extends App {
  val v = new Child;
  v.printSuper // Change the order of Super classes and observe the output
  v.printHuman
  v.printMother
  v.printFather
}

/*Change the order of Super classes and observe "printSuper" method output.
 * 
 * Implemented Child class will check Parent classes from right side to left side order for respective method implementation.  
 * 
 * If rightmost class is parent for Child's parent class, then it will check for that child classes first.
 *    ex :  class Child extends Mother with Father with Human 
 *            In the above ex, Human is again parent for both Mother and Father. In this case child class check in Father--> Mother class initially ,
 *            if not found it pick from Human eventhough Human at rightmost 
*/
