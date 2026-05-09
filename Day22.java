public class Day22 {
    // More about OOP in Java - Interfaces part 2
    
    public static void main(String[] args) {
  interface Movable {
        void move();
    }   
    class Car implements Movable {
        public void move() {
            System.out.println("The car is moving.");
        }
    }
    class Bicycle implements Movable {
        public void move() {
            System.out.println("The bicycle is moving.");
        }
    }
    Movable car = new Car();
    Movable bicycle = new Bicycle();
    car.move(); // Output: The car is moving.   
    bicycle.move(); // Output: The bicycle is moving.
    }
    // Interfaces can also have default methods with implementation
    interface Drawable {
        void draw();
        default void color() {
            System.out.println("Default color is black.");
        }
    }   
    class Circle implements Drawable {
        public void draw() {
            System.out.println("Drawing a circle.");
        }
    }   
    Circle circle = new Circle();
    circle.draw(); // Output: Drawing a circle. 
    circle.color(); // Output: Default color is black.
    
}
