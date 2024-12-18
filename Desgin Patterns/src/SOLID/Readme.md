# A SOLID guide to SOLID principles

## 1. Single Responsibility Principle
- Each class should have only one responsibility, one single purpose. This meaning tha a class will do only one job, which leads us to conclude it should have _only one reason to change_

## 2. Open/Closed Principle
- A class should be _open_ for _extension_ but _closed_ for _modification_
- This mean that u should be able to add new functionality to a class without altering its existing code. Instead of modifying the old class, you should extend them or use interfaces and polymorphism to add new behaviors.

## 3. Liskov Substitution Principle
- Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.
- If class **B** is a subclass of class **A**, you should be able to use objects of type **B** wherever objects of type **A** without alerting the desired properties of the program.

## 4. Interface Segregation Principle
- Instead of use 1 big interface, you should use several small interfaces, each one with a single responsibility.
- _Example in Real-World_: If you have a remote control with 20 buttons, but you only use 5 of them, you should have a remote control with only 5 buttons.

## 5. Dependency Inversion Principle
- High-level modules should not depend on low-level modules. Both should depend on abstractions.
- Interface(abstraction) should not depend on details, details should depend on it. (Classes communicate with each other through interfaces, 
not directly with implementations)





