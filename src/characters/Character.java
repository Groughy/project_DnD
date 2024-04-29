package characters;

public class Character {
    private String name;
    private Job job;
    private int lifePoints;
    private int attackPoints;

    public Character(String name, Job job) {
        this.name = name;
        this.job = job;
    }
    public Character() {

    }

    @Override
    public String toString() {
        return name + " is a " + job.getName() + " with " + job.getLifePoints() + " life points, " + job.getAttackPoints() + " attack points, and is equipped with a " + job.getWeapon().getName() + ".";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}