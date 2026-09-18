class Student{
    private String name;
    private Double GPA;
    private int id;
    public static int next_id = 1; // We use this static value (counter) to see what is the next available id number (for the next student object)

    public Student(){
        name = "Alice";
        GPA = 3.0;
        id = next_id;
        next_id++;
    }

    public Student(String name, Double GPA){
        this.name = name;
        this.GPA = GPA;
        id = next_id;
        next_id++;
    }

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

    public int get_id(){
        return id;
    }

    @Override 
    public String toString(){ 
        return "Name: " + name + " GPA: " + GPA + " ID: " + id;
    }
}

public class static_keyword_2 {
    public static void main(String[] args) {
        /*next_id = 1*/Student s1 = new Student();//next_id = 2
        /*next_id = 2*/Student s2 = new Student();//next_id = 3
        /*next_id = 3*/Student s3 = new Student();//next_id = 4
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();
        Student s7 = new Student();
        /*next_id = 8*/Student s8 = new Student();//next_id = 9
        /*next_id = 8*/Student s9 = new Student();//next_id = 10

        s1 = new Student("Bob", 3.2);

        Student[] student_arr = {s1, s2, s3, s4, s5, s6, s7, s8, s9};

        for(Student s : student_arr){
            System.out.println(s);
        }

        System.out.println(Student.next_id);
    }
}
