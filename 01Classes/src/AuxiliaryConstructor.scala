
class AuxiliaryConstructor(var name: String, var age: Int) {
  
  // one-arg auxilary constructor
  def this(name: String) {
    this(name, AuxiliaryConstructor.AGE_DEFAULT); // call to Primary COnstructor
  }
  
  def this(age : Int){
    this(AuxiliaryConstructor.NAME_DEFAULT)//call to above auxilary constructor 
    this.age=29;
  }

  def this(){
    this(AuxiliaryConstructor.NAME_DEFAULT,AuxiliaryConstructor.AGE_DEFAULT) // call to Primary COnstructor
  }
  
  override def  toString = s"$name.. $age";
}

object AuxiliaryConstructor extends App{
  val NAME_DEFAULT = "ABC";
  val AGE_DEFAULT = 28;
  
  val a1 = new AuxiliaryConstructor(NAME_DEFAULT,AGE_DEFAULT);
  val a2 = new AuxiliaryConstructor(NAME_DEFAULT)
  val a3 = new AuxiliaryConstructor(AGE_DEFAULT)
  val a4 = new AuxiliaryConstructor();
  
  println(a1);
  println(a2);
  println(a3);
  println(a4);
}

//Note : 1. Each auxilary constructor must begin with a call to previously defined constructor either Primary or Auxilary