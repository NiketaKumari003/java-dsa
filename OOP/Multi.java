public class Main {

    public static void main(String[] args) {
        Dog d = new Dog(); // Create a Dog object
        d.eat();
        d.legs = 4; // Setting legs for the Dog object
        System.out.println(d.legs);
    }

    // Base class
    class Animal {
        String color;

        void eat() {
            System.out.println("eats");
        }

        void breathe() {
            System.out.println("breathes");
        }
    }

    class Mammal extends Animal {
        int legs;

        // Constructor to initialize legs
        public Mammal(int legs) {
            this.legs = legs; // Use 'this' keyword to access the class variable
        }
    }

    class Dog extends Mammal {
        String breed;

        // Dog constructor can optionally call the Mammal constructor
        public Dog() {
            super(4); // Call Mammal constructor with default 4 legs
        }
    }
}