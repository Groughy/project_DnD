package rules;

import characters.Job;
import items.consummables.Elixir;
import items.consummables.Potion;
import items.defensives.philtres.ExplosivePhiltre;
import items.defensives.philtres.HealingPhiltre;
import items.defensives.shields.Bulwark;
import items.defensives.shields.Roundache;
import items.offensives.spells.FireBall;
import items.offensives.spells.ThunderBolt;
import items.offensives.weapons.Mace;
import items.offensives.weapons.Sword;

public interface Find extends Case, Equip {
    default void findPotion(Job character) {
        int randomPotion = rand.nextInt(2);
        if (randomPotion == 0) {
            System.out.println("Tu as trouvé une potion de soin.");
            drinkPotion(character, new Potion());
        } else {
            System.out.println("Tu as trouvé un élixir.");
            drinkPotion(character, new Elixir());
        }
    }



    default void findOffensiveItem(Job character) {
        int randomOffensiveItem = rand.nextInt(2);
        if (randomOffensiveItem == 0) {
            findWeapon(character);
        } else {
            findSpell(character);
        }
    }

    default void findWeapon(Job character) {
        int randomWeapon = rand.nextInt(2);
        if (randomWeapon == 0) {
            System.out.println("Tu as trouvé une épée.");
            equipWeapon(character, new Sword());
        } else {
            System.out.println("Tu as trouvé une masse.");
            equipWeapon(character, new Mace());
        }
    }

    default void findShield(Job character) {
        int randomShield = rand.nextInt(2);
        if (randomShield == 0) {
            System.out.println("Tu as trouvé un pavois.");
            equip(character, new Bulwark());
        } else {
            System.out.println("Tu as trouvé une rondache.");
            equip(character, new Roundache());
        }
    }

    default void findSpell(Job character) {
        int randomSpell = rand.nextInt(2);
        if (randomSpell == 0) {
            System.out.println("Tu as trouvé un sort de boule de feu.");
            castSpell(character, new FireBall());
        } else {
            System.out.println("Tu as trouvé un sort de foudre.");
            new ThunderBolt();
        }
    }


    default void findDefensiveItem(Job character) {
        int randomDefensiveItem = rand.nextInt(2);
        if (randomDefensiveItem == 0) {
            findShield(character);
        } else {
            findPhiltre(character);
        }

    }

    default void findPhiltre(Job character) {
        int randomPhiltre = rand.nextInt(2);
        if (randomPhiltre == 0) {
            System.out.println("Tu as trouvé un philtre explosif.");
            usePhiltre(character, new ExplosivePhiltre());
        } else {
            System.out.println("Tu as trouvé un philtre de soin.");
            usePhiltre(character, new HealingPhiltre());
        }
    }
}
