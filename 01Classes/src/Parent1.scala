abstract class Parent {
  // abstract fields declaration
  val a: String
  var b: Int

  //  IMP Note : When you define an abstract field in an abstract class or trait, the Scala compiler
  //does not create a field in the resulting code; it only generates the methods that
  //correspond to the val or var field.

  //  if you look at the code that’s created by scalac using the -Xprint:all option, or by decompiling the resulting Parent.class file, 
  //  you won’t find a or b fields. For instance, if you decompile the class, the output shows
  //  only methods in the class, no fields. Looks like below
  
  /*
    public abstract class Parent{
          public abstract String a(); --- Imp To Note
          public abstract int b();			--- Imp To Note
          public abstract void b_$eq(int i); --- Imp To Note
  */

}
