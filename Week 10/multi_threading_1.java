import java.util.Random;
import java.lang.Thread;

class Baby implements Runnable{
    private String name;

    public Baby(String name){
        this.name = name;
    }

    @Override 
    public void run(){
        try{
            int sleep_time = new Random().nextInt(5000, 10001);

            System.out.println(name + " is going to sleep for " + (sleep_time / 1000.0) + " seconds...");


            Thread.sleep(sleep_time);

            System.out.println(name + " has woken up");
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

public class multi_threading_1 {
    public static void main(String[] args) {
        Thread baby_1 = new Thread(new Baby("Tim"));
        Thread baby_2 = new Thread(new Baby("Tom"));
        Thread baby_3 = new Thread(new Baby("Carl"));
        Thread baby_4 = new Thread(new Baby("Bob"));
        Thread baby_5 = new Thread(new Baby("Steve"));

        baby_1.start();
        baby_2.start();
        baby_3.start();
        baby_4.start();
        baby_5.start();
    }
}
