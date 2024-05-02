package items.offensive;

import characters.jobs.Warrior;
import items.OffensiveEquipment;

public class Weapon extends OffensiveEquipment {
    public Weapon(String name, int damage, Warrior warrior) {
        super(name, damage, warrior);
    }
}
