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