class ChildEmployee extends ParentPerson {
  var salary: Int = 0;
  def this(name: String, age: Int, salary: Int) {
    this()
    this.name=name;
    this.age=age;
    this.salary=salary;
  }
  override def toString() = s"$name.......$age.......$salary"
}

object ChildEmployee extends App {
  val v1 = new ChildEmployee;
  println(v1);
  val v = new ChildEmployee("Abcd",27,2300);
  println(v)
}
