//Note : you can control the superclass constructor that is called by the primary constructor in a subclass, 
//          but you can’t control the superclass constructor that’s called by an auxiliary constructor in the subclass.

//Regarding auxiliary constructors, because the first line of an auxiliary constructor must be a call to another constructor 
of the current class, there is no way for auxiliary constructors to call a superclass constructor.
class ChildEmployee extends ParentPerson("Hemanth",28) {
  var salary: Int = 0;
  
  def this(name : String){
    this();
    println("Inside Child class one-arg aux constructor (name)")
  }
  
  def this(name: String, age: Int, salary: Int) {
    this(name)
    this.name=name;
    this.age=age;
    this.salary=salary;
  }
  override def toString() = s"$name.......$age.......$salary"
}

object ChildEmployee extends App {
  val v1 = new ChildEmployee;
  println(v1);
  println("--------------------------------------------------------------------------------")
  val v = new ChildEmployee("Abcd",27,2300);
  println(v)
}
