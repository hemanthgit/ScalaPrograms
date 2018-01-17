class AssignBlockToVariable {
  
  var x = { println("Block x"); 15 }
  lazy val y = { println("Block y"); x+1 }  // assign block with lazy keyword.
  x = 17
  
  override def toString() = s"x = $x.... y = $y";

}

object AssignBlockToVariable extends App {
  val v = new AssignBlockToVariable; // -- this executes class body, Primary constructor.
                                                    // -- 'y' not yet initialized. see sysouts.
  
  v.y; //-- At this line , 'y' get initialized by the block
  println(v)
}
