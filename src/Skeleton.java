public class Skeleton extends Boss {
    private int arrowNumber;

    public Skeleton(int health, int damage, String name, WeaponType weapon, int arrowNumber) {
        super(health, damage, name, weapon);
        this.arrowNumber = arrowNumber;
    }

    public int getArrowNumber() {
        return arrowNumber;
    }

    public void setArrowNumber(int arrowNumber) {
        this.arrowNumber = arrowNumber;
    }

    @Override
    public void printInfo() {
        System.out.println(getName() + "Stats: " + getDamage() + " "
                + getHealth() + " " + getWeapon() + " " + getArrowNumber());
    }
}
