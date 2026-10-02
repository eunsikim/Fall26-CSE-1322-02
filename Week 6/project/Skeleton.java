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