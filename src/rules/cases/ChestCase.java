package rules.cases;

import characters.Job;
import items.Consummable;
import items.Item;
import items.consummables.Elixir;
import items.defensives.Philtre;
import items.defensives.Shield;
import items.defensives.philtres.ExplosivePhiltre;
import items.defensives.philtres.HealingPhiltre;
import items.defensives.shields.Bulwark;
import items.defensives.shields.Roundache;
import items.offensives.Spell;
import items.offensives.Weapon;
import items.offensives.spells.FireBall;
import items.offensives.spells.ThunderBolt;
import items.offensives.weapons.Mace;
import items.offensives.weapons.Sword;
import rules.Case;
import items.consummables.Potion;

public class ChestCase implements Case {


    public ChestCase() {
        getLoot();
    }

    public Item getLoot() {
        int randomLoot = rand.nextInt(100) + 1;
        if (randomLoot < 50) {
            return findPotion();
        } else if (randomLoot < 80) {
            return findOffensiveItem();
        } else {
            return findDefensiveItem();
        }
    }

    public Consummable findPotion() {
        int randomPotion = rand.nextInt(2);
        if (randomPotion == 0) {
            System.out.println("Tu as trouvé une potion de soin.");
            return new Potion();
        } else {
            System.out.println("Tu as trouvé un élixir.");
            return new Elixir();
        }
    }

    public Item findOffensiveItem() {
        int randomOffensiveItem = rand.nextInt(2);
        if (randomOffensiveItem == 0) {
            return findWeapon();
        } else {
            return findSpell();
        }
    }

    public Spell findSpell() {
        Spell result;
        int randomSpell = rand.nextInt(2);
        if (randomSpell == 0) {
            System.out.println("Tu as trouvé un sort de boule de feu.");
            result = new FireBall();
        } else {
            System.out.println("Tu as trouvé un sort de foudre.");
            result = new ThunderBolt();
        }
        return result;
    }

    public Weapon findWeapon() {
        Weapon result;
        int randomWeapon = rand.nextInt(2);
        if (randomWeapon == 0) {
            System.out.println("Tu as trouvé une épée.");
            result = new Sword();
        } else {
            System.out.println("Tu as trouvé une masse.");
            result = new Mace();
        }
        return result;
    }

    public Item findDefensiveItem() {
        int randomDefensiveItem = rand.nextInt(2);
        if (randomDefensiveItem == 0) {
            return findShield();
        } else {
            return findPhiltre();
        }

    }

    private Philtre findPhiltre() {
        Philtre result;
        int randomPhiltre = rand.nextInt(2);
        if (randomPhiltre == 0) {
            System.out.println("Tu as trouvé un philtre explosif.");
            result = new ExplosivePhiltre();
        } else {
            System.out.println("Tu as trouvé un philtre de soin.");
            result = new HealingPhiltre();
        }
        return result;
    }

    private Shield findShield() {
        Shield result;
        int randomShield = rand.nextInt(2);
        if (randomShield == 0) {
            System.out.println("Tu as trouvé un pavois.");
            result = new Bulwark();
        } else {
            System.out.println("Tu as trouvé une rondache.");
            result = new Roundache();
        }
        return result;
    }

    @Override
    public String toString() {
        return "ChestCase";
    }

    public void useItem(Job character) {
        Item item = getLoot();
        if (item instanceof Consummable) {
            ((Consummable) item).drinkPotion(character, (Consummable) item);
        }
        else if(item instanceof Spell) {
            ((Spell) item).castSpell(character, (Spell) item);
        }
        else if(item instanceof Weapon) {
            ((Weapon) item).equipWeapon(character, (Weapon) item);
        }
        else if(item instanceof Shield) {
            ((Shield) item).equip(character, (Shield) item);
        }
        else if(item instanceof Philtre) {
            ((Philtre) item).usePhiltre(character, (Philtre) item);
        }
    }
}
