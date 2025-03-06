/*
- The first letter of class names are capitalized to distinguish class names from member names. These conventions are not enforced by Java compilers, but it is considered bad style to violate them. A related convention is to never use the special character $ in a name; this character is reserved for the use of the Java compiler. Unfortunately, most Java compilers do not enforce this convention.

- Keep in mind that in Java, the main() method serves as the entry point for the program. It must be defined inside a class, and it's called automatically when you run the program. From the main() method, you can create objects of other classes and call their methods as needed.

- A Java class should have the same file name as of the main class.
- Only one "public" class can be inside a java file
- A empty class with no objects, does not take space in the memory. No memory allocated on runtime.

- "." operator is used for accessing either the BEHAVIOURS(int, string)  or PROPERTIES(functions/methods) both.

- Function called inside of a class is a METHOD.

- Java does not support methods within a method, i.e , we CANNOT HAVE NESTED METHODS! so dont try to write a method inside of the "main" method of the public java main class or simply the first class I have written in this code, we write it everytime the main class in case I FORGET THAT .

 */

public class Polymorphism {
    public static void main(String[] args) {
        Person p1 = new Person(); // Person() is the default constructor. Default constructor takes no arguments.
        // Constructor constructs a new object. It initializes the object for use. "p1"
        // is the object, "Person()" is the constructor.
        // creation of OBJECT of Person class, so that it functions/methods could
        // called.
        p1.age = 19;
        p1.name = "Pranjal";
        System.out.println(p1.name);
        p1.walk(2); //

        /*
         * Person p2 = new Person("Nikita", 18); // Here we overloaded the constructor
         * "Person"
         * System.out.println(p2.name);
         * System.out.println(p2.age);
         * 
         */

        Person p3 = new Person();
        System.out.println(p3.name);
        System.out.println(p3.age);
        System.out.println("Number of persons using Person Constructor: " + Person.count); // Here we did create an
                                                                                           // object of the Person
                                                                                           // class, but it is
                                                                                           // absolutely not necessary
                                                                                           // to make a object of its
                                                                                           // class.

    }
}

class Person {
    static int count; // To use anything(variable, method etc.) which is static, we need not
                      // initialize an object of it class first, we can just use it without creating
                      // the object of its class. (Class contains -> Properties, Functions) (Objects
                      // created from -> Classes)

    public Person() {
        count++;
        System.out.println("This is the message of the object p1 being initialized via a constructor that we defined.");

    }

    /*
     * CONSTRUCTOR OVERLOADING
     * public person(String newName, int newAge){
     * name = newName;
     * age = newAge;
     * }
     */

    public Person(String name, int age) {
        this(); // Using this() keyword we are able to call the properties of non-overloaded
                // Person() constructor to the overloaded one, if we remove this the count will
                // show as '1' until we add count++ in the overloaded constructor, but rather we
                // would add this().

        this.age = age; // this() keyword can also be used to set the variables values as per the values
                        // that are present in the current class. Here String name = "Rajat" , therefore
                        // any object created using the overloaded contructor will have the name Rajat,
                        // similarily the age would be 10.
        this.name = name;

    }

    int age = 10;
    String name = "Rajat"; //

    // THE ABOVE 2 ARE CALLED AS PROPERTIES, WHEN WE WRITE A FUNCTION WE CALL IT AS
    // METHOD OR BEHAVIOUR THAT DEFINES WHAT IT DOES.
    void walk() {
        System.out.println(name + " is walking.");
        // THIS A "BEHAVIOUR" OF A FUNCTION/METHOD.
        // HERE THE RETURN TYPE IS "void" MEANING IT DOESN'T HAVE TO RETURN ANY CODE OF
        // SUCCESSFUL COMPLETION OR NOT, ex "return 0" is USED FOR INT.
    }

    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps.");

        /*
         * - Here we saw the polymorphism(many forms) techniques, walk() function has
         * taken 2 forms , one with attribute and one without, so when a function/method
         * takes many forms we call it as Polymorphism.
         * 
         * - It is checked upon runtime and not on compile time, that is, it is checked
         * before compilation.
         */
    }

}
