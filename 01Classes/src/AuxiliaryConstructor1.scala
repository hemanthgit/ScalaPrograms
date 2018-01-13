class AuxiliaryConstructor1 {
   var name : String ="Default"
   var age : Int= 0;
  
  // one-arg auxiliary constructor
  def this(name1: String) {
    this()                     // call to Primary Constructor
    this.name = name1; 
  }
  
  // one-arg auxilary constructor
  def this(age1: Int) {
    this("ABC")                     // call to Auxiliary Constructor
    this.age = age1; 
  }
  
  // two-arg auxiliary constructor
  def this(name1: String, age1: Int) {
    this(name1)                     // call to Auxiliary Constructor
    this.age = age1; 
  }
  override def  toString = s"$name.. $age";
}

object AuxiliaryConstructor1 extends App{
  val NAME_DEFAULT = "ABC";
  val AGE_DEFAULT = 28;
  
  val a1 = new AuxiliaryConstructor1(NAME_DEFAULT,AGE_DEFAULT);
  val a2 = new AuxiliaryConstructor1(NAME_DEFAULT)
  val a3 = new AuxiliaryConstructor1(AGE_DEFAULT)
  val a4 = new AuxiliaryConstructor1();
  
  println(a1);
  println(a2);
  println(a3);
  println(a4);
}
