package rules.cases;

import items.Consummable;
import items.consummables.Elixir;
import items.defensives.Philtre;
import items.defensives.Shield;
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

    public void getLoot(){
       int randomLoot = rand.nextInt(100)+1;
       if (randomLoot < 50) {
           findPotion();
       } else if (randomLoot < 80) {
           findOffensiveItem();
       } else {
           findDefensiveItem();
       }
    }
    public Consummable findPotion(){
        int randomPotion = rand.nextInt(2);
        if (randomPotion == 0) {
            System.out.println("Tu as trouvé une potion de soin.");
            return new Potion();
        } else {
            System.out.println("Tu as trouvé un élixir.");
            return new Elixir();
        }
    }
    public void findOffensiveItem(){
        int randomOffensiveItem = rand.nextInt(2);
        if (randomOffensiveItem == 0) {
            findWeapon();
        } else {
           findSpell();
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
            result =  new Sword();
        } else {
            System.out.println("Tu as trouvé une masse.");
            result = new Mace();
        }
        return result;
    }

    public void findDefensiveItem(){
        int randomDefensiveItem = rand.nextInt(2);
        if (randomDefensiveItem == 0) {
            findShield();
        } else {
            findPhiltre();
        }
    }

    private Philtre findPhiltre() {
        Philtre result;
        int randomPhiltre = rand.nextInt(2);
        if (randomPhiltre == 0) {
            System.out.println("Tu as trouvé un philtre explosif.");
            result = new Philtre();
        } else {
            System.out.println("Tu as trouvé un philtre de soin.");
            result = new Philtre();
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
}
