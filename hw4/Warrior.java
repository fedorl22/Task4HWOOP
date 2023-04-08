import Weapons.Weaponable;

public abstract class Warrior {
    private String name;
    private int hp;
    private Weaponable weapon;
    
    public Warrior(String name, int hp, Weaponable weapon) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
    }
    
    public String getName() {
        return name;
    }
    public int getHP() {
        return hp;
    }
    public Weaponable getWeapon() {
        return weapon;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("")
                .append(this.getName())
                .append(String.format(",  Hp : %d ", getHP()))
                .append(String.format(", Вооружен: %s ", this.weapon));
        return res.toString();
    }
}

