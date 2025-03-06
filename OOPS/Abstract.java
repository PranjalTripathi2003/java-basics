public class Abstract {
    public static void main(String[] args) {
        BMW car1 = new BMW();
        car1.turnON();
        car1.concreteFunctions();

        Audi car2 = new Audi();
        car2.turnON();

    }
}

// Abstract is an Idea that we dont have to show extra fuss to the user,i.e, for
// a remote to swtich off the AC , the user need not know how the remote
// functions, for the user the remote should work when a button is pressed.

abstract class Car {
    public abstract void turnON(); // Here "turnOn" is an abstract method, an idea that a Car should turn on, the
                                   // user does not need to know how it works, all cars will turn on differently,
                                   // user just needs to know that its car will turn on according to the manual
                                   // provided for that particular model to turn on.

    // We cannot directly create an Object for the class Car in the main class, the
    // IDE will give us a compile time error

    // If we created an abstract method, it is MANDATORY that its class should also
    // be abstract.
    public void concreteFunctions() {
        System.out.println("Inside abstract class if a function is defined then it is called as Concrete Function");

        // Hence there is no true abstraction, therfore we use Interfaces for it.
    }
}

class BMW extends Car {
    // Since it extends "Car" we have to take the idea that a car could turnOn
    // forward, and write the function for how a BMW will turn on, it can be
    // different for Audi.
    // This is called "Overriding" the abstract class.
    public void turnON() {
        System.out.println("Brrrrr");

    }

}

// OR WE CAN ALSO TAKE THAT IDEA ON HOW AN AUDI WILL TURN ON

class Audi {
    public void turnON() {
        System.out.println("Vrooom-Vroom");
    }
}