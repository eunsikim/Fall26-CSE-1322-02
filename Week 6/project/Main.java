import java.util.Random;

public class Main {
    public static Enemy[] spawn(){
        Enemy[] enemies = new Enemy[3];

        Random rand = new Random();

        for(int i = 0; i < 3; i++){
            // Spawn Zombie
            if(rand.nextDouble() < .3){
                
            }
            // Spawn Skeleton
            else if(rand.nextDouble() < .6){
                
            }
            // Spawn Wraith
            else if(rand.nextDouble() < .9){

            }
            // Spawn Boss
            else{

            }
        }

        return enemies;
    }
    
    public static void main(String[] args) {
        spawn();
        // Player p1 = new Player("Player1", "Fist");

        // Skeleton s1 = new Skeleton("Dave", "Healthy", "Yes", 1);

        // // Player and Skeleton Status
        // System.out.println(p1);
        // System.out.println(s1);
        
        // System.out.println();
        
        // // Player attacks Skeleton
        // p1.attack(s1);
        // System.out.println(s1);
        
        // System.out.println();
        
        // // Skeleton attacks Skeleton
        // s1.attack(p1);
        // System.out.println(p1);
        
        // System.out.println();
        
        // // Player and Skeleton Status
        // System.out.println(p1);
        // System.out.println(s1);
    }
}
