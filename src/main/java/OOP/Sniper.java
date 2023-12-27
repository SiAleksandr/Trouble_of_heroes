package OOP;

import java.util.ArrayList;

public class Sniper extends Hero {
    public Sniper(String nameHero, int posX, int posY) {
        super(
                75,
                75,
                2,
                2,
                new int[]{10, 15},
                nameHero,
                "Sniper",
                posX,
                posY);
        maxAmmunition = 5;
        ammunition = 5;
        shootCount = 2;
        this.position = new Vector2(posX, posY);

    }

    protected int maxAmmunition;
    protected int ammunition;
    protected int shootCount;
    protected Vector2 position;
    public int getNearestB(ArrayList<Hero> enemies) {
        int nearestIndex = 0;
        for (int i = 0; i < enemies.size(); i++) {
            if (position.rangeEnemy(enemies.get(i).position) < position.rangeEnemy(enemies.get(nearestIndex).position)) {
                nearestIndex = i;
            }
        }
        return nearestIndex;
    }
    @Override
    public String toString() {
        return ("Снайпер " + nameHero);
    }
}
