class Boss{
    int hp;
    int dmg;

    public Boss(int hp, int dmg){
        this.hp = hp;
        this.dmg = dmg;
    }

    public void attack(){
        System.out.println("Attack");    
    }
}

class Boss_initial extends Boss{
    public Boss_initial(){
        super(100, 10);
    }

    @Override
    public void attack(){
        System.out.println("Regular attack"); 
    }
}

class Boss_late extends Boss{
    public Boss_late(){
        super(50, 20);
    }

    @Override
    public void attack(){
        System.out.println("Hard attack"); 
    }
}

public class poly_1{
    public static void main(String[] args) {
        Boss boss_1 = new Boss_initial();

        boss_1.attack();

        // After some fighing...
        boss_1.hp = 25;

        if(boss_1.hp < 30){
            System.out.println("Cool Boss animation");
            boss_1 = new Boss_late();
        }

        boss_1.attack();
    }
}