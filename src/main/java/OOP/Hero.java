package OOP;

import java.util.ArrayList;

public abstract class Hero {
    protected int health, healthMax, armor, maxActions;
    protected int[] damage;
    protected String nameHero;
    protected String heroType;
    protected Vector2 position;
    public Hero(int health, int healthMax, int armor, int maxActions, int[] damage, String nameHero,
                String heroType, int posX, int posY) {
        this.health = health;
        this.healthMax = healthMax;
        this.armor = armor;
        this.maxActions = maxActions;
        this.damage = damage;
        this.nameHero = nameHero;
        this.heroType = heroType;
        this.position = new Vector2(posX, posY);
    }
    public void showDistances(ArrayList <Hero> enemies) {
        enemies.forEach(n -> System.out.print(position.rangeEnemy(n.position) + ", "));
        System.out.println();
    }
}
