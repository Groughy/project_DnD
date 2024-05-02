package items;

import characters.Job;

public class OffensiveEquipment extends Item {
    private int damage;
    private Job classRestriction;

    public OffensiveEquipment(String beginningWeapon, int i) {
        this.setName(beginningWeapon);
        this.damage = i;
    }

    public OffensiveEquipment() {

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setClassRestriction(Job classRestriction) {
        this.classRestriction = classRestriction;
    }

    public OffensiveEquipment(String name, int damage, Job classRestriction) {
        this.setName(name);
        this.damage = damage;
        setClassRestriction(classRestriction);

    }
    public Job getClassRestriction() {
        return classRestriction;
    }
}