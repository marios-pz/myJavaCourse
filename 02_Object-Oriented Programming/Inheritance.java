public class Inheritance {
    public static void main(String[] args) {
        // Example of inheritance
        Dog dog = new Dog();
        dog.eat(); // Output: Dog is eating
        dog.bark(); // Output: Dog is barking
    }
}

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
