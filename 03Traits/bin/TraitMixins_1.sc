//Limiting Which Classes Can Use a Trait by Inheritance

class SuperPower
trait SuperTrait extends SuperPower
class ChildPower extends SuperPower with SuperTrait
					//As long as a class and a trait share the same superclass (ChildPower and SuperTrait extend SuperPower) the code will compile,

class ChildPower1

//class ChildPower2 extends ChildPower1 with SuperTrait
					//if the superclasses are different (ChildPower1 and SuperTrait have different superclasses), the code will not compile.
					
					
// this kind of approach, "trait inheriting from a class" is not a commonly used in general.