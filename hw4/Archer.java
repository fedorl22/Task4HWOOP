import Weapons.*;

public class Archer extends Warrior {

    public Archer(String name, int hp, Bow bow) {
        super(name, hp, bow);
    }

    @Override
    public String toString() {
        return "Лучник : " + super.toString();
    }

    public int shotRange() {
        return ((Bow) getWeapon()).getRange();
    }
    
}