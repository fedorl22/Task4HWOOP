package Weapons;

import java.util.Random;

public class Bow extends Weapon{
    private int range;

    public Bow(int pointOfDamage, int range) {
        super(pointOfDamage);
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    @Override
    public int damage() {
        return new Random().nextInt(pointOfDamage);
    }

    @Override
    public String toString() {
        return "Лук: Максимальная дальность " + range + ", " + "Урон = " + pointOfDamage;
    }
}
