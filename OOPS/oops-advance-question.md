Top OOP Interview Questions for MNCs (Uber, Google, Amazon, Oracle)
This guide compiles the most frequently asked OOP interview questions for roles at top MNCs like Uber, Google, Amazon, and Oracle. It includes beginner-level questions for freshers and advanced questions for experienced developers (3–8+ years). Each question is explained in an easy-to-understand format with code examples and real-world scenarios to reflect industry expectations.

Beginner-Level OOP Questions (0–3 Years Experience)
1. What is Object-Oriented Programming (OOP), and why is it important in software development?
   Explanation: OOP is a programming paradigm that organizes code around objects, which are instances of classes combining data (attributes) and behavior (methods). It emphasizes four pillars: Encapsulation, Abstraction, Inheritance, and Polymorphism. OOP is important because it enhances modularity, reusability, and maintainability, making it ideal for large-scale applications at companies like Amazon and Google.
   Sample Answer:

OOP models real-world entities as objects, improving code organization.
Benefits include:
Modularity: Easier to manage and debug code.
Reusability: Code can be reused via inheritance or composition.
Scalability: Supports complex systems (e.g., Uber’s ride-sharing platform).
Maintainability: Encapsulation isolates changes, reducing impact on other components.



Real-World Scenario: In Uber’s system, a Ride class encapsulates ride details (e.g., driver, passenger, fare) and methods (e.g., startRide(), endRide()), ensuring modular and maintainable code.
Source:,

2. Explain the difference between a class and an object with an example.
   Explanation: A class is a blueprint defining the structure and behavior of objects, while an object is an instance of a class with specific data.
   Sample Code:
   class Car {
   String model;
   int speed;
   void drive() { System.out.println(model + " is driving at " + speed + " km/h"); }
   }
   public class Main {
   public static void main(String[] args) {
   Car car1 = new Car(); // Object creation
   car1.model = "Toyota";
   car1.speed = 120;
   car1.drive(); // Output: Toyota is driving at 120 km/h
   }
   }

Real-World Scenario: At Amazon, a Product class defines attributes like name and price, while objects represent specific products like “iPhone 13” or “Laptop.”
Source:,

3. What are the four pillars of OOP? Provide a brief explanation of each.
   Explanation:

Encapsulation: Bundles data and methods within a class, restricting direct access to protect data integrity.
Abstraction: Hides complex implementation details, exposing only essential features.
Inheritance: Allows a class to inherit properties and methods from another class, promoting code reuse.
Polymorphism: Enables objects to take multiple forms, either through method overloading (compile-time) or overriding (runtime).

Sample Answer:

Encapsulation: Protects data using private fields and public getters/setters (e.g., private double balance in a BankAccount class).
Abstraction: Simplifies systems by exposing only relevant details (e.g., abstract class Payment in Oracle’s financial systems).
Inheritance: Reuses code (e.g., class Sedan extends Car in Uber’s vehicle management).
Polymorphism: Allows flexibility (e.g., processPayment() overridden by CreditCardPayment and PayPalPayment at Amazon).

Real-World Scenario: Google’s search engine uses polymorphism to handle different query types (text, image) via a common Search interface.
Source:,

4. What is encapsulation, and how is it implemented in Java?
   Explanation: Encapsulation hides a class’s internal data by making fields private and providing public methods (getters/setters) for controlled access.
   Sample Code:
   class BankAccount {
   private double balance;
   public void deposit(double amount) {
   if (amount > 0) balance += amount;
   }
   public double getBalance() { return balance; }
   }
   public class Main {
   public static void main(String[] args) {
   BankAccount account = new BankAccount();
   account.deposit(1000);
   System.out.println(account.getBalance()); // Output: 1000.0
   // account.balance = -500; // Error: balance is private
   }
   }

Real-World Scenario: Oracle’s database systems use encapsulation to protect sensitive data like user credentials, accessible only through secure methods.
Source:,

5. What is the difference between procedural programming and OOP?
   Explanation:

Procedural Programming: Focuses on functions and sequential execution; data is separate (e.g., C).
OOP: Organizes code into objects combining data and behavior, emphasizing modularity and encapsulation.

Sample Answer:



Feature
Procedural Programming
OOP



Structure
Functions and global data
Objects with data and methods


Data Handling
Data is often global
Data is encapsulated in objects


Reusability
Limited (function reuse)
High (inheritance, composition)


Example
C program with functions
Java class with objects


Real-World Scenario: Amazon’s older inventory systems might use procedural code for simple tasks, but modern systems use OOP for scalable product management.
Source:,

6. What is a constructor, and how is it different from a method?
   Explanation:

A constructor initializes an object, has the same name as the class, and no return type.
A method performs operations and has a return type (or void).

Sample Code:
class Student {
String name;
Student(String name) { // Constructor
this.name = name;
}
void display() { // Method
System.out.println("Name: " + name);
}
}
public class Main {
public static void main(String[] args) {
Student s = new Student("Alice");
s.display(); // Output: Name: Alice
}
}

Real-World Scenario: In Google’s user management system, a User constructor initializes user data, while methods like updateProfile() modify it.
Source:

7. What is method overloading, and how is it achieved in Java?
   Explanation: Method overloading allows multiple methods with the same name but different parameters (number, type, or order) in the same class.
   Sample Code:
   class Calculator {
   int add(int a, int b) { return a + b; }
   double add(double a, double b) { return a + b; }
   int add(int a, int b, int c) { return a + b + c; }
   }
   public class Main {
   public static void main(String[] args) {
   Calculator calc = new Calculator();
   System.out.println(calc.add(5, 10));       // Output: 15
   System.out.println(calc.add(5.5, 10.5));   // Output: 16.0
   System.out.println(calc.add(1, 2, 3));     // Output: 6
   }
   }

Real-World Scenario: Uber’s pricing system overloads calculateFare() for different ride types (e.g., UberX, UberPool).
Source:,

8. Explain the this keyword in Java with an example.
   Explanation: The this keyword refers to the current object, used to differentiate instance variables from method parameters or to call another constructor.
   Sample Code:
   class Person {
   String name;
   Person(String name) {
   this.name = name; // Differentiate instance variable from parameter
   }
   void display() { System.out.println(this.name); }
   }
   public class Main {
   public static void main(String[] args) {
   Person p = new Person("Bob");
   p.display(); // Output: Bob
   }
   }

Real-World Scenario: Amazon’s Order class uses this to set order details, avoiding confusion between parameters and fields.

Intermediate-Level OOP Questions (3–5 Years Experience)
9. What is method overriding, and what are its rules?
   Explanation: Method overriding occurs when a subclass provides a specific implementation of a superclass method. Rules:

Same method name, parameters, and return type (or covariant).
Access modifier cannot be more restrictive.
Exceptions thrown cannot be broader than the superclass method.
Use @Override annotation for clarity.

Sample Code:
class Animal {
void sound() { System.out.println("Some sound"); }
}
class Dog extends Animal {
@Override
void sound() { System.out.println("Bark"); }
}
public class Main {
public static void main(String[] args) {
Animal dog = new Dog();
dog.sound(); // Output: Bark
}
}

Real-World Scenario: Oracle’s database drivers override a connect() method to implement specific database protocols.
Source:,

10. What is dynamic method dispatch, and how does it enable runtime polymorphism?
    Explanation: Dynamic method dispatch is the process where the JVM determines the method to execute at runtime based on the object’s actual type, not the reference type. It enables runtime polymorphism.
    Sample Code:
    class Vehicle {
    void drive() { System.out.println("Vehicle driving"); }
    }
    class Car extends Vehicle {
    @Override
    void drive() { System.out.println("Car driving"); }
    }
    public class Main {
    public static void main(String[] args) {
    Vehicle vehicle = new Car(); // Upcasting
    vehicle.drive(); // Output: Car driving
    }
    }

Real-World Scenario: Google’s ad platform uses dynamic dispatch to call specific ad-rendering methods based on ad type (e.g., BannerAd, VideoAd).
Source:

11. What is the difference between an abstract class and an interface in Java?
    Explanation:



Feature
Abstract Class
Interface



Inheritance
Single (extends)
Multiple (implements)


Methods
Abstract + Concrete
Abstract, Default/Static (Java 8+)


Fields
Instance fields
Only constants (public static final)


Use Case
Partial implementation
Contract for unrelated classes


Sample Code:
abstract class Shape {
abstract void draw();
void move() { System.out.println("Moving shape"); }
}
interface Drawable {
void draw();
}
class Circle extends Shape implements Drawable {
public void draw() { System.out.println("Drawing circle"); }
}

Real-World Scenario: Amazon’s inventory system uses interfaces like Sellable for diverse products and abstract classes like Product for common behavior.
Source:,

12. What is the final keyword in Java, and how is it used?
    Explanation:

final variable: Constant, cannot be reassigned.
final method: Cannot be overridden.
final class: Cannot be extended.

Sample Code:
final class Config {
final int MAX_USERS = 100;
final void setLimit() { System.out.println("Limit: " + MAX_USERS); }
}
class Main {
public static void main(String[] args) {
Config config = new Config();
// config.MAX_USERS = 200; // Error
config.setLimit(); // Output: Limit: 100
}
}

Real-World Scenario: Uber’s pricing constants (e.g., base fare) are final to prevent unintended changes.

13. Explain the super keyword with an example.
    Explanation: The super keyword accesses superclass methods, fields, or constructors.
    Sample Code:
    class Animal {
    void sound() { System.out.println("Some sound"); }
    }
    class Dog extends Animal {
    void sound() {
    super.sound(); // Call superclass method
    System.out.println("Bark");
    }
    }
    public class Main {
    public static void main(String[] args) {
    Dog dog = new Dog();
    dog.sound(); // Output: Some sound \n Bark
    }
    }

Real-World Scenario: Oracle’s JDBC drivers use super to initialize base driver functionality in subclasses.

14. What is the difference between composition and inheritance? When would you use each?
    Explanation:

Inheritance: IS-A relationship (e.g., Dog is an Animal).
Composition: HAS-A relationship (e.g., Car has an Engine).
When to Use:
Inheritance: For strong IS-A relationships with shared behavior.
Composition: For flexible, loosely coupled designs.



Sample Code (Composition):
class Engine {
void start() { System.out.println("Engine started"); }
}
class Car {
Engine engine = new Engine();
void drive() { engine.start(); }
}

Real-World Scenario: Amazon uses composition in its Order class, which contains a Payment object, for flexibility.
Source:

Advanced-Level OOP Questions (5–8+ Years Experience)
15. Design a parking lot system using OOP principles.
    Explanation: This is a common object-oriented design (OOD) question at companies like Amazon and Google. The system should handle parking slots, vehicle types, and parking operations.
    Sample Code:
    enum VehicleType { CAR, BIKE, TRUCK }
    class Vehicle {
    String licensePlate;
    VehicleType type;
    Vehicle(String licensePlate, VehicleType type) {
    this.licensePlate = licensePlate;
    this.type = type;
    }
    }
    class ParkingSlot {
    int id;
    VehicleType type;
    boolean isOccupied;
    Vehicle vehicle;
    ParkingSlot(int id, VehicleType type) {
    this.id = id;
    this.type = type;
    this.isOccupied = false;
    }
    void park(Vehicle vehicle) {
    if (!isOccupied && vehicle.type == this.type) {
    this.vehicle = vehicle;
    isOccupied = true;
    }
    }
    void remove() {
    vehicle = null;
    isOccupied = false;
    }
    }
    class ParkingLot {
    List<ParkingSlot> slots;
    ParkingLot(int carSlots, int bikeSlots, int truckSlots) {
    slots = new ArrayList<>();
    for (int i = 0; i < carSlots; i++) slots.add(new ParkingSlot(i, VehicleType.CAR));
    for (int i = carSlots; i < carSlots + bikeSlots; i++) slots.add(new ParkingSlot(i, VehicleType.BIKE));
    for (int i = carSlots + bikeSlots; i < carSlots + bikeSlots + truckSlots; i++) slots.add(new ParkingSlot(i, VehicleType.TRUCK));
    }
    ParkingSlot findSlot(VehicleType type) {
    for (ParkingSlot slot : slots) {
    if (!slot.isOccupied && slot.type == type) return slot;
    }
    return null;
    }
    void parkVehicle(Vehicle vehicle) {
    ParkingSlot slot = findSlot(vehicle.type);
    if (slot != null) {
    slot.park(vehicle);
    System.out.println("Parked " + vehicle.licensePlate + " in slot " + slot.id);
    } else {
    System.out.println("No slot available for " + vehicle.type);
    }
    }
    }
    public class Main {
    public static void main(String[] args) {
    ParkingLot lot = new ParkingLot(2, 1, 1);
    lot.parkVehicle(new Vehicle("ABC123", VehicleType.CAR)); // Output: Parked ABC123 in slot 0
    lot.parkVehicle(new Vehicle("XYZ789", VehicleType.BIKE)); // Output: Parked XYZ789 in slot 2
    }
    }

Design Choices:

Encapsulation: Private fields with public methods.
Abstraction: ParkingSlot hides slot allocation details.
Polymorphism: Vehicle types handled via VehicleType enum.

Real-World Scenario: Uber uses a similar design for managing parking at driver hubs.
Source:

16. How do you implement the Singleton pattern in Java, and why would you use it?
    Explanation: The Singleton pattern ensures a class has only one instance and provides a global access point. It’s used for resource management (e.g., database connections).
    Sample Code:
    class Singleton {
    private static Singleton instance;
    private Singleton() { } // Private constructor
    public static synchronized Singleton getInstance() {
    if (instance == null) instance = new Singleton();
    return instance;
    }
    }

Real-World Scenario: Google’s configuration manager uses Singleton to ensure a single configuration instance across services.

17. Explain the SOLID principles with examples.
    Explanation:

Single Responsibility Principle (SRP): A class should have one reason to change.
Open/Closed Principle (OCP): Open for extension, closed for modification.
Liskov Substitution Principle (LSP): Subclasses should be substitutable for superclasses.
Interface Segregation Principle (ISP): Clients should not implement unnecessary methods.
Dependency Inversion Principle (DIP): Depend on abstractions, not implementations.

Sample Code (OCP):
interface Payment {
void process();
}
class CreditCardPayment implements Payment {
public void process() { System.out.println("Processing credit card payment"); }
}
class PayPalPayment implements Payment {
public void process() { System.out.println("Processing PayPal payment"); }
}

Real-World Scenario: Amazon’s payment system adheres to OCP by allowing new payment methods without modifying existing code.
Source:

18. Design a vending machine using OOP principles.
    Explanation: This OOD question tests encapsulation, polymorphism, and state management.
    Sample Code:
    class Product {
    String name;
    double price;
    int quantity;
    Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    }
    }
    class VendingMachine {
    private Map<String, Product> inventory;
    private double balance;
    VendingMachine() {
    inventory = new HashMap<>();
    balance = 0.0;
    }
    void addProduct(Product product) {
    inventory.put(product.name, product);
    }
    void insertMoney(double amount) {
    if (amount > 0) balance += amount;
    }
    Product dispense(String productName) {
    Product product = inventory.get(productName);
    if (product == null || product.quantity == 0) {
    System.out.println("Product unavailable");
    return null;
    }
    if (balance >= product.price) {
    product.quantity--;
    balance -= product.price;
    System.out.println("Dispensing " + productName);
    return product;
    }
    System.out.println("Insufficient balance");
    return null;
    }
    }
    public class Main {
    public static void main(String[] args) {
    VendingMachine vm = new VendingMachine();
    vm.addProduct(new Product("Cola", 1.5, 10));
    vm.insertMoney(2.0);
    vm.dispense("Cola"); // Output: Dispensing Cola
    }
    }

Real-World Scenario: Oracle’s cafeteria systems use similar designs for automated vending.
Source:,

19. What are default methods in Java interfaces (Java 8+), and why are they useful?
    Explanation: Default methods provide a default implementation in interfaces, allowing backward compatibility when adding new methods.
    Sample Code:
    interface Vehicle {
    void drive();
    default void stop() { System.out.println("Vehicle stopped"); }
    }
    class Car implements Vehicle {
    public void drive() { System.out.println("Car driving"); }
    }
    public class Main {
    public static void main(String[] args) {
    Car car = new Car();
    car.drive(); // Output: Car driving
    car.stop();  // Output: Vehicle stopped
    }
    }

Real-World Scenario: Google’s API frameworks use default methods to add features without breaking existing implementations.
Source:

20. How do you override equals() and hashCode() methods, and why are they important?
    Explanation: Overriding equals() and hashCode() ensures proper object comparison and hashing in collections like HashMap.
    Sample Code:
    class User {
    String id;
    String name;
    User(String id, String name) {
    this.id = id;
    this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof User)) return false;
    User other = (User) obj;
    return id.equals(other.id) && name.equals(other.name);
    }
    @Override
    public int hashCode() {
    return 31 * id.hashCode() + name.hashCode();
    }
    }

Real-World Scenario: Amazon’s user management system overrides these methods to identify unique users in HashMap.

Senior-Level OOP Questions (8+ Years Experience)
21. How would you design a ride-sharing system like Uber using OOP?
    Explanation: This OOD question tests system design skills, focusing on class relationships, polymorphism, and scalability.
    Sample Code:
    enum RideStatus { REQUESTED, ACCEPTED, IN_PROGRESS, COMPLETED }
    interface User {
    String getId();
    }
    class Passenger implements User {
    String id;
    String name;
    Passenger(String id, String name) { this.id = id; this.name = name; }
    public String getId() { return id; }
    }
    class Driver implements User {
    String id;
    String name;
    boolean isAvailable;
    Driver(String id, String name) { this.id = id; this.name = name; this.isAvailable = true; }
    public String getId() { return id; }
    }
    class Ride {
    String rideId;
    Passenger passenger;
    Driver driver;
    RideStatus status;
    Ride(String rideId, Passenger passenger) {
    this.rideId = rideId;
    this.passenger = passenger;
    this.status = RideStatus.REQUESTED;
    }
    void assignDriver(Driver driver) {
    this.driver = driver;
    driver.isAvailable = false;
    status = RideStatus.ACCEPTED;
    }
    }
    class RideSharingSystem {
    List<Driver> drivers;
    List<Ride> rides;
    RideSharingSystem() {
    drivers = new ArrayList<>();
    rides = new ArrayList<>();
    }
    void addDriver(Driver driver) { drivers.add(driver); }
    Ride requestRide(Passenger passenger, String rideId) {
    Ride ride = new Ride(rideId, passenger);
    rides.add(ride);
    Driver driver = findAvailableDriver();
    if (driver != null) ride.assignDriver(driver);
    return ride;
    }
    Driver findAvailableDriver() {
    for (Driver driver : drivers) {
    if (driver.isAvailable) return driver;
    }
    return null;
    }
    }

Design Choices:

Abstraction: User interface for Passenger and Driver.
Encapsulation: Private fields with public methods.
Polymorphism: Ride handles different statuses dynamically.

Real-World Scenario: Uber’s core system uses similar OOP designs for ride management.

22. Explain the Factory pattern and its use in Java.
    Explanation: The Factory pattern creates objects without specifying the exact class, promoting loose coupling.
    Sample Code:
    interface Notification {
    void send();
    }
    class EmailNotification implements Notification {
    public void send() { System.out.println("Sending email"); }
    }
    class SMSNotification implements Notification {
    public void send() { System.out.println("Sending SMS"); }
    }
    class NotificationFactory {
    Notification createNotification(String type) {
    if ("email".equalsIgnoreCase(type)) return new EmailNotification();
    if ("sms".equalsIgnoreCase(type)) return new SMSNotification();
    return null;
    }
    }

Real-World Scenario: Amazon’s notification system uses Factory to create email or SMS notifications dynamically.

23. How does Java handle multiple inheritance, and what is the diamond problem?
    Explanation:

Java avoids multiple inheritance of classes to prevent the diamond problem, where a class inherits from two classes with a common ancestor, causing ambiguity.
Java supports multiple inheritance via interfaces (Java 8+ default methods resolve conflicts).

Sample Code:
interface A { default void show() { System.out.println("A"); } }
interface B { default void show() { System.out.println("B"); } }
class C implements A, B {
public void show() { A.super.show(); } // Resolve conflict
}

Real-World Scenario: Oracle’s middleware uses interfaces to allow components to implement multiple behaviors safely.
Source:

24. What is the role of the volatile keyword in Java, and how does it relate to OOP?
    Explanation: The volatile keyword ensures a variable’s value is always read from main memory, useful in multithreaded OOP applications.
    Sample Code:
    class SharedResource {
    volatile boolean flag = false;
    void setFlag() { flag = true; }
    boolean isFlag() { return flag; }
    }

Real-World Scenario: Google’s distributed systems use volatile for thread-safe object state management.

25. How would you implement the Observer pattern in Java?
    Explanation: The Observer pattern allows objects (observers) to be notified of changes in another object (subject).
    Sample Code:
    interface Observer {
    void update(String message);
    }
    class Subject {
    private List<Observer> observers = new ArrayList<>();
    void addObserver(Observer observer) { observers.add(observer); }
    void notifyObservers(String message) {
    for (Observer observer : observers) observer.update(message);
    }
    }
    class User implements Observer {
    String name;
    User(String name) { this.name = name; }
    public void update(String message) { System.out.println(name + " received: " + message); }
    }

Real-World Scenario: Amazon’s order system notifies users (observers) of order status changes.

Common Mistakes and Best Practices

Overloading vs Overriding: Ensure correct signatures; use @Override for clarity.
== vs .equals(): Use .equals() for object comparison.
Breaking Encapsulation: Always use private fields with getters/setters.
Overuse of Inheritance: Prefer composition for flexibility.
Ignoring SOLID Principles: Follow SOLID for scalable designs.

Source:,

This guide covers the spectrum of OOP questions asked at top MNCs, ensuring you’re prepared for both coding and system design challenges. Practice these with hands-on coding to ace your interviews!
