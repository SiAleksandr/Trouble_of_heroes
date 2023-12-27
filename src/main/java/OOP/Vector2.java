package OOP;
public class Vector2 {
    int posX;
    int posY;
    public Vector2(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }
    public float rangeEnemy(Vector2 place) {
        double distance = Math.sqrt(Math.pow(place.posY - posY, 2) + Math.pow(place.posX - posX, 2));
        return (float)distance;
    }
}
