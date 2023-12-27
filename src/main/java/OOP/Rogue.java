package OOP;

public class Rogue extends Hero {
    public Rogue(String nameHero) {
        super(
                100,
                100,
                5,
                4,
                new int[]{20, 30},
                nameHero);
    }

    protected int stepsCount = 4;
    protected int maxStrikes = 2;

    @Override
    public String toString() {
        return ("Разбойник " + nameHero);
    }
}
