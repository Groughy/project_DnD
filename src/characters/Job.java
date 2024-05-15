package characters;

import characters.jobs.Mage;
import characters.jobs.Warrior;
import exceptions.CantEquipItException;
import exceptions.NotInteresedStuffException;
import items.Consummable;
import items.DefensiveEquipment;
import items.OffensiveEquipment;
import items.defensives.Philtre;
import items.defensives.Shield;
import items.offensives.Spell;
import items.offensives.Weapon;
import rules.interactions.Equip;

public class Job extends Character implements Equip {
    private String nameCharacter;
    private OffensiveEquipment weapon;
    private DefensiveEquipment shield;
    private int defensePoints;

    public DefensiveEquipment getShield() {
        return shield;
    }

    public void setShield(DefensiveEquipment shield) {
        this.shield = shield;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public OffensiveEquipment getWeapon() {
            return weapon;
    }

    public void setWeapon(OffensiveEquipment weapon) {
        this.weapon = weapon;
    }

    public Job() {
        super();
        weapon = new OffensiveEquipment("beginning weapon", 0);
    }

    public String getNameCharacter() {
        return nameCharacter;
    }

    public void setNameCharacter(String nameCharacter) {
        this.nameCharacter = nameCharacter;
    }
    @Override
    public String toString() {
        return nameCharacter + " is a " + getNameCharacter() + " with " + getLifePoints() + " life points, " + getAttackPoints() + " attack points, and is equipped with a " + getWeapon().getName() + ".";
    }

    @Override
    public void usePhiltre(Job character, Philtre item) {
        try {
            if (character instanceof Mage) {
                if (character.getDefensePoints() < (character.getDefaultDefensePoints() + item.getDefensePoints())) {
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

    @Override
    public void drinkPotion(Job character, Consummable consummable) {
        character.setLifePoints(character.getLifePoints() + consummable.getEffect());
        System.out.println("Tu as bu " + consummable.getName() + " et gagne " + consummable.getEffect() + " points de vie.");
    }

    @Override
    public void castSpell(Job character, Spell item) {
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

    @Override
    public void equip(Job character, Shield item) {
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

    @Override
    public void equip(Job character, Weapon item) {
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
}
