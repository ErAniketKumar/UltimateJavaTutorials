Object-Oriented Programming (OOP) in Java: Comprehensive Notes
1. Introduction to OOP in Java
   What is OOP?
   Object-Oriented Programming (OOP) is a programming paradigm that organizes code around objects rather than functions and procedures. An object is an instance of a class, which acts as a blueprint defining the properties (fields) and behaviors (methods) of objects. OOP emphasizes modularity, reusability, and maintainability.
   Key Concepts:

Objects: Represent entities with state (data) and behavior (methods).
Classes: Templates for creating objects.
Real-World Analogy: A car (object) has attributes like color and speed (fields) and behaviors like drive or brake (methods).

Benefits of OOP

Modularity: Code is organized into classes, making it easier to manage and debug.
Reusability: Classes can be reused across projects via inheritance or composition.
Scalability: OOP supports large-scale systems through encapsulation and abstraction.
Maintainability: Changes in one class don’t necessarily affect others.
Real-World Modeling: OOP mimics real-world entities, making it intuitive.

Example:
class Car {
String color;
int speed;
void drive() {
System.out.println("Car is driving at " + speed + " km/h");
}
}
Car myCar = new Car();
myCar.color = "Red";
myCar.speed = 100;
myCar.drive(); // Output: Car is driving at 100 km/h

Real-World Scenario: A banking system where Account objects manage customer data and transactions, allowing modular updates without affecting other system parts.
OOP vs Procedural Programming

Procedural Programming: Focuses on procedures or functions, with data and functions separate. Example: C language.
Pros: Simple for small programs, less overhead.
Cons: Hard to maintain in large systems, no data protection.


OOP: Combines data and behavior in objects, promoting encapsulation and abstraction.
Pros: Better for large systems, reusable, and maintainable.
Cons: Steeper learning curve, slight performance overhead.



Example (Procedural vs OOP):
// Procedural: Functions and data are separate
int balance = 1000;
void deposit(int amount) { balance += amount; }

// OOP: Data and behavior in one class
class Account {
private int balance = 1000;
public void deposit(int amount) { balance += amount; }
}

Java as an OOP Language
Java is a fully object-oriented language, enforcing OOP principles:

Everything revolves around classes and objects (except primitives).
Supports all four OOP pillars: Encapsulation, Abstraction, Inheritance, Polymorphism.
Provides features like interfaces, abstract classes, and access modifiers to enforce OOP.

Real-World Scenario: Java is used in Android apps, where each screen (Activity) is an object, and components like buttons are objects interacting via OOP principles.

2. Four Pillars of OOP
   a. Encapsulation
   Definition & Purpose:Encapsulation is the bundling of data (fields) and methods that operate on the data into a single unit (class), restricting direct access to some components to protect data integrity.
   Purpose:

Hide internal details (data protection).
Provide controlled access via public methods.
Ensure data consistency.

Access Modifiers:

private: Accessible only within the class.
public: Accessible everywhere.
protected: Accessible within the same package and subclasses.
default (package-private): Accessible within the same package if no modifier is specified.

Example:
class BankAccount {
private double balance; // Private field
public void deposit(double amount) {
if (amount > 0) balance += amount;
}
public double getBalance() { return balance; } // Getter
}
BankAccount account = new BankAccount();
account.deposit(500);
System.out.println(account.getBalance()); // Output: 500.0

Getters and Setters:

Getters: Retrieve private field values.
Setters: Modify private field values with validation.

JavaBeans Convention:

Fields are private.
Use getters (getFieldName) and setters (setFieldName) for access.
Boolean getters use isFieldName (e.g., isActive).

Example:
class Person {
private String name;
private boolean active;
public String getName() { return name; }
public void setName(String name) { this.name = name; }
public boolean isActive() { return active; }
public void setActive(boolean active) { this.active = active; }
}

Real-World Scenario: A hospital system where Patient class encapsulates sensitive data like healthRecords, accessible only via controlled methods.

b. Abstraction
Definition:Abstraction hides complex implementation details and exposes only essential features to the user.
Abstract Classes:

Declared with abstract keyword.
Cannot be instantiated.
May contain abstract methods (no body) and concrete methods.

Example:
abstract class Vehicle {
abstract void start(); // Abstract method
void stop() { System.out.println("Vehicle stopped"); } // Concrete method
}
class Car extends Vehicle {
void start() { System.out.println("Car started"); }
}
Car car = new Car();
car.start(); // Output: Car started
car.stop();  // Output: Vehicle stopped

Abstract Methods:

Declared without implementation.
Must be overridden in subclasses.

Interfaces:

A contract specifying methods a class must implement.
All methods are implicitly public and abstract (before Java 8).
Supports multiple inheritance.

Example:
interface Drivable {
void drive();
}
class Bike implements Drivable {
public void drive() { System.out.println("Bike is being driven"); }
}
Bike bike = new Bike();
bike.drive(); // Output: Bike is being driven

Difference: Abstract Class vs Interface:



Feature
Abstract Class
Interface



Inheritance
Single (extends)
Multiple (implements)


Methods
Abstract + Concrete
Abstract (pre-Java 8), Default/Static (Java 8+)


Fields
Can have fields
Only constants (public static final)


Use Case
Common behavior with partial implementation
Define a contract for unrelated classes


Real-World Use Cases:

Abstract Class: A Payment class with common logic for CreditCardPayment and CashPayment.
Interface: A Printable interface for any class that needs a print() method, like Invoice or Report.


c. Inheritance
Definition:Inheritance allows a class (subclass) to inherit fields and methods from another class (superclass) using the extends keyword.
Types of Inheritance:

Single Inheritance:
class Animal {
void eat() { System.out.println("Eating..."); }
}
class Dog extends Animal {
void bark() { System.out.println("Barking..."); }
}
Dog dog = new Dog();
dog.eat();  // Output: Eating...
dog.bark(); // Output: Barking...


Multilevel Inheritance:
class Animal {
void eat() { System.out.println("Eating..."); }
}
class Dog extends Animal {
void bark() { System.out.println("Barking..."); }
}
class Puppy extends Dog {
void play() { System.out.println("Playing..."); }
}
Puppy puppy = new Puppy();
puppy.eat();  // Output: Eating...
puppy.bark(); // Output: Barking...
puppy.play(); // Output: Playing...


Hierarchical Inheritance:
class Animal {
void eat() { System.out.println("Eating..."); }
}
class Dog extends Animal {
void bark() { System.out.println("Barking..."); }
}
class Cat extends Animal {
void meow() { System.out.println("Meowing..."); }
}
Cat cat = new Cat();
cat.eat();  // Output: Eating...
cat.meow(); // Output: Meowing...



Constructor Behavior:

Subclass constructor implicitly calls superclass constructor using super().
Explicit super() can be used to call specific superclass constructors.

Example:
class Vehicle {
Vehicle() { System.out.println("Vehicle Constructor"); }
}
class Car extends Vehicle {
Car() { System.out.println("Car Constructor"); }
}
Car car = new Car();
// Output:
// Vehicle Constructor
// Car Constructor

super Keyword:

Access parent class methods/constructors.

class Vehicle {
void display() { System.out.println("Vehicle"); }
}
class Car extends Vehicle {
void display() {
super.display(); // Call parent method
System.out.println("Car");
}
}
Car car = new Car();
car.display();
// Output:
// Vehicle
// Car

Method Overriding:

Subclass provides a specific implementation of a superclass method.
Must have the same method signature and return type (or covariant).

Example:
class Animal {
void sound() { System.out.println("Some sound"); }
}
class Dog extends Animal {
@Override
void sound() { System.out.println("Bark"); }
}
Dog dog = new Dog();
dog.sound(); // Output: Bark

IS-A vs HAS-A:

IS-A: Inheritance (e.g., Dog is an Animal).
HAS-A: Composition (e.g., Car has an Engine).

Composition vs Inheritance:

Composition: A class contains an object of another class (HAS-A).class Engine {
void start() { System.out.println("Engine started"); }
}
class Car {
Engine engine = new Engine();
void drive() { engine.start(); }
}


Inheritance: A class extends another class (IS-A).
When to Use: Prefer composition for flexibility; use inheritance for strong IS-A relationships.

Real-World Scenario: In an e-commerce system, Product (superclass) defines common attributes, while Electronics and Clothing (subclasses) inherit and add specific features.

d. Polymorphism
Definition:Polymorphism allows objects to be treated as instances of their superclass, with the ability to invoke subclass-specific behavior.
Types:

Compile-Time Polymorphism (Method Overloading):

Multiple methods with the same name but different parameters.

class Calculator {
int add(int a, int b) { return a + b; }
double add(double a, double b) { return a + b; }
}
Calculator calc = new Calculator();
System.out.println(calc.add(5, 10));     // Output: 15
System.out.println(calc.add(5.5, 10.5)); // Output: 16.0


Runtime Polymorphism (Method Overriding):

Subclass overrides superclass method, resolved at runtime.

class Animal {
void sound() { System.out.println("Some sound"); }
}
class Cat extends Animal {
@Override
void sound() { System.out.println("Meow"); }
}
Animal animal = new Cat();
animal.sound(); // Output: Meow



Rules:

Overloading: Same method name, different parameters (number, type, or order).
Overriding: Same method name, signature, and return type (or covariant).
Covariant Return Types: Subclass method can return a subtype of the superclass method’s return type.class Animal {
Animal getInstance() { return this; }
}
class Dog extends Animal {
@Override
Dog getInstance() { return this; }
}



Dynamic Method Dispatch:

JVM determines the actual method to call at runtime based on the object’s type.
Essential for runtime polymorphism.

Real-World Scenario: A payment gateway where Payment is a superclass, and CreditCardPayment or PayPalPayment overrides processPayment() to handle specific payment logic.

3. Keywords in OOP Context

super: Access superclass methods/constructors.
this: Refers to the current object.class Person {
String name;
void setName(String name) { this.name = name; }
}


final:
Variable: Constant (cannot be changed).
Method: Cannot be overridden.
Class: Cannot be extended.

final class FinalClass { }
// class SubClass extends FinalClass { } // Error


static:
Variables/Methods: Belong to the class, not instances.
Blocks: Initialize static fields.
Nested Classes: Don’t require an instance of the enclosing class.

class Counter {
static int count = 0;
Counter() { count++; }
}


abstract: Defines abstract classes/methods.
implements: Used to implement interfaces.
instanceof: Checks if an object is an instance of a class.Animal animal = new Dog();
System.out.println(animal instanceof Dog); // Output: true


transient: Excludes fields from serialization.
volatile: Ensures visibility of variable changes across threads.

Real-World Scenario: In a game, static variables track total players, while final ensures constant game settings.

4. Class and Object Fundamentals
   Declaring a Class:
   class Student {
   String name;
   int rollNo;
   void study() { System.out.println(name + " is studying"); }
   }

Creating Objects:
Student s1 = new Student();
s1.name = "Alice";
s1.rollNo = 101;
s1.study(); // Output: Alice is studying

Class vs Object:

Class: Blueprint (e.g., Student).
Object: Instance (e.g., s1).

Fields and Methods:

Fields: Store data (e.g., name, rollNo).
Methods: Define behavior (e.g., study()).

Constructors:

Initialize objects.
Same name as the class, no return type.

Default Constructor:
class Student {
Student() { System.out.println("Default constructor"); }
}

Parameterized Constructor:
class Student {
String name;
Student(String name) { this.name = name; }
}

Constructor Overloading:
class Student {
String name;
int rollNo;
Student() { }
Student(String name, int rollNo) {
this.name = name;
this.rollNo = rollNo;
}
}

Constructor Chaining:

Call one constructor from another using this() or super().

class Student {
String name;
int rollNo;
Student() { this("Unknown", 0); }
Student(String name, int rollNo) {
this.name = name;
this.rollNo = rollNo;
}
}

Real-World Scenario: A library system where Book objects are created with attributes like title and author using constructors.

5. Method Overloading & Overriding
   Method Signature:

Name + Parameters (type, number, order).

Overloading:
class Printer {
void print(String s) { System.out.println(s); }
void print(int i) { System.out.println(i); }
}

Overriding:

Same signature, subclass-specific implementation.
Use @Override to ensure correctness.

Rules for Overriding:

Same method name, parameters, and return type.
Access modifier cannot be more restrictive.
Exceptions thrown cannot be broader than the superclass method.

Example:
class Animal {
void sound() throws Exception { System.out.println("Sound"); }
}
class Dog extends Animal {
@Override
void sound() { System.out.println("Bark"); } // No exception or narrower
}

Real-World Scenario: A reporting system where Report class has an generate() method, overridden by PDFReport and ExcelReport.

6. Dynamic Method Dispatch
   Definition:

JVM resolves method calls at runtime based on the object’s actual type, not the reference type.

Example:
class Animal {
void sound() { System.out.println("Some sound"); }
}
class Dog extends Animal {
void sound() { System.out.println("Bark"); }
}
Animal animal = new Dog();
animal.sound(); // Output: Bark

Upcasting:

Assigning a subclass object to a superclass reference.

Animal animal = new Dog(); // Upcasting

Real-World Scenario: A drawing app where Shape is a superclass, and Circle or Rectangle objects are processed via dynamic dispatch.

7. Static Concepts
   Static Variables:

Shared across all instances.

class Counter {
static int count = 0;
Counter() { count++; }
}

Static Methods:

Called on the class, not instances.

class MathUtils {
static int square(int x) { return x * x; }
}
MathUtils.square(5); // Output: 25

Static Blocks:

Initialize static fields.

class Demo {
static int x;
static { x = 10; }
}

Static Nested Classes:

Don’t require an instance of the enclosing class.

class Outer {
static class Nested {
void display() { System.out.println("Nested class"); }
}
}
Outer.Nested nested = new Outer.Nested();

Real-World Scenario: A logging system where static methods handle log entries shared across the application.

8. final Keyword
   final Variable:
   final int MAX = 100; // Constant

final Method:
class Parent {
final void show() { System.out.println("Cannot override"); }
}

final Class:
final class FinalClass { }
// class SubClass extends FinalClass { } // Error

Use Cases:

Ensure immutability (e.g., constants).
Prevent method overriding or class extension.

Real-World Scenario: A security system where Encryption class is final to prevent modification.

9. Nested and Inner Classes
   Member Inner Class:
   class Outer {
   class Inner {
   void display() { System.out.println("Inner class"); }
   }
   }
   Outer.Inner inner = new Outer().new Inner();

Static Nested Class:
class Outer {
static class StaticNested {
void display() { System.out.println("Static nested class"); }
}
}
Outer.StaticNested nested = new Outer.StaticNested();

Local Inner Class:
class Outer {
void method() {
class Local {
void display() { System.out.println("Local class"); }
}
Local local = new Local();
local.display();
}
}

Anonymous Inner Class:
interface Action {
void perform();
}
Action action = new Action() {
public void perform() { System.out.println("Anonymous class"); }
};

Real-World Scenario: A GUI framework where Button has an anonymous inner class for click events.

10. Object Class
    Key Methods:

toString(): Returns string representation.
equals(): Compares objects for equality.
hashCode(): Returns hash code for objects.
getClass(): Returns runtime class.
clone(): Creates a copy of the object.
finalize(): Called before garbage collection (deprecated).

Example:
class Person {
String name;
Person(String name) { this.name = name; }
@Override
public String toString() { return "Person: " + name; }
}
Person p = new Person("Alice");
System.out.println(p); // Output: Person: Alice

Real-World Scenario: A user management system overriding equals() and hashCode() for unique user identification.

11. Java Memory Management
    Stack vs Heap:

Stack: Stores method calls, local variables, and references.
Heap: Stores objects and their instance variables.

Garbage Collection:

Automatically reclaims memory from unreachable objects.
GC Roots: Objects referenced by active threads, static fields, etc.

Example:
class Test {
public static void main(String[] args) {
Object obj = new Object();
obj = null; // Eligible for GC
System.gc(); // Suggest GC (not guaranteed)
}
}

Real-World Scenario: A web server where objects are created per request and garbage-collected when no longer needed.

12. Interface & Multiple Inheritance
    Interfaces Before Java 8:

Only abstract methods and constants.

Default Methods (Java 8):
interface Vehicle {
default void stop() { System.out.println("Vehicle stopped"); }
}

Static Methods:
interface Vehicle {
static void info() { System.out.println("Vehicle interface"); }
}

Functional Interface:

Interface with one abstract method.

@FunctionalInterface
interface MyFunction {
void run();
}
MyFunction func = () -> System.out.println("Lambda");
func.run();

Real-World Scenario: A plugin system where classes implement a Plugin interface with default methods for common behavior.

13. Abstract Classes
    Abstract vs Concrete:

Abstract: Cannot be instantiated, may have abstract methods.
Concrete: Fully implemented, can be instantiated.

Example:
abstract class Shape {
abstract void draw();
}
class Circle extends Shape {
void draw() { System.out.println("Drawing circle"); }
}

Real-World Scenario: A graphics editor where Shape is abstract, and Circle, Rectangle provide specific implementations.

14. Constructors - Advanced
    Constructor Chaining:
    class Student {
    String name;
    int rollNo;
    Student() { this("Unknown", 0); }
    Student(String name, int rollNo) {
    this.name = name;
    this.rollNo = rollNo;
    }
    }

Inheritance with Constructors:

Subclass constructor calls superclass constructor implicitly or explicitly.

Object Initialization Order:

Static blocks (class loading).
Instance blocks and fields.
Constructor.

Real-World Scenario: A database connection class where constructors initialize connection parameters.

15. Object Class vs Custom Classes
    Overriding equals() and hashCode():
    class Person {
    String name;
    int id;
    @Override
    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Person)) return false;
    Person other = (Person) obj;
    return id == other.id && name.equals(other.name);
    }
    @Override
    public int hashCode() { return name.hashCode() + id; }
    }

Real-World Scenario: A user authentication system comparing User objects for login.

16. SOLID Principles

Single Responsibility Principle (SRP):

A class should have one responsibility.

class User {
void saveUser() { /* Save to DB */ }
}
class EmailService {
void sendEmail() { /* Send email */ }
}


Open/Closed Principle (OCP):

Open for extension, closed for modification.

interface Payment {
void process();
}
class CreditCardPayment implements Payment {
public void process() { System.out.println("Credit card payment"); }
}


Liskov Substitution Principle (LSP):

Subclasses should be substitutable for their superclasses.

class Bird {
void fly() { }
}
class Ostrich extends Bird {
void fly() { throw new UnsupportedOperationException(); } // Violates LSP
}


Interface Segregation Principle (ISP):

Clients should not be forced to implement unnecessary methods.

interface Printer {
void print();
}
interface Scanner {
void scan();
}


Dependency Inversion Principle (DIP):

Depend on abstractions, not implementations.

interface Database {
void connect();
}
class MySQLDatabase implements Database {
public void connect() { /* Connect */ }
}



Real-World Scenario: A payroll system adhering to SOLID for maintainability.

17. Design Patterns (OOP-Based)
    Singleton Pattern:

Ensures one instance of a class.

class Singleton {
private static Singleton instance;
private Singleton() { }
public static Singleton getInstance() {
if (instance == null) instance = new Singleton();
return instance;
}
}

Factory Pattern:

Creates objects without specifying the exact class.

interface Animal {
void speak();
}
class Dog implements Animal {
public void speak() { System.out.println("Bark"); }
}
class AnimalFactory {
Animal createAnimal(String type) {
if ("Dog".equals(type)) return new Dog();
return null;
}
}

Builder Pattern:

Constructs complex objects step-by-step.

class House {
private String walls, roof;
private House(Builder builder) {
this.walls = builder.walls;
this.roof = builder.roof;
}
static class Builder {
private String walls, roof;
Builder setWalls(String walls) { this.walls = walls; return this; }
Builder setRoof(String roof) { this.roof = roof; return this; }
House build() { return new House(this); }
}
}
House house = new House.Builder().setWalls("Brick").setRoof("Tile").build();

Real-World Scenario: Singleton for database connections, Factory for payment processors, Builder for complex configurations.

18. Association, Aggregation, and Composition
    Association:

General relationship between classes.

class Teacher {
void teach(Student student) { }
}

Aggregation:

HAS-A relationship, objects can exist independently.

class Department {
List<Employee> employees;
}

Composition:

Strong HAS-A, objects cannot exist independently.

class Car {
Engine engine; // Car owns Engine
}

Real-World Scenario: A university system where Department aggregates Professor objects, and Car composes Engine.

19. Access Modifiers Recap

public: Accessible everywhere.
private: Accessible only within the class.
protected: Accessible in the same package and subclasses.
default: Accessible in the same package.

Example:
class Test {
public int a = 1;
private int b = 2;
protected int c = 3;
int d = 4; // default
}


20. Advanced Topics
    Immutable Objects:
    final class Immutable {
    private final int value;
    Immutable(int value) { this.value = value; }
    int getValue() { return value; }
    }

Record Classes (Java 14+):
record Person(String name, int age) { }

Enum with OOP:
enum Color {
RED, GREEN, BLUE;
void display() { System.out.println(this.name()); }
}

Cloning:
class Student implements Cloneable {
int id;
@Override
protected Object clone() throws CloneNotSupportedException {
return super.clone();
}
}

Real-World Scenario: Immutable objects in payment systems, records for simple data classes.

21. Common Mistakes and Best Practices

Overloading vs Overriding: Ensure correct signatures.
== vs .equals(): Use .equals() for object comparison.
Breaking Encapsulation: Always use private fields with getters/setters.
Overuse of Inheritance: Prefer composition for flexibility.

Real-World Scenario: A poorly designed system using inheritance instead of interfaces, leading to rigid code.
