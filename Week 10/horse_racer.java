/*
Have a horse "run" a track with 20 steps (use a for loop that iterates 20 times)
after each step, the horse should stop (sleep) for a random period of time
from 3 to 6 seconds

After the horse is finished, print out that the horse crossed the line
*/
import java.util.Random;
import java.lang.Thread;

class Horse implements Runnable{
    public String name;

    public Horse(String name){
        this.name = name;
    }

    @Override 
    public void run(){
        try{
            for(int i = 0; i < 20; i++){
                System.out.println(name + " is in step " + (i + 1) + "/20");
                Thread.sleep(new Random().nextInt(3000, 6001));
            }

            System.out.println(name + " has crossed the finish line...");
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

public class horse_racer {
    public static void main(String[] args) {
        Thread horse_1 = new Thread(new Horse("Tim"));
        Thread horse_2 = new Thread(new Horse("Tom"));
        Thread horse_3 = new Thread(new Horse("Carl"));
        Thread horse_4 = new Thread(new Horse("Bob"));
        Thread horse_5 = new Thread(new Horse("Steve"));

        horse_1.start();
        horse_2.start();
        horse_3.start();
        horse_4.start();
        horse_5.start();
    }
}
