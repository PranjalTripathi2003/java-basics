
// Inside an interface all the function are by default PUBLIC and ABSTRACT.
// Interface provide us true abstraction, whereas an Abstract class does not
// Interface helps us to use "Multiple Inheritence" well technically becuase using classes it is not allowed.

public class Interface implements understandInterface{
    public static void main(String[] args) {
        System.out.println(color);
    }


    @Override
    public void understandInterface() {
        System.out.println("We understood Interface");
    }
}

interface understandInterface{
    String color = "Blue";
void understandInterface(); // Giving it a body will throw us an error.
}