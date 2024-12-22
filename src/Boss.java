public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Boss(int damage, String name, int health, Weapon weapon) {
        super(damage, name, health);
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("Boss HP: " + this.getHealth() + "|" + "Boss Name: " + this.getName() + "|" +
                "Boss damage: " + this.getDamage() + "|" + "Boss Weapon: "
                + this.getWeapon().getWeaponType() + "|" +
                "Boss Weapon Name: " + this.getWeapon().getWeaponName());

    }
}
