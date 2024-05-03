package items.offensives;

import characters.Job;
import characters.jobs.Warrior;
import items.OffensiveEquipment;

public class Weapon extends OffensiveEquipment {
    private Warrior warrior;

    public Weapon(String beginningSword, int i, Warrior warrior) {
        super(beginningSword, i, warrior);
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public Weapon() {
        super();
    }

    public void equipWeapon(Job character, Weapon item) {
        character.setAttackPoints(character.getAttackPoints() + item.getDamage());
    }
}
