import java.util.Random;

class Horse implements Runnable{
    private String name;
    private int position;

    public Horse(String name){
        this.name = name;
        position = 0;
    }

    public String get_name(){ return name;}
    public int get_position(){ return position;}

    @Override
    public void run(){
        try{
            for(int i = 0; i < 20; i++){
                position++;
                // Thread.sleep(new Random().nextInt(500, 1000));
                Thread.sleep(300);
                if(i == 19){
                    Race_Track.cross_finish_line(this);
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class Race_Track{
    public static boolean finish_line_crossed = false;

    // public static void cross_finish_line(Horse h){ // This can cause multiple horses "winning"
    public synchronized static void cross_finish_line(Horse h){ // This should fix the race condition by making sure only one thread uses this funciton at a time
        if(!finish_line_crossed){
            finish_line_crossed = true;
            System.out.println(h.get_name() + " crossed the finish line first");
        }
        else{
            System.out.println(h.get_name() + " crossed the finish line");
        }
    }

    public static void print_race_track(Horse[] horses){
        for(Horse h : horses){
            System.out.print(h.get_name() + ":\t");
            for(int i = 0; i < 20; i++){
                if(h.get_position() == i){
                    System.out.print("O");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public static void clear_track(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println();
    }
}

public class horse_race_2 {
    public static void main(String[] args) {
        // Create Horses and Threads
        String[] horse_names = {"Tim", "Tom", "Carl", "Bob", "Steve"};
        
        Horse[] horses = new Horse[horse_names.length];

        for(int i = 0; i < horses.length; i++){
            horses[i] = new Horse(horse_names[i]);
        }

        Thread[] threads = new Thread[horses.length];

        for(int i = 0; i < threads.length; i++){
            threads[i] = new Thread(horses[i]);
        }

        // Initialize Threads
        for(Thread t : threads){
            t.start();
        }

        // Keep track of the racetrack
        while(!Race_Track.finish_line_crossed){
            try{
                Race_Track.print_race_track(horses);
                System.out.println();
                Thread.sleep(250);
                if(!Race_Track.finish_line_crossed){
                    Race_Track.clear_track();
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}