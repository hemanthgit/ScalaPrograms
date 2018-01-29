package com.packageobj.test // 

// To make functions, fields, and other code available at a package level, without requiring a class or object.
// Put the code you want to make available to all classes within a package in a package object

// package objects are a great place to put methods and functions that are common to the package, as well as constants, enumerations, and implicit conversions.
package object model {
  // field
  val MAGIC_NUM = 42

  // method
  def echo(a: Any) { println(a) }

  // enumeration
  object Margin extends Enumeration {
    type Margin = Value
    val TOP, BOTTOM, LEFT, RIGHT = Value
  }

  // type definition
  type MutableMap[K, V] = scala.collection.mutable.Map[K, V]
  val MutableMap = scala.collection.mutable.Map
}