package characters;

import items.OffensiveEquipment;
import rules.Menu;

public class Job extends Character{
    private String name;
    private OffensiveEquipment weapon;
    private Menu menu;

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
        weapon = new OffensiveEquipment("beginning weapon", 0);
    }
    public Job(Menu menu){
        super();
        this.menu = menu;
        weapon = new OffensiveEquipment("beginning weapon", 0);
    }

    public String getName() {
        return name;
    }

    public Job createCharacter() {
       return menu.getJobByName();

    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name + " is a " + getName() + " with " + getLifePoints() + " life points, " + getAttackPoints() + " attack points, and is equipped with a " + getWeapon().getName() + ".";
    }
}
