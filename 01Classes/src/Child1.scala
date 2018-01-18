class Child1 extends Parent1 {
  
  val a = "Test";
      // var a = "Test" -- Invalid. As 'a' is immutable in Parent. 
  var b = 1;
      // val b = 1        -- Invalid. As 'b' is immutable in Parent. 
}
