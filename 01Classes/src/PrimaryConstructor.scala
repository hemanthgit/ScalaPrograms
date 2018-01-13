/*
 * Primary Constructor of a Scala is a combination of:
 *    1. The Constructor parameters
 *    2. Methods that are called in the body of the class
 *    3. Statements and expressions that are executed in the body of the class.
 *    
 *    Note : Anything defined within the body of the class other than method declarations is a part of the primary class Constructor.
 *                    Because auxilary constructors must always calla previously defined constructor in the same class, 
 *                    auxilary constructors will also execute the same code
 * */

class PrimaryConstructor(var name: String, var age: Int) {

  println("Constructor Excecution Begins")

  //some variables
  private val HOME = System.getProperty("user.name")
  var surname = "";

  //some methods
  override def toString = s"my name is :$name $surname and my age is $age "
  def printHome = { println(s"Home directory is $HOME ") }

  printHome
  println("You are still in constructor")
};

object PrimaryConstructor extends App {
  val c = new PrimaryConstructor("Hemanth", 28);
}  
//Try to execute these commands from REPL
//    scalac -Xprint:parse PrimaryConstructor.scala
//    javap PrimaryConstructor$.class