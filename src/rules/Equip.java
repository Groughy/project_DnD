package rules;

import characters.Job;
import characters.jobs.Mage;
import characters.jobs.Warrior;
import items.defensives.Philtre;
import items.defensives.Shield;
import items.offensives.Spell;
import items.offensives.Weapon;

public interface Equip extends Case{
    default void equipWeapon(Job character, Weapon item) {
        try {
            if (character instanceof Warrior) {
                try {
                    if (character.getAttackPoints() < item.getDamage()) {
                        character.setAttackPoints(character.getAttackPoints() + item.getDamage());
                        System.out.println("You equip " + item.getName() + " and gain " + item.getDamage() + " attack points.");
                    }
                } catch (Exception e) {
                    System.out.println("Your equipment is better, you let this down.");
                }
            }
        } catch (Exception e) {
            System.out.println("You can't equip this item.");
        }
    }
    default void equip(Job character, Shield item) {
        try {
            if (character instanceof Warrior) {
                try {
                    if (character.getDefensePoints() < item.getDefensePoints()) {
                        character.setDefensePoints(character.getDefensePoints() + item.getDefensePoints());
                        System.out.println("You equip " + item.getName() + " and gain " + item.getDefensePoints() + " defense points.");
                    }
                } catch (Exception e) {
                    System.out.println("Your equipment is better, you let this down.");
                }
            }
        } catch (Exception e) {
            System.out.println("You can't equip this item.");
        }
    }
    default void castSpell(Job character, Spell item) {
        try {
            if (character instanceof Mage) {
                try {
                    if (character.getAttackPoints() < item.getDamage()) {
                        character.setAttackPoints(character.getAttackPoints() + item.getDamage());
                        System.out.println("You cast " + item.getName() + " and gain " + item.getDamage() + " attack points.");
                    }
                } catch (Exception e) {
                    System.out.println("Your equipment is better, you let this down.");
                }
            }
        } catch (Exception e) {
            System.out.println("You can't cast this spell.");
        }
    }
    default void usePhiltre(Job character, Philtre item) {
        try {
            if (character instanceof Mage) {
                try {
                    if (character.getDefensePoints() < item.getDefensePoints()) {
                        character.setDefensePoints(character.getAttackPoints() + item.getDefensePoints());
                        System.out.println("You equip " + item.getName() + " and gain " + item.getDefensePoints() + " defense points.");
                    }
                } catch (Exception e) {
                    System.out.println("Your equipment is better, you let this down.");
                }
            }
        } catch (Exception e) {
            System.out.println("You can't equip this philtre.");
        }
    }
}
