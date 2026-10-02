import java.util.Random;

abstract class Skeleton extends Enemy{
    public Skeleton(double hp, String name, String status, int damage, String affinity, int diff_mult){
        super(hp, name, status, damage, affinity, diff_mult);
    }

    @Override 
    public void attack(Entity e){
        e.take_damage(get_damage());
        System.out.println("Skeleton dealt " + get_damage());
    }

    @Override 
    public String toString(){
        return "Skeleton" + super.toString();
    }
}

class reg_skeleton extends Skeleton{
    public reg_skeleton(String name, String status, String affinity, int diff_mult){
        super((diff_mult * 50), name, status,(diff_mult * 10), affinity, diff_mult);
    }

    @Override 
    public String get_enemy_type(){
        return "Skeleton";
    }
}

class fire_skeleton extends Skeleton implements Ifire_type{
    public fire_skeleton(String name, String status, String affinity, int diff_mult){
        super((diff_mult * 50), name, status,(diff_mult * 10), affinity, diff_mult);
    }

    @Override 
    public void burning(Entity e){
        e.take_damage(3);
        System.out.println("Fire Skeleton burn damage " + get_damage());
    }

    @Override 
    public void attack(Entity e){
        super.attack(e);

        Random r = new Random();

        if(r.nextDouble() > .7){
            System.out.println("Fire skeleton burn attack successful!");
            burning(e);
        }
    }

    @Override 
    public String get_enemy_type(){
        return "Fire Skeleton";
    }
}

class rider_skeleton extends Skeleton implements Irider_type{
    public rider_skeleton(String name, String status, String affinity, int diff_mult){
        super((diff_mult * 70), name, status,(diff_mult * 10), affinity, diff_mult);
    }

    @Override
    public int charge(Entity e){
        Random r = new Random();

        int damage = e.get_damage();

        System.out.println("Rider Skeleton is preparing a charge...");

        if(r.nextDouble() > .5){
            System.out.println("The charge was successful!");
            damage *= (1 + r.nextDouble());
        }
        else{
            System.out.println("The charge failed...");
        }

        return damage;
    }

    @Override 
    public void attack(Entity e){
        int damage = charge(e);

        e.take_damage(damage);
        System.out.println("Rider Skeleton dealt " + get_damage());
    }

    @Override 
    public String get_enemy_type(){
        return "Rider Skeleton";
    }
}