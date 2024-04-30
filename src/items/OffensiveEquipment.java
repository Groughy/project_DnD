package items;

public class OffensiveEquipment extends Item {
    private int damage;
    private String classRestriction;

    public OffensiveEquipment() {

    }

    public OffensiveEquipment(String beginningWeapon, int i) {
        this.setName(beginningWeapon);
        this.damage = i;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setClassRestriction(String classRestriction) {
        this.classRestriction = classRestriction;
    }

    public OffensiveEquipment(String name, int damage, String classRestriction) {
        this.setName(name);
        this.damage = damage;
        this.classRestriction = classRestriction;

    }
    public String getClassRestriction() {
        return classRestriction;
    }
}