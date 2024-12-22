public class Skeleton extends Boss {
    private int arrows;

    public Skeleton(int damage, String name, int health, Weapon weapon, int arrows) {
        super(damage, name, health, weapon);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Arrows: " + arrows);
    }


}
