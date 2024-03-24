public class ClassesAndObjects {
    String name;
    int age;

    // Constructor
    public ClassesAndObjects(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Instance method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects
        ClassesAndObjects person1 = new ClassesAndObjects("John", 25);
        ClassesAndObjects person2 = new ClassesAndObjects("Jane", 30);

        // Calling instance methods
        person1.displayInfo();
        person2.displayInfo();
    }
}
