package Hw1;

public class Notes {
    /* KNOW YOUR VARIABLES
2 kinds of variables, primitive and reference
Can be declared as objects (instance) or locally (within a method)
Can be used as arguments(sent to a method by a calling code) and as a return type(sent back to caller of method)
Variables must have a type
Variables must have a name
Integer primitive data types have different sizes such as long, int, short, byte
If you cast a larger data type integer to a smaller data type integer you will lose precision
A data type name must start with am underscore, letter, dollar sign, and a data type and cant start with a number
     */

    /* HOW OBJECTS BEHAVE
Objects have behaviors that act on its state(methods use instance variable values)
A class is the blueprint for an object
Arrays are named objects whether they not hold primitive or object references
Arrays are used to store multiple values in a single
Objects are represented by instance variable and methods use instance variables
A method uses parameters
An agreement is passed by a caller
If a method uses a parameter you must pass it something with the correct data type
We can declare a method and make it return a specific value that we want
If you use the return value in a method you need to return a data type that matches the declared data type or is compatible with the declared data type
Methods can have more than one parameter and pass more than one argument
There could be two variables passed within a method but they should match the parameter data type
A Class identifies what an object knows and does
The thing an object does are based on its methods
A method could obtain instance variables so that objects could act or behave differently
A method is able to have parameters so it could pass multiple values within the method
A void method doesn't return anything
A argument you pass in a method could be a literal value or declared parameter
If a method is not void it must return a data type that is compatible to the parameter data type
The main purpose of a getter is to return a value
The man purpose of a setter is to set a value of a instance variable
A setter could use parameters
A variable being exposed means you can reach with a dot operator
A setter method prevent others user from putting in unacceptable values
You use the private access modifier to hide data
public getters and setters allow you to modify private instance variables
We compare primitives using the == operator
We compare references using the == operator to see if they have the same object
     */

    /* SERIOUS POLYMORPHISM
A abstract class is a class that can not be instantiated
An abstract class stops user from making new objects of that class
An abstract type could still be used as a reference
Abstract classes are used for polymorphic arguments or return types, or to make polymorphic arrays
To make a abstract class you put abstract before the class declaration
An abstract class is not effective unless it is extended
Methods could also be abstract
A abstract method does not contain a body
If you use an abstract method the class must be abstract as well
Abstract methods exist mainly for polymorphism
The first concrete class in the inheritance hierarchy needs to implement all abstract methods
You can pass the buck down meaning two different abstract classes doesn't need the same methods but a concrete subclass must contain all the methods from the two abstract classes such as animal and canine being abstract and dog being a subclass
An abstract class can have both abstract and non abstract methods
Every class in Java extends object
A sub class overrides methods from the superclass
     */

    /* LIFE AND DEATH OF AN OBJECT
Stack and Heap are two types of memory in Java
Objects live in the heap
Were we call methods and local variables are stored in the stack
Methods that are called are stacked on top of the stack
Local variables that are placed on the bottom of the stack
It doesn't matter where an object is declared it is always stored in the heap
Instance variables are also stored on the heap from the object they belong to
A constructor internalizes objects
A constructor can set values to the objects attributes
When creating multiple constructors you need different arguments
A constructor with no arguments is called a no_arg constructor
Overloaded constructors means your class contains more than constructor
Every superclass has a constructor
A subclass is always dependent on the superclass so the superclass must be finished with constructors before the subclass can inherit the constructors
Every constructor could call to super. or this. but never could call to both
A local variable still alive along until its method is complete
A local variable can only be used if there in the scope which is within the method
     */

    /* ABSTRACT CLASS
Abstract a different/ specific form of method
Different from interface which is also a list of objects but automatically assumed as abstract.
Abstract methods do not specify a body
Abstract classes cannot be instantiated, but they can be subclassed.
Instantiated = cannot create objects from abstract class, abstract classes are used to pass general information and general methods
     */
}
