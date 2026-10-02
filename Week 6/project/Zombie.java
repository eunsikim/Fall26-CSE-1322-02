import java.util.Random;

abstract class Zombie extends Enemy{
    public Zombie(double hp, String name, String status, int damage, String affinity, int diff_mult){
        super(hp, name, status, damage, affinity, diff_mult);
    }

    @Override 
    public void attack(Entity e){
        e.take_damage(get_damage());
        System.out.println("Zombie dealt " + get_damage());
    }

    @Override 
    public String toString(){
        return "Zombie" + super.toString();
    }
}

class reg_zombie extends Zombie implements Iinfected_type{
    public reg_zombie(double hp, String name, String status, int damage, String affinity, int diff_mult){
        super((diff_mult * 80), name, status, (diff_mult * 30), affinity, diff_mult);
    }

    @Override
    public void infect(Entity e){
        /*
            TODO: When dealing damage, add a chance to infect the Entity
            Add a counter of x amount of turns until the Entity is completely
            infected and dies.
        */
    }

    @Override 
    public String get_enemy_type(){
        return "Zombie";
    }
}

class fire_zombie extends Zombie implements Ifire_type{
    public fire_zombie(String name, String status, String affinity, int diff_mult){
        super((diff_mult * 80), name, status, (diff_mult * 35), affinity, diff_mult);
    }

    @Override 
    public void burning(Entity e){
        e.take_damage(6);
        System.out.println("Fire Zombie burn damage " + get_damage());
    }

    @Override 
    public void attack(Entity e){
        super.attack(e);

        Random r = new Random();

        if(r.nextDouble() > .6){
            System.out.println("Fire zombie burn attack successful!");
            burning(e);
        }
    }

    @Override 
    public String get_enemy_type(){
        return "Fire Zombie";
    }
}