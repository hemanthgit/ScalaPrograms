

/**
 * @author Hemanth Morla
 */
class Child3 extends Parent3 {

  //----------------------------------overiding val fields--------------------

  //  val a ="test updated"   //Exception : overriding value 'a' in class Parent3 of type String; value 'a' needs `override' modifier
  override val a = "test updated" // valid

  //  override val c ="final test updated"// Exception : cannot override final member

  //----------------------------------overiding var fields (Different than val overriding)--------------------

  // var b = 20 // Exception : overriding variable 'b' in class Parent3 of type Int; variable 'b' needs `override' modifier.
  //  override var b= 20  // Exception : variable b cannot override a mutable variable .

  b = 20 // valid 

  //  Note : Because the field 'b'' are declared and initialized in the abstract base class, there’s no need to 
  //redeclare the field as val or var in the concrete  subclass.
}

object Child3 extends App{
  val c = new Child3
  println(c)
}