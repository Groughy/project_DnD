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
    public Job(String name, int lifePoints, int attackPoints) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.attackPoints = attackPoints;
        this.weapon = new Weapon("beginningWeapon",0,name);
    }
    public Job getJobByName(String name) {
        if (name.equals("Warrior")) {
            return new Job("Warrior", 10, 10);
        } else if (name.equals("Mage")) {
            return new Job("Mage", 6, 15);
        } else {
            throw new IllegalArgumentException("Invalid job name");
        }
    }
}
