package OOP;

public class Wizard extends Hero {
    public Wizard(String nameHero, int posX, int posY) {
        super(
                50,
                50,
                1,
                1,
                new int[]{-35, -30},
                nameHero,
                "Wizard",
                posX,
                posY);
                maxPower = 75;
                power = 75;
                recovery = 35;
                this.position = new Vector2(posX, posY);

    }
    protected int maxPower;
    protected int power = 75;
    protected int recovery = 35;
    protected Vector2 position;
    @Override
    public String toString() {
        return("Колдун " + nameHero);
    }
}
