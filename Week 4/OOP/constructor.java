class Student{
    String name;
    Double GPA;

    // Default constructor: Java will always add a default constructor
    // The Default "default constructor" does not do anything.

    // We can modify/override the default constructor given by Java
    // to modify its behavior
    public Student(){
        name = "Alice";
        GPA = 3.0;
    }

    // Overloaded constructor
    public Student(String name, Double GPA){
        this.name = name;
        this.GPA = GPA;
    }
}

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Dave", 3.1);

        System.out.println("Name: " + s1.name + " GPA: " + s1.GPA);
        System.out.println("Name: " + s2.name + " GPA: " + s2.GPA);
    }
}
