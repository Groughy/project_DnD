package characters;

import items.OffensiveEquipment;

public class Job extends Character{
    private String name;
    private OffensiveEquipment weapon;

    public OffensiveEquipment getWeapon() {
        if (!weapon.getClassRestriction().equals(this.getName())) {
            throw new IllegalArgumentException("This weapon is not allowed for this class.");
        }
        return weapon;
    }

    public void setWeapon(OffensiveEquipment weapon) {
        this.weapon = weapon;
    }

    public Job() {
        super();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
