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