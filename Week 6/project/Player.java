class Player extends Entity{
    private String equipment;

    public Player(String name, String equipment){
        super(100, name, "Normal", 5);
        this.equipment = equipment;
    }

    @Override 
    public void attack(Entity e){
        e.take_damage(get_damage());
        System.out.println("Player dealt " + get_damage() + " to " + ((Enemy)e).get_enemy_type()); 
        // In the order of precedence, Function calls are evaluate before casting. Since the `get_enemy_type()` function
        // exist within the Enemy and sub-enemies types, we have to cast `e` first (with parentheses) into an Enemy type before
        // we call the function (which does not exists at Entity). 
    }

    @Override 
    public String toString(){
        return "Player" + super.toString();
    }
}