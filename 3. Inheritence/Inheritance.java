/*
ACESS SPECIFIER
Public - Anyone can access
Default (without any specifer) - Only the child class and class itself
Private - Within that class only
Protected - Child class and child class outside package.
 */

public class Inheritance {
    public static void main(String[] args){
        personTwo p1 = new personTwo();
        p1.printName("Pranjal");


        // All of the objects have a common parent called as Object class which is present by default in Java.




    }
}


class Person{

    public Person(char Gender){
        System.out.println("Your gender is Male, there are only 2 genders int world that is why I have given it the data type of char");
    }
    int age = 10;
    String name = "Pranjal";

    public Person() {

    }

    public void printName(String newName) {
        newName = name;
        System.out.println("Your name is: " + name);

    }


    }


class personTwo extends Person {

    public personTwo(char Gender) {
        super(Gender); // super() keyword is used to call the constructer of the parent class. Automatically called if the orignal constructor, i.e, without the overloading is written.
    }

    public personTwo() {

    }


    public void printName(String newName) {
        newName = name;
        System.out.println("This is from the 2nd function " + name);
    }
}

    