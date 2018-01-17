
class VariableScope {
  
  var symbolvar: String = "default symbol"; // Accessable any where by custom and default setters and getters.
  private var a : Int = 0 ; // Acceessable only with in the class which includes companion object.
  private [this] var b: Int = 0; //accessable only with in the class not even companion object.This field
                                 //is object-private, which means that it can only be accessed from the object that contains it

  
  // getter
  def getSymbolvar = symbolvar
  // setter
  def symbol_=(s: String) {
    this.symbolvar = s
    println(s"updated symbol value is ---- $getSymbolvar")
  }

  def getA = a;
  def setA= (i: Int) {
    this.a = i;
    println(s"updated 'a' value is ---- $a")
  }
  
  def getB = a;
  def setB= (i: Int) {
    this.b = i;
    println(s"updated 'b' value is ---- $b")
  }
  
  override def toString() = s"updated symbol value is ---- $symbolvar"
}

object VariableScope extends App {

  val v = new VariableScope();
  println("------ using CUSTOM setter and getter methods---------")
  println(v.getSymbolvar)
  v.symbol_=("symbol updated --  custom setter") // updating using custom setter method

  val v1 = new VariableScope();
  println()
  println("------ using DEFAULT setter and getter methods---------")
  println(v1.symbolvar)
  v1.symbolvar = "symbol updated -- default setter"; // updating using default setter method. 
  println(v1)
  
  val v2 = new VariableScope();
  println()
  println(v2.getA);
  v2.setA=2;
  println(v2.getB);
  v2.setB=2;
  println(v2.a)
  println(v2.b) // invalid as 'b' variable is private[this]

}

// Note : we can use @BeanProperty on non-private variables to generate setter and getter methods in java style.
