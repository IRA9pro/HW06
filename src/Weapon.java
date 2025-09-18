public class Weapon {
    WeaponType weaponType;
    String weapon;

    public Weapon(WeaponType weaponType, String weapon) {
        this.weaponType = weaponType;
        this.weapon = weapon;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
