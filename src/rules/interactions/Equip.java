package rules.interactions;

import characters.Job;
import characters.jobs.Mage;
import characters.jobs.Warrior;
import items.Consummable;
import items.defensives.Philtre;
import items.defensives.Shield;
import items.offensives.Spell;
import items.offensives.Weapon;
import rules.Case;

public interface Equip extends Case {
    default void equipWeapon(Job character, Weapon item) {
        try {
            if (character instanceof Warrior) {
                try {
                    if (character.getAttackPoints() < (character.getAttackPoints()+item.getDamage())) {
                        character.setAttackPoints(character.getAttackPoints() + item.getDamage());
                        System.out.println("Tu t'équipes de " + item.getName() + " et gagne " + item.getDamage() + " points d'attaque.");
                    }
                } catch (Exception e) {
                    notInterestedStuff();
                }
            }
        } catch (Exception e) {
        cantEquipIt();
        }
    }
    default void equip(Job character, Shield item) {
        try {
            if (character instanceof Warrior) {
                try {
                    if (character.getDefensePoints() < item.getDefensePoints()) {
                        character.setDefensePoints(character.getDefensePoints() + item.getDefensePoints());
                        System.out.println("Tu t'équipes de " + item.getName() + " et gagne " + item.getDefensePoints() + " points de défense.");
                    }
                } catch (Exception e) {
                    notInterestedStuff();
                }
            }
        } catch (Exception e) {
            cantEquipIt();
        }
    }
    default void castSpell(Job character, Spell item) {
        try {
            if (character instanceof Mage) {
                try {
                    if (character.getAttackPoints() < (character.getAttackPoints()+item.getDamage())) {
                        character.setAttackPoints(character.getAttackPoints() + item.getDamage());
                        System.out.println("Tu lances le sort " + item.getName() + " et gagne " + item.getDamage() + " points d'attaque.");
                    }
                } catch (Exception e) {
                    notInterestedStuff();
                }
            }
        } catch (Exception e) {
            cantEquipIt();
        }
    }

    default void drinkPotion(Job character, Consummable consummable) {
        character.setLifePoints(character.getLifePoints() + consummable.getEffect());
        System.out.println("Tu as bu " + consummable.getName() + " et gagne " + consummable.getEffect() + " points de vie.");
    }

    default void usePhiltre(Job character, Philtre item) {
        try {
            if (character instanceof Mage) {
                try {
                    if (character.getDefensePoints() < item.getDefensePoints()) {
                        character.setDefensePoints(character.getAttackPoints() + item.getDefensePoints());
                        System.out.println("Tu t'équipes de " + item.getName() + " et gagne " + item.getDefensePoints() + " points de défense.");
                    }
                } catch (Exception e) {
                    notInterestedStuff();
                }
            }
        } catch (Exception e) {
            cantEquipIt();
        }
    }
    private static void cantEquipIt() {
        System.out.println("Tu ne peux pas équiper cet objet.");
    }

    private static void notInterestedStuff() {
        System.out.println("Ton équipement est meilleur, tu le laisses par terre.");
    }
}
