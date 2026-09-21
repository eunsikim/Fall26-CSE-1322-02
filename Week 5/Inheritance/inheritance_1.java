import java.util.ArrayList;

class user{
    private int id;
    private String username;
    private String password;
    public static int next_id = 1;

    public user(String username, String password){
        this.username = username;
        this.password = password;
        id = next_id++;
    }

    public String get_username(){
        return username;
    }

    public void print_user_info(){
        System.out.println("Username: " + username);
    }
}

class student extends user{
    private ArrayList<String> course_registered;
    private double GPA;
    private String academic_standing;

    public student(String username, String password, double GPA, String academic_standing){
        super(username, password); // super == parent
        this.GPA = GPA;
        this.academic_standing = academic_standing;
        course_registered = new ArrayList<>();
    }

    public void register_course(String course){
        course_registered.add(course);
    }

    public void remove_course(String course){
        course_registered.remove(course);
    }

    public ArrayList<String> get_course_registered(){
        return get_course_registered();
    }

    public double get_GPA(){
        return GPA;
    }

    public String get_academic_standing(){
        return academic_standing;
    }

    @Override 
    public void print_user_info(){
        super.print_user_info();
        System.out.println("GPA: " + GPA + " Academic Standing: " + academic_standing);
    }
}

class faculty extends user{
    private ArrayList<String> course_teaching; 
    private ArrayList<String> door_access;

    public faculty(String username, String password){
        super(username, password); // super == parent
        course_teaching = new ArrayList<>();
        door_access = new ArrayList<>();
    }

    public ArrayList<String> get_course_teaching(){
        return course_teaching;
    }

    public ArrayList<String> get_door_access(){
        return door_access;
    }
}

public class inheritance_1 {
    public static void main(String[] args) {
        faculty u1 = new faculty("ekim54", "password123");
        student u2 = new student("jdoe1", "qwerty", 2.0, "bad");

        u1.print_user_info();
        u2.print_user_info();

        
    }
}
