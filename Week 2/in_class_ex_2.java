import java.util.Scanner;

public class in_class_ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What time: ");
        String time = sc.nextLine();

        switch (time) {
            case "morning":
                System.out.print("Light or Heavy: ");
                String type = sc.nextLine();

                switch(type){
                    case "light":
                        System.out.println("Fruit");
                        break;
                    case "heavy":
                        System.out.println("Pancakes with eggs");
                        break;
                }

                break;
            case "afternoon":
                
                break;
            case "evening":
                
                break;
        }
    }
}
