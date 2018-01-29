//As a second approach in TraitMixins
//In modeling a large pizza store chain that has a corporate office and many small retail stores,
// the legal department creates a rule that people who deliver pizzas to customers must be a subclass of StoreEmployee
//and cannot be a subclass of CorporateEmployee. To enforce this, begin by defining your base classes:

abstract class Employee
class CorporateEmployee extends Employee
class StoreEmployee extends Employee

//Someone who delivers food can only be a StoreEmployee, so you enforce this requirement in the DeliversFood trait using inheritance below
trait DeliversFood extends StoreEmployee

class DeliveryPerson extends StoreEmployee with DeliversFood

//Because the DeliversFood trait can only be mixed into classes that extend StoreEmployee, the following line of code won’t compile:
class Receptionist extends CorporateEmployee with DeliversFood

// This kind of approach, is not a commonly used in general like approach1 in TraitMixins_1.