public class Character {
    private String name;
    private Job job;

    public Character(Job job) {
        this("Someone", job);
    }
    public Character(String name, Job job) {
        this.name = name;
        this.job = job;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
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

}