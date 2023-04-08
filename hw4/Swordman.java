import Shields.NoShield;
import Shields.Shield;
import Shields.Shieldable;
import Weapons.Sword;

public class Swordman extends Warrior  implements Shieldable {

    private Shield shield = NoShield.getInstance();

    public Swordman(String name, int hp, Sword sword) {
        super(name, hp, sword);
    }

    public Swordman(String name, int hp, Sword sword, Shield shield){
        this(name, hp, sword);
        this.shield = shield;
    }

    public void setDamage(int value){
        int healthValue = Math.max(0, getHP() - value);
        setHP(healthValue);
        shield.addDamage(value);
        if (armor() <= 0){
            shield = NoShield.getInstance();
        }
    }

    @Override
    public String toString() {
        return String.format("Мечник :%s, hp = %s , Вооружен: %s , Защита: %s", getName(), getHP(), getWeapon(), armor());
    }


    @Override
    public int armor() {
        return shield.getDefence();
    }

    @Override
    public Shield getShield() {
        return shield;
    }

}