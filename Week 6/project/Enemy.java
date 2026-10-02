interface Irider_type{
    public int charge(Entity e);
}

interface Ifire_type{
    public void burning(Entity e);
}

interface Iinfected_type{
    public void infect(Entity e);
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