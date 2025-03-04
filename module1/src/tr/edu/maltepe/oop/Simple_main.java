package tr.edu.maltepe.oop;
public class Class {
    private String name;
    private int age;

    // Constructor
    public Class(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // meow method
    public void meow() {
        System.out.println("Meow!");
    }

    public static void main(String[] args) {
        // Creating objects
        Class obj1 = new Class("Kitty", 2);
        Class obj2 = new Class("Tom", 3);

        // Calling the meow method
        obj1.meow();
        obj2.meow();
    }
}
