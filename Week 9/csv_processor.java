import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Employee{
    public String name;
    public String email;
    public String dept;
    public String role;
    public String salary;
    public String start_date;
    public String office;

    public Employee(String name, String email, String dept, String role, String salary, String start_date, String office){
        this.name = name;
        this.email = email;
        this.dept = dept;
        this.role = role;
        this.salary = salary;
        this.start_date = start_date;
        this.office = office;
    }
}

public class csv_processor {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        try(BufferedReader bf = new BufferedReader(new FileReader("employees.csv"))){
            while(true){
                String line = bf.readLine();

                if(line != null){
                    if(!line.equals("name,email,department,role,salary,start_date,office")){
                        String[] row = line.split(",");
                        employees.add(new Employee(row[0], row[1], row[2], row[3], row[4], row[5], row[6]));
                    }
                }
                else{
                    break;
                }
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        for(Employee e : employees){
            if(e.dept.equals("Sales")){
                System.out.println(e.name);
            }
        }
    }
}
