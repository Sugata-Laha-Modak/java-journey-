public class Day19 {
    public static void main(String[] args) {
        // oops in java
        // Object Oriented Programming
        // 1. Encapsulation
        // 2. Inheritance
        // 3. Polymorphism
        // 4. Abstraction
        // Encapsulation is the process of wrapping data and code together as a single unit. In Java, we can achieve
        // encapsulation by using classes and objects. We can declare the variables of a class as private and provide
        // public getter and setter methods to access and update the values of the variables. This way
        // we can control the access to the variables and protect them from unauthorized access.
        // Inheritance is the process by which one class can inherit the properties and behaviors of another
        // class. In Java, we can achieve inheritance by using the extends keyword. The class that inherits the
        // properties and behaviors is called the subclass or child class, and the class that is inherited from is called the superclass or parent class. Inheritance promotes code reusability and establishes a natural hierarchical relationship between classes.
        // Polymorphism is the ability of an object to take on many forms. In Java      
        // we can achieve polymorphism through method overloading and method overriding. Method overloading allows us to define multiple methods with the same name but different parameters, while method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass. Polymorphism enables us to write more flexible and maintainable code.
        // Abstraction is the process of hiding the implementation details and showing only the functionality to the    
        // user. In Java, we can achieve abstraction by using abstract classes and interfaces. An abstract class is a class that cannot be instantiated and may contain abstract methods (methods without a body) that must be implemented by its subclasses. An interface is a reference type in Java that can contain only constants, method signatures, default methods, static methods, and nested types. Abstraction helps to reduce complexity and allows the programmer to focus on interactions at a higher level.
        class student {
            private String name;
            private int age;

            public student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }
        student s1 = new student("John", 20);
        System.out.println(s1.getName()); // Output: John
        System.out.println(s1.getAge());  // Output: 20     
        
    }
}
