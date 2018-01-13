class VisibilityOfConstructorFields (val surName: String, var firstName : String, lastName : String, private var age : Int){
  override def toString=s"$surName..$firstName..$lastName..$age";
}

/**
 * @author Hemanth Morla
 */
object VisibilityOfConstructorFields extends App{
  val v = new VisibilityOfConstructorFields("Morla","Hemanth","Kumar",28);
//  v.surName = "Morla-v1";
  v.firstName="Hemanth-v1";
//  v.lastName = "Kumar-v1"; //lastName is Not even accessable within members of the class. Almost equivalent to 'val'. Check the difference in below URL
  v.age=29;                           // age is accessable ONLY within members of the class. 
  println(v)
}

//refer : https://stackoverflow.com/questions/14694712/do-scala-constructor-parameters-default-to-private-val

//NOTE : Parameters in the constructor of a "case classes" are "val" by default;