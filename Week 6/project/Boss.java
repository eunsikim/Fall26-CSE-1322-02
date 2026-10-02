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