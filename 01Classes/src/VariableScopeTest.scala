object  VariableScopeTest extends App{
  
  val v = new VariableScope();
  println("------ using custom setter and getter methods---------")
  println(v.getSymbolvar)
  v.symbol_=("symbol updated --  custom setter") // updating using custom setter method
  
  val v1 = new VariableScope();
  println()
  println("------ using default setter and getter methods---------")
  println(v1.symbolvar)
  v1.symbolvar="symbol updated -- default setter";// updating using default setter method. 
  println(v1)
  
  val v2 = new VariableScope();
  println()
  println(v2.getA);
  v2.setA=2;
  println(v2.getB);
  v2.setB=2;
  println(v2.a) // invalid as 'a' variable is private
  println(v2.b) // invalid as 'b' variable is private[this]

}
