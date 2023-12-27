package OOP;

import java.util.ArrayList;

public class Crossbower extends Hero {
    public Crossbower(String nameHero, int posX, int posy) {
        super(
                75,
                75,
                2,
                2,
                new int[]{10, 15},
                nameHero,
                "Crossbower",
                posX,
                posy);
                maxAmmunition = 5;
                ammunition = 5;
                shootCount = 2;
                this.position = new Vector2(posX, posy);
    }
    protected int maxAmmunition;
    protected int ammunition;
    protected int shootCount;
    protected Vector2 position;
    public int getNearestW(ArrayList<Hero> enemies) {
        int nearestIndex = 0;
        for(int i = 0; i < enemies.size(); i++) {
            if (position.rangeEnemy(enemies.get(i).position) < position.rangeEnemy(enemies.get(nearestIndex).position)) {
                nearestIndex = i;
            }
        }
        return nearestIndex;
    }



    @Override
    public String toString() {
        return ("Арбалетчик " + nameHero);
    }
}
