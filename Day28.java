public class Day28 {
    // More about OOP in Java - Abstract Classes
    abstract class Animal {
        abstract void sound();
        void sleep() {
            System.out.println("The animal is sleeping.");
        }
    }   
    class Dog extends Animal {
        void sound() {
            System.out.println("The dog barks.");
        }
    }   
    class Cat extends Animal {
        void sound() {
            System.out.println("The cat meows.");
        }
    }   
    public static void main(String[] args) {
        Day28 day28 = new Day28();
        Animal dog = day28.new Dog();
        Animal cat = day28.new Cat();
        dog.sound(); // Output: The dog barks.
        dog.sleep(); // Output: The animal is sleeping.
        cat.sound(); // Output: The cat meows.
        cat.sleep(); // Output: The animal is sleeping.
    }
    // Notes : This code demonstrates the use of abstract classes in Java. The Animal class is an abstract class that contains an abstract method sound() and a concrete method sleep(). The Dog and Cat classes extend the Animal class and provide their own implementations of the sound() method.
}

