import java.util.Scanner;

public class Character {
    private String name;

    private Job job;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character() {
    this.name = "Someone";
    Job job = new Job();
    this.job = job.getJobByName("Warrior");
    }
    public Character(String name) {
        this.name = name;
        Job job = new Job();
        this.job = job.getJobByName("Warrior");
    }
    public Character(String name, Job job) {
        this.name = name;
        this.job = job;
    }
    public Character createCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of your character: ");
        String name = scanner.nextLine();
        return new Character(name, job);
    }

    @Override
    public String toString() {
        return name + " is a " + job.getName() + " with " + job.getLifePoints() + " life points, " + job.getAttackPoints() + " attack points, and is equipped with a " + job.getWeapon().getName() + ".";
    }
}