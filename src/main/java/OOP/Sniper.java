package OOP;

public class Sniper extends Hero {
    public Sniper(String nameHero) {
        super(
                75,
                75,
                2,
                2,
                new int[]{10, 15},
                nameHero);
    }
    protected int maxAmmunition = 5;
    protected int ammunition = 5;
    protected int shootCount = 2;
    @Override
    public String toString() {
        return("Снайпер " + nameHero);
    }
}
