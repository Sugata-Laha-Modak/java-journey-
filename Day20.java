public class Day20 {
    // More about OOP in Java
    public static void main(String[] args) {
        // Inheritance example
        class Animal {
            void eat() {
                System.out.println("This animal eats food.");
            }
        }

        class Dog extends Animal {
            void bark() {
                System.out.println("The dog barks.");
            }
        }

        Dog dog = new Dog();
        dog.eat(); // Output: This animal eats food.
        dog.bark(); // Output: The dog barks.

        // Polymorphism example
        class Shape {
            void draw() {
                System.out.println("Drawing a shape.");
            }
        }

        class Circle extends Shape {
            void draw() {
                System.out.println("Drawing a circle.");
            }
        }

        class Square extends Shape {
            void draw() {
                System.out.println("Drawing a square.");
            }
        }

        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        shape1.draw(); // Output: Drawing a circle.
        shape2.draw(); // Output: Drawing a square.

        // Abstraction example
        abstract class Vehicle {
            abstract void start();
        }

        class Car extends Vehicle {
            void start() {
                System.out.println("The car starts with a key.");
            }
        }

        class Bike extends Vehicle {
            void start() {
                System.out.println("The bike starts with a button.");
            }
        }

        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bike();

        vehicle1.start(); // Output: The car starts with a key.
        vehicle2.start(); // Output: The bike starts with a button.
    }
     
}
