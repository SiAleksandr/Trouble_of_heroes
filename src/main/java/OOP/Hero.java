package OOP;

public class Hero {
    protected int health, healthMax, armor, maxActions;
    protected int[] damage;
    protected String nameHero;
    public Hero(int health, int healthMax, int armor, int maxActions, int[] damage, String nameHero) {
        this.health = health;
        this.healthMax = healthMax;
        this.armor = armor;
        this.maxActions = maxActions;
        this.damage = damage;
        this.nameHero = nameHero;
    }
}
