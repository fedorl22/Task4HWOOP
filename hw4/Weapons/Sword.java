package Weapons;
import java.util.Random;

public class Sword extends Weapon {

    public Sword(int pointOfDamage) {
        super(pointOfDamage);
    }

    @Override
    public String toString() {
        return String.format("Урон мечом = %d", pointOfDamage);
    }

    @Override
    public int damage() {
        return new Random().nextInt(pointOfDamage);
    }

}
