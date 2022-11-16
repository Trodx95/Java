public class Bat extends Mammal {
    public Bat(int energyLevel) {
        super(energyLevel);
    }
}

public int Fly() {
    energyLevel -=50;
    System.out.println("Bat is flying!");
    return energyLevel;
}

public int eatHuman() {
    this energyLevel +=25;
    System.out.println("The bat is eatting Humans !");
    return energyLevel;
}    

public int attackTown() {
    energyLevel -=100;
    System.out.println ("OMG BATS ARE ATTACKING !");
    return energyLevel;
}
