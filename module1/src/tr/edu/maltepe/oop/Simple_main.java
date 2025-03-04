class Cat {
    // Method definition
    void meow() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating two objects of the Cat class
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        // Calling the meow method on both objects
        cat1.meow();
        cat2.meow();
    }
}
