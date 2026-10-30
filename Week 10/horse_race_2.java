import java.util.Random;

class Horse implements Runnable{
    private String name;
    private int position;
    private int origin;
    private int bound;
    public static volatile boolean finished = false;

    public Horse(String name){
        this.name = name;
        origin = 500;
        bound = 1500;
        position = 0;
    }

    public Horse(String name, int origin, int bound){
        this.name = name;
        this.origin = origin;
        this.bound = bound;
        position = 0;
    }

    public int get_position(){
        return position;
    }

    public String get_name(){
        return name;
    }

    public void move(){
        this.position++;
    }

    @Override
    public void run(){
        try{

            for(int i = 0; i < 20; i++){
                if(finished){
                    break;
                }
                Thread.sleep(new Random().nextInt(origin, bound));

                move();
            }

            if(!finished){
                finished = true;
                System.out.println(name + " won!");
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

class Race {
    public static void print_track(Horse h){
        System.out.print(h.get_name() + ":\t");
        for(int i = 0; i < 20; i++){
            if(i == h.get_position()){
                System.out.print("O");
            }
            else{
                System.out.print("-");
            }
        }
        System.out.println();
    }

    public static void clear_track(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println();
    }

    public static void start_race(){
        Horse h1 = new Horse("Dave");
        Horse h2 = new Horse("Ben", 800, 801);
        Horse h3 = new Horse("Tim");
        Horse h4 = new Horse("Tom", 900, 950);
        Horse h5 = new Horse("Carl", 100, 2000);
        Horse h6 = new Horse("Bob");
        Horse h7 = new Horse("Steve", 500, 1200);

        Horse[] horses = {
                h1, h2, h3, h4, h5, h6, h7
        };



        Thread[] horse_threads = new Thread[horses.length];

        for(int i = 0; i < horses.length; i++){
            horse_threads[i] = new Thread(horses[i]);
        }

        for(Thread h : horse_threads){
            h.start();
        }

        try{
            while(!Horse.finished){
                clear_track();
                for(Horse h : horses){
                    print_track(h);
                }
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}


public class horse_race_2 {
    public static void main(String[] args) {
        // To execute, run the command `java src\test.java`
        Race.start_race();
    }
}