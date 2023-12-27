package OOP;

public class Wizard extends Hero {
    public Wizard(String nameHero) {
        super(
                50,
                50,
                1,
                1,
                new int[]{-35, -30},
                nameHero);
    }
    protected int maxPower = 75;
    protected int power = 75;
    protected int recovery = 35;
    @Override
    public String toString() {
        return("Колдун " + nameHero);
    }
}
