public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.BAZOOKA, "Вид Оружия");
        Boss boss = new Boss(70, "MegaBoss", 500, bossWeapon);
        boss.printInfo();

        Weapon skeletonWeapon1 = new Weapon(WeaponType.ROCKET, "Bone ROCKET");
        Skeleton skeleton1 = new Skeleton(25, "Skeleton Archer", 200, skeletonWeapon1, 5);
        skeleton1.printInfo();
        Weapon skeletonWeapon2 = new Weapon(WeaponType.LASER, "Shadow LASER");
        Skeleton skeleton2 = new Skeleton(30, "Shadow Skeleton", 180, skeletonWeapon2, 10);
        skeleton2.printInfo();
    }
}
