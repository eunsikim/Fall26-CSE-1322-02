class Dog{
    // Attributes
    String name;
    int age;
}

// This is our driver class: The class containing the main function
public class classes {
    public static void main(String[] args) {
        Dog d1; // This is like buying a dog cage without a dog
        Dog d2 = new Dog(); // This is like buying a dog cage and a dog

        d1 = new Dog(); // We bought a dog to put in a dog cage

        d1.name = "Alice";
        d2.name = "Bob";

        System.out.println(d2.name);
        System.out.println(d1.name);
    }
}
