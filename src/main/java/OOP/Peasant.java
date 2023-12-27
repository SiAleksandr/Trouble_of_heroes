package OOP;

public class Peasant extends Hero {
    public Peasant(String nameHero) {
        super(
                100,
                100,
                0,
                2,
                new int[]{0, 0},
                nameHero);
    }
    protected int helpingSet = 1;
    protected int totalAmount = 30;
    @Override
    public String toString() {
        return("Крестьянин " + nameHero);
    }
}
