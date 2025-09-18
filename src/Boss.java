public class Boss extends GameEntity {
    private WeaponType weapon;

    public Boss(int health, int damage, String name, WeaponType weapon) {
        super(health, damage, name);
        this.weapon = weapon;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println(getName() + "Stats: " + getDamage() + " "
                + getHealth() + " " + getWeapon());
    }
}
