package Shields;

public class Mantelet extends Shield{

    public Mantelet(int defence) {
        super(defence);
    }

    @Override
    public String toString() {
        return "Mantelet{" +
                "Защита=" + defence +
                '}';
    }
}
