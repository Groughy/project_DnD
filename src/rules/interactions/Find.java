package rules.interactions;

import characters.Job;

public interface Find {
    void findPotion(Job character);

    void findOffensiveItem(Job character);

    void findWeapon(Job character);

    void findShield(Job character);

    void findSpell(Job character);

    void findDefensiveItem(Job character);

    void findPhiltre(Job character);
}
