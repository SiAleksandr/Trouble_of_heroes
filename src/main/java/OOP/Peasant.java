package OOP;

public class Peasant extends Hero {
    public Peasant(String nameHero, int posX, int posY) {
        super(
                100,
                100,
                0,
                2,
                new int[]{0, 0},
                nameHero,
                "Peasant",
                posX,
                posY);
                helpingSet = 1;
                totalAmount = 30;
                this.position = new Vector2(posX, posY);
    }
    protected int helpingSet;
    protected int totalAmount;
    protected Vector2 position;
    @Override
    public String toString() {
        return("Крестьянин " + nameHero);
    }
}
