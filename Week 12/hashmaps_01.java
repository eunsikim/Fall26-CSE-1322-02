import java.util.HashMap;

public class hashmaps_01 {
    public static void main(String[] args) {
        HashMap<String,Integer> Letter_Grade_Counter = new HashMap<>();

        Letter_Grade_Counter.put("A", 0);
        Letter_Grade_Counter.put("B", 0);
        Letter_Grade_Counter.put("C", 0);
        Letter_Grade_Counter.put("D", 0);
        Letter_Grade_Counter.put("F", 0);

        for(String key : Letter_Grade_Counter.keySet()){
            System.out.println(key + ": " + Letter_Grade_Counter.get(key));
        }
        System.out.println();

        Letter_Grade_Counter.put("A", 1);

        for(String key : Letter_Grade_Counter.keySet()){
            System.out.println(key + ": " + Letter_Grade_Counter.get(key));
        }
        System.out.println();
        System.out.println("Size of HashMap: " + Letter_Grade_Counter.size());

        Letter_Grade_Counter.remove("F");

        for(String key : Letter_Grade_Counter.keySet()){
            System.out.println(key + ": " + Letter_Grade_Counter.get(key));
        }
        System.out.println();

        System.out.println("Size of HashMap: " + Letter_Grade_Counter.size());

        Letter_Grade_Counter.clear();
        for(String key : Letter_Grade_Counter.keySet()){
            System.out.println(key + ": " + Letter_Grade_Counter.get(key));
        }
    }
}
