
case class AuxiliaryConstructor2(var name: String, var age: Int) {
  override def toString = s"$name... $age";
}

object AuxiliaryConstructor2 {
  def apply() = new AuxiliaryConstructor2("<No Name>", 0)
  def apply(name: String) = new AuxiliaryConstructor2(name, 0)
}

object CaseClassTest extends App {

  val a = AuxiliaryConstructor2();
  val b = AuxiliaryConstructor2("abc", 20)
  println(a);
  println(b);
}

// In case classes , we have to use apply methods instead of auxiliary constructors . More in Case classes section