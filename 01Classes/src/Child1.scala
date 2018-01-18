class Child1 extends Parent1 {
  
  val a = "Test";
      // var a = "Test" -- Invalid. As 'a' is immutable in Parent. 
  var b = 1;
      // val b = 1        -- Invalid. As 'b' is immutable in Parent. 
  
//  a="Test";
//  b=1;
  
  // Even though 'a' was val and 'b' was var, the above two assignments/initializations are not valid. Because these fields don’t
  // actually exist in the abstract base class ,  it only generates the methods that correspond to the val or var field.
}
