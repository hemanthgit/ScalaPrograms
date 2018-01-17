class ParentPerson {
  println("Inside parent class Primary constructor")

  var name: String = "<No Name>";
  var age: Int = 0;

  def this(name: String) {
    this();
    println("Inside Parent one-arg auxiliary constructor (name)")
  }

  def this(age: Int) {
    this();
    println("Inside Parent one-arg auxiliary constructor (age)")
  }

  def this(name: String, age: Int) {
    this(name);
    println("Inside Parent two-arg auxiliary constructor (name,age)")
  }
  println("STILL Inside parent class Primary constructor")
}
