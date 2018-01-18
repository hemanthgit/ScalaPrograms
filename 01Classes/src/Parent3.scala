
abstract class Parent3 {
  val a: String = "Test"
  var b: Int = 10;
  
  final val c: String ="final test"
  
  def greetings : Unit = {println("Have a nice day")}
  override def toString() = s"a=$a.....b=$b.....c=$c"
}