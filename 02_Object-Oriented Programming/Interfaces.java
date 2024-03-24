interface Animal {
    void sound(); // Interface method (does not have a body)
}

// Dog "implements" the Animal interface
class Dog implements Animal {
    // The body of sound() is provided here
    public void sound() {
        System.out.println("Woof");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create a Dog object
        myDog.sound(); // Call the sound method
    }
}
