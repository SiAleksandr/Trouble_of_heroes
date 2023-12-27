package OOP;

public class Pikeman extends Hero {
    public Pikeman(String nameHero, int posX, int posY) {
        super(
                100,
                100,
                5,
                4,
                new int[]{20, 30},
                nameHero,
                "Pikeman",
                posX,
                posY);
                stepsCount = 4;
                maxStrikes = 2;
                this.position = new Vector2(posX, posY);
    }

    protected int stepsCount;
    protected int maxStrikes;
    protected Vector2 position;

    @Override
    public String toString() {
        return("Копейщик " + nameHero);
    }
}
