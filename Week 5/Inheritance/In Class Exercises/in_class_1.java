abstract class Entity{
    private double hp;
    private String name;
    private String status;
    private int damage;

    public Entity(){

    }

    public Entity(double hp, String name, String status, int damage){
        this.hp = hp;
        this.name = name;
        this.status = status;
        this.damage = damage;
    }

    // Abstract functions are just the definition of a function
    // with no implementation
    // Abstract class may have 0 to infinite abstrac functions.
    public abstract void attack(Entity e);

    // Abstraction function can have 0 to infinite concrete
    // functions
    public void talk(){
        System.out.println("Hello");
    }

    public int get_damage(){
        return damage;
    }

    public void take_damage(int damage_dealt){
        hp -= damage_dealt;
    }

    @Override 
    public String toString(){
        return "HP: " + hp;
    }
}

class Player extends Entity{
    private String equipment;

    public Player(String name, String equipment){
        super(100, name, "Normal", 5);
        this.equipment = equipment;
    }

    @Override 
    public void attack(Entity e){
        e.take_damage(get_damage());
        System.out.println("Player dealt " + get_damage());
    }

    @Override 
    public String toString(){
        return "Player" + super.toString();
    }
}

abstract class Enemy extends Entity{
    private String affinity;
    private int diff_mult;

    public Enemy(double hp, String name, String status, int damage, String affinity, int diff_mult){
        super(hp, name, status, damage);
        this.affinity = affinity;
        this.diff_mult = diff_mult;
    }

    public abstract String get_enemy_type();
}

class Skeleton extends Enemy{
    public Skeleton(String name, String status, String affinity, int diff_mult){
        super((50 * diff_mult), name, status, (10 * diff_mult), affinity, diff_mult);
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

    @Override 
    public String get_enemy_type(){
        return "Skeleton";
    }
}

class Zombie extends Enemy{
    public Zombie(double hp, String name, String status, int damage, String affinity, int diff_mult){
        super(hp, name, status, damage, affinity, diff_mult);
    }

    @Override 
    public void attack(Entity e){
        
    }

    @Override 
    public String get_enemy_type(){
        return "Zombie";
    }
}

class Wraith extends Enemy{
    public Wraith(double hp, String name, String status, int damage, String affinity, int diff_mult){
        super(hp, name, status, damage, affinity, diff_mult);
    }

    @Override 
    public void attack(Entity e){
        
    }

    @Override 
    public String get_enemy_type(){
        return "Wraith";
    }
}

abstract class Boss extends Enemy{
    public Boss(double hp, String name, String status, int damage, String affinity, int diff_mult){
        super(hp, name, status, damage, affinity, diff_mult);
    }
}

class Early_Boss extends Boss{
    public Early_Boss(double hp, String name, String status, int damage, String affinity, int diff_mult){
        super(hp, name, status, damage, affinity, diff_mult);
    }

    @Override 
    public void attack(Entity e){
        
    }

    @Override 
    public String get_enemy_type(){
        return "Early Stage Boss";
    }
}

class Late_Boss extends Boss{
    public Late_Boss(double hp, String name, String status, int damage, String affinity, int diff_mult){
        super(hp, name, status, damage, affinity, diff_mult);
    }

    @Override 
    public void attack(Entity e){
        
    }
    
    @Override 
    public String get_enemy_type(){
        return "Late Stage Boss";
    }
}

public class in_class_1{
    public static void main(String[] args){
        Player p1 = new Player("Player1", "Fist");

        Skeleton s1 = new Skeleton("Dave", "Healthy", "Yes", 1);

        // Player and Skeleton Status
        System.out.println(p1);
        System.out.println(s1);
        
        System.out.println();
        
        // Player attacks Skeleton
        p1.attack(s1);
        System.out.println(s1);
        
        System.out.println();
        
        // Skeleton attacks Skeleton
        s1.attack(p1);
        System.out.println(p1);
        
        System.out.println();
        
        // Player and Skeleton Status
        System.out.println(p1);
        System.out.println(s1);
    }
}