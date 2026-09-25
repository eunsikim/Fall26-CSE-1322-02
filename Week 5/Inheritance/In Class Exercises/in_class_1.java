class Entity{
    private double hp;
    private String name;
    private String status;
    private int damage;

    public Entity(double hp, String name, String status, int damage){
        this.hp = hp;
        this.name = name;
        this.status = status;
        this.damage = damage;
    }

    public void attack(){

    }
}

class Player extends Entity{
    private String equipment;

    public Player(double hp, String name, String status, int damage, String equipment){
        super(hp, name, status, damage);
        this.equipment = equipment;
    }
}

class Enemy extends Entity{
    private String affinity;
    private int diff_mult;

    public Enemy(double hp, String name, String status, int damage, String affinity, int diff_mult){
        super(hp, name, status, damage);
        this.affinity = affinity;
        this.diff_mult = diff_mult;
    }
}

class Skeleton extends Enemy{
    public Skeleton(double hp, String name, String status, int damage, String affinity, int diff_mult){
        super(hp, name, status, damage, affinity, diff_mult);
    }
}

class Boss extends Enemy{
    public Boss(double hp, String name, String status, int damage, String affinity, int diff_mult){
        super(hp, name, status, damage, affinity, diff_mult);
    }
}

class Early_Boss extends Boss{
    public Early_Boss(double hp, String name, String status, int damage, String affinity, int diff_mult){
        super(hp, name, status, damage, affinity, diff_mult);
    }
}

class Late_Boss extends Boss{
    public Late_Boss(double hp, String name, String status, int damage, String affinity, int diff_mult){
        super(hp, name, status, damage, affinity, diff_mult);
    }
}