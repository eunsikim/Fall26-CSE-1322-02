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

    public String get_email(){
        return get_username() + "@kennesaw.edu";
    }

    @Override 
    public void print_user_info(){
        super.print_user_info();
        System.out.println(get_username() + "@kennesaw.edu");
    }
}

public class poly_2 {
    public static void main(String[] args) {
        ArrayList<user> users = new ArrayList();
        users.add(new faculty("ekim54", "password123"));
        users.add(new student("jdoe1", "qwerty", 2.0, "bad"));

        for(user u : users){            
            if(u instanceof student){
                student s1 = (student)u;
                System.out.println(s1.get_GPA());
            }
            else if(u instanceof faculty){
                System.out.println(((faculty)u).get_email());
            }
        }
    }
}
