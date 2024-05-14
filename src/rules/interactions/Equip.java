package rules.interactions;

import characters.Job;
import characters.jobs.Mage;
import characters.jobs.Warrior;
import exceptions.CantEquipItException;
import exceptions.NotInteresedStuffException;
import items.Consummable;
import items.defensives.Philtre;
import items.defensives.Shield;
import items.offensives.Spell;
import items.offensives.Weapon;
import rules.Case;

public interface Equip extends Case {
    default void equipWeapon(Job character, Weapon item) throws CantEquipItException {
        try {
            if (character instanceof Warrior) {
                try {
                    if (character.getAttackPoints() < (character.getAttackPoints()+item.getDamage())) {
                        character.setAttackPoints(character.getAttackPoints() + item.getDamage());
                        System.out.println("Tu t'équipes de " + item.getName() + " et gagne " + item.getDamage() + " points d'attaque.");
                    }
                    else {
                        throw new NotInteresedStuffException();
                    }
                } catch (Exception e) {
                    throw new NotInteresedStuffException();
                }
            }
            else {
                throw new CantEquipItException();
            }
        } catch (Exception e) {
        throw new CantEquipItException();
        }
    }
    default void equip(Job character, Shield item) throws CantEquipItException {
        try {
            if (character instanceof Warrior) {
                try {
                    if (character.getDefensePoints() < item.getDefensePoints()) {
                        character.setDefensePoints(character.getDefensePoints() + item.getDefensePoints());
                        System.out.println("Tu t'équipes de " + item.getName() + " et gagne " + item.getDefensePoints() + " points de défense.");
                    }
                    else {
                        throw new NotInteresedStuffException();
                    }
                } catch (Exception e) {
                   throw new NotInteresedStuffException();
                }
            }
            else {
                throw new CantEquipItException();
            }
        } catch (Exception e) {
            throw new CantEquipItException();
        }
    }
    default void castSpell(Job character, Spell item) throws CantEquipItException {
        try {
            if (character instanceof Mage) {
                try {
                    if (character.getAttackPoints() < (character.getAttackPoints()+item.getDamage())) {
                        character.setAttackPoints(character.getAttackPoints() + item.getDamage());
                        System.out.println("Tu lances le sort " + item.getName() + " et gagne " + item.getDamage() + " points d'attaque.");
                    }
                    else {
                        throw new NotInteresedStuffException();
                    }
                } catch (Exception e) {
                   throw new NotInteresedStuffException();
                }
            }
            else {
                throw new CantEquipItException();
            }
        } catch (Exception e) {
            throw new CantEquipItException();
        }
    }
    default void drinkPotion(Job character, Consummable consummable) {
        character.setLifePoints(character.getLifePoints() + consummable.getEffect());
        System.out.println("Tu as bu " + consummable.getName() + " et gagne " + consummable.getEffect() + " points de vie.");
    }
    default void usePhiltre(Job character, Philtre item) throws CantEquipItException {
        try {
            if (character instanceof Mage) {
                try {
                    if (character.getDefensePoints() < item.getDefensePoints()) {
                        character.setDefensePoints(character.getAttackPoints() + item.getDefensePoints());
                        System.out.println("Tu t'équipes de " + item.getName() + " et gagne " + item.getDefensePoints() + " points de défense.");
                    }
                    else {
                        throw new NotInteresedStuffException();
                    }
                } catch (Exception e) {
                    throw new NotInteresedStuffException();
                }
            }
            else {
                throw new CantEquipItException();
            }
        } catch (Exception e) {
            throw new CantEquipItException();
        }
    }
}
