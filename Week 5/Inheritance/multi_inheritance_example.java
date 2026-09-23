class wolf{
    public void run(){

    }

    // A class can inherit from multiple classes at different
    // levels/tiers.
    @Override
    public boolean equal(){

    }
}

class human{
    public void run(){

    }
}

// It is not possible to have a child class
// inheriting from multiple parents, it can
// only inherit from one parent.
class werewolf extends wolf{
    
}

class multi_inheritance_example{
    public static void main(String[] args){
        werewolf w1 = new werewolf();

        // If werewolf was inheriting from both wolf and humans classes
        // which run method should it execute.
        w1.run();
        w1.equal();
    }
}