package characters;

import items.Weapon;

public class Job {
    private String name;
    private int lifePoints;
    private int attackPoints;
    private Weapon weapon;

    public Weapon getWeapon() {
        if (!weapon.getClassRestriction().equals(this.getName())) {
            throw new IllegalArgumentException("This weapon is not allowed for this class.");
        }
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAttackPoints() {
        return attackPoints;
    }
    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }
    public int getLifePoints() {
        return lifePoints;
    }
    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Job() {
    this.name = "Warrior";
    this.lifePoints = 10;
    this.attackPoints = 10;
    this.weapon = new Weapon("beginning sword",0,"Warrior");
    }
    public Job(String name){
        this.name = name;
        if (name.equals("Warrior")) {
            this.lifePoints = 10;
            this.attackPoints = 10;
            this.weapon = new Weapon("beginning sword",0,"Warrior");
        } else if (name.equals("Mage")) {
            this.lifePoints = 6;
            this.attackPoints = 15;
            this.weapon = new Weapon("beginning staff",0,"Mage");
        } else {
            throw new IllegalArgumentException("Invalid job name");
        }
    }

}
