## 1. Regular Expressions
The solution is in the file RegularExpression.java.
## 2. Objects
The solution is in the files Objects.java and Student.java(/domain package). My solution reads a .csv file inside the resources directory.
## 3. Design Pattern
 - [Singleton](#Singleton):
    - It is used so that a class has only one instance. Must be used when the resource is shared
      across the entire application without creating multiple instances. Example in the files Singleton.java and SingletonPattern (/singletonpattern package).
 - [Dependency Injection](#DependencyInjection):
    - It is used to provide external dependencies instead the class itself creating them. It should be used to reduce coupling between classes, facilitating the maintenance and testing process. Example in the files DependencyInjection.java, Car.java(/dependencyinjection package), ElectricEngine.java(/dependencyinjection package), Engine.java(/dependencyinjection package).
## 4. Inheritance
The solution is in the files Inheritance.java, Product.java(/domain package) and Clothing.java(/domain package)
## 5. Threads
The solution is in the files Robot.java, HorizontalThread.java(/robot package) and VerticalThread.java(/robot package)
## 6. Correct the Code
    - When defining the class, it is necessary to extend Threads, not implement;
    - The constructor needs to declare the price and assign the value to it;
    - The run() method needs to be override of the Threads extended class;
    - Missing the object name, type, and parameters when creating a new carThread, it expects params "make", "model" and "price";
    - The new carThreads were not started;
The solution is in the file CarThread.java
## 7. Bonus
The solution is in the file Bonus.java
