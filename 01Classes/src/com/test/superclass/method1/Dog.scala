package com.test.superclass.method1

class Dog extends FourLeggedAnimal {
  def walkThenRun {
    super.walk // works
    super[FourLeggedAnimal].walk // works
    // super[Animal].walk // error: won't compile ..  You can overcome that error by adding "with Animal"
  }
}


/*Observation : when using this technique, you can’t continue to reach up through the parent
class hierarchy unless you directly extend the target class or trait using the extends or
with keywords. 

* For instance, the above code won’t compile because Dog doesn’t  directly extend the Animal trait

If you attempt to compile the code, you’ll get the error, “Animal does not name a parent
class of class Dog.” 
You can get around that error by adding with Animal to your class declaration

class Dog extends FourLeggedAnimal with Animal {
*/
