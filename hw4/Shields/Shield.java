package Shields;

public abstract class Shield{

    public int defence;

    public Shield(int defence) {
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }



    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void addDamage(int damage) {
        defence = Math.max(defence - damage, 0);
    }
}
