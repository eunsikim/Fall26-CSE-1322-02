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
        Player player = new Player("Player1", "Fist");

        Skeleton rider_skeleton = new rider_skeleton("bob", "alive", "tbd", 1);
        Zombie fire_zombie = new fire_zombie("Dave", "alive", "tbd", 1);

        System.out.println(player);
        System.out.println(fire_zombie);
        
        fire_zombie.attack(player);
        
        System.out.println(player);
        System.out.println(rider_skeleton);
    }
}
