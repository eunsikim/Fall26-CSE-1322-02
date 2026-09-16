class Student{
    // Attributes should set to private
    private String name;
    private Double GPA;

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

    // Getter
    public String get_name(){
        return name;
    }
    public Double get_GPA(String name){
        if(name.equals(this.name)){
            return GPA;
        }
        else{
            return -1.0;
        }
    }

    // Setter
    public void set_name(String name){
        this.name = name;
    }
    public void set_GPA(double GPA, String user_type){
        if(user_type.equals("faculty")){
            this.GPA = GPA;
        }
        else{
            System.out.println("You must be faculty to change GPA");
        }
    }
}

public class access_modifiers {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Dave", 3.1);

        System.out.println("Name: " + s1.get_name() + " GPA: " + s1.get_GPA("Alice"));
        System.out.println("Name: " + s2.get_name() + " GPA: " + s2.get_GPA("Alice"));
        System.out.println();

        s1.set_name("Eun Sik");

        System.out.println("Name: " + s1.get_name() + " GPA: " + s1.get_GPA("Eun Sik"));
        System.out.println("Name: " + s2.get_name() + " GPA: " + s2.get_GPA("Alice"));
        System.out.println();
        
        s1.set_GPA(4.0, "student");
        System.out.println("Name: " + s1.get_name() + " GPA: " + s1.get_GPA("Eun Sik"));
        System.out.println("Name: " + s2.get_name() + " GPA: " + s2.get_GPA("Alice"));
        System.out.println();

        s1.set_GPA(4.0, "faculty");
        System.out.println("Name: " + s1.get_name() + " GPA: " + s1.get_GPA("Eun Sik"));
        System.out.println("Name: " + s2.get_name() + " GPA: " + s2.get_GPA("Alice"));
        System.out.println();
    }
}
