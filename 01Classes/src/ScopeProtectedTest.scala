
class ScopeProtectedTest extends ScopeProtected {
println("Inside class------"+a)
}

object ScopeProtectedTest extends App {
  val v = new ScopeProtectedTest();
  println("Inside companion obj ------ "+v.a)
  // println(a) - Not Valid
}
