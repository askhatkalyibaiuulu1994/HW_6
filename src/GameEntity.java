public class GameEntity {
    int health;
    String name;
    int damage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameEntity(int damage, String name, int health) {
        this.damage = damage;
        this.name = name;
        this.health = health;
    }
}
