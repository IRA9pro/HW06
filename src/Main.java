public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(700, 50, "Boss", WeaponType.MAGIC);


        Skeleton skeleton = new Skeleton(600, 40,
                "Skeleton", WeaponType.BOW, 6);
        Skeleton wither = new Skeleton(1000, 100,
                "Wither", WeaponType.BOW, 20);

        skeleton.printInfo();
        wither.printInfo();
    }
}
