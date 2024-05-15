package rules.interactions;

import characters.Job;
import items.Consummable;
import items.defensives.Philtre;
import items.defensives.Shield;
import items.offensives.Spell;
import items.offensives.Weapon;

public interface Equip {
    void equip(Job character, Weapon item);

    void equip(Job character, Shield item);

    void castSpell(Job character, Spell item);

    void drinkPotion(Job character, Consummable consummable);

    void usePhiltre(Job character, Philtre item);
}