abstract class Parent1 {
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
          public abstract void b_$eq(int i); --- Imp To Note  -- setter method for 'b' of var type
  */
  
//Because of this, when you provide concrete values for these fields in your concrete classes, you must again define your fields to be val or var. 
//Because the fields don’t actually exist in the abstract base class (or trait), the override keyword is not necessary.
}
