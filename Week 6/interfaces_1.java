interface Itest{
    // We cannot have PUBLIC CONCRETE FUNCTIONS
    // Or, We can only have PUBLIC ABSTRACT FUNCTIONS
    public abstract void say_bye(); 
    void say_hello(); // By default, inside an interface functions are public and abstract

    // NO CONSTRUCTORS, therefore, no instances/objects
    public Itest(){

    }

    // Every attribute in an interface, by default,
    // will be PUBLIC, STATIC, and FINAL
    public static final int x = 10; // You can specify these modifiers
    int y = 11; // But java will define the modifiers by default
}

interface Ifire_type{
    public double burning();
}

interface Iundead_type{
    public void regen();
}

interface Imounted{
    public void ride_horse();
}

abstract class zombie implements Iundead_type{
    public double hp;

}

class fire_zombie extends zombie implements Ifire_type{
    @Override 
    public double burning(){
        return 4.5;
    }
    @Override 
    public void regen(){
        hp += 0.1;
    }
}

class normal_zombie extends zombie{
    @Override 
    public void regen(){
        hp += 0.05;
    }
}

abstract class skeleton implements Iundead_type{

}

class fire_skeleton extends skeleton implements Ifire_type{

}
class horse_rider_fire_skeleton extends skeleton implements Ifire_type, Imounted{

}

class horse_rider_skeleton extends skeleton implements Imounted{

}

class villager{

}

public class interfaces_1 {
    public static void main(String[] args) {
        
    }
}
