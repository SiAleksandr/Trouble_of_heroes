package OOP;

public class Monk extends Hero {
    public Monk(String nameHero, int posX, int posy) {
        super(
                50,
                50,
                1,
                1,
                new int[]{-35, -30},
                nameHero,
                "Monk",
                posX,
                posy);
                maxPower = 75;
                power = 75;
                recovery = 35;
                this.position = new Vector2(posX, posy);

    }
    protected String heroType;

    protected int maxPower;
    protected int power;
    protected int recovery;
    protected Vector2 position;


    @Override
    public String toString() {
        return("Монах " + nameHero);
    }
}
