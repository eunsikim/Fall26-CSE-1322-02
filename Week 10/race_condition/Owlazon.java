import java.util.ArrayList;

class Warehouse{
    public static ArrayList<String> inventory = new ArrayList<>();

    public static ArrayList<String> truck = new ArrayList<>();

    public static int index = 0;

    public synchronized static int take_item(){
        return index++;
    }

    public synchronized static void add_to_truck(String item){
        truck.add(item);
    }   
}

class Worker implements Runnable{
    public String name;
    
    public Worker(String name){
        this.name = name;
    }

    @Override 
    public void run(){
        while(Warehouse.index < Warehouse.inventory.size()){
            String item = Warehouse.inventory.get(Warehouse.take_item());
            Warehouse.add_to_truck(item);
        }
    }
}

public class Owlazon {
    public static void main(String[] args) {
        int inventory_size = 1000;
        int thread_amount = 100;

        for(int i = 0; i < inventory_size; i++){
            Warehouse.inventory.add("Item " + (i + 1));
        }

        Thread[] workers = new Thread[thread_amount];

        for(int i = 0; i < thread_amount; i++){
            workers[i] = new Thread(new Worker("Worker " + (i + 1)));
        }

        System.out.println("Workers started transfering items into the truck...");

        for(int i = 0; i < thread_amount; i++){
            workers[i].start();
        }

        try{
            for(int i = 0; i < thread_amount; i++){
                workers[i].join();
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Truck has " + Warehouse.truck.size() + " items");
    }
}
