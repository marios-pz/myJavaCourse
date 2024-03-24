class OuterClass {
    private int x = 10;

    // Inner class
    class InnerClass {
        void display() {
            System.out.println("Value of x is " + x);
        }
    }

    void createInnerObject() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInnerObject();
    }
}
