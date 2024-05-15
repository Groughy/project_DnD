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
    default void equip(Job character, Weapon item) {
        try {
            if (character instanceof Warrior) {
                if (character.getAttackPoints() < (character.getDefaultAttackPoints() + item.getDamage())) {
                    character.setAttackPoints(item.getDamage());
                    System.out.println("Tu t'équipes de " + item.getName() + " et gagne " + item.getDamage() + " points d'attaque.");
                } else {
                    throw new NotInteresedStuffException();
                }
            } else {
                throw new CantEquipItException();
            }
        } catch (NotInteresedStuffException e) {
            System.out.println("Tu as déjà un équipement plus puissant.");
        } catch (CantEquipItException e) {
            System.out.println("Tu ne peux pas t'équiper de cet équipement.");
        }
    }

    default void equip(Job character, Shield item) {
        try {
            if (character instanceof Warrior) {
                if (character.getDefensePoints() < (character.getDefaultDefensePoints()+item.getDefensePoints())) {
                    character.setDefensePoints(character.getDefensePoints() + item.getDefensePoints());
                    System.out.println("Tu t'équipes de " + item.getName() + " et gagne " + item.getDefensePoints() + " points de défense.");
                } else {
                    throw new NotInteresedStuffException();
                }
            } else {
                throw new CantEquipItException();
            }
        } catch (NotInteresedStuffException e) {
            System.out.println("Tu as déjà un équipement plus puissant.");
        } catch (CantEquipItException e) {
            System.out.println("Tu ne peux pas t'équiper de cet équipement.");
        }
    }

    default void castSpell(Job character, Spell item)  {
        try {
            if (character instanceof Mage) {
                if (character.getAttackPoints() < (character.getDefaultAttackPoints() + item.getDamage())) {
                    character.setAttackPoints(character.getAttackPoints() + item.getDamage());
                    System.out.println("Tu lances le sort " + item.getName() + " et gagne " + item.getDamage() + " points d'attaque.");
                } else {
                    throw new NotInteresedStuffException();
                }
            } else {
                throw new CantEquipItException();
            }
        } catch (NotInteresedStuffException e) {
            System.out.println("Tu as déjà un équipement plus puissant.");
        } catch (CantEquipItException e) {
            System.out.println("Tu ne peux pas t'équiper de cet équipement.");
        }
    }

    default void drinkPotion(Job character, Consummable consummable) {
        character.setLifePoints(character.getLifePoints() + consummable.getEffect());
        System.out.println("Tu as bu " + consummable.getName() + " et gagne " + consummable.getEffect() + " points de vie.");
    }

    default void usePhiltre(Job character, Philtre item) {
        try {
            if (character instanceof Mage) {
                if (character.getDefensePoints() < (character.getDefaultDefensePoints()+item.getDefensePoints())) {
                    character.setDefensePoints(character.getAttackPoints() + item.getDefensePoints());
                    System.out.println("Tu t'équipes de " + item.getName() + " et gagne " + item.getDefensePoints() + " points de défense.");
                } else {
                    throw new NotInteresedStuffException();
                }
            } else {
                throw new CantEquipItException();
            }
        } catch (NotInteresedStuffException e) {
            System.out.println("Tu as déjà un équipement plus puissant.");
        } catch (CantEquipItException e) {
            System.out.println("Tu ne peux pas t'équiper de cet équipement.");
        }
    }
}
