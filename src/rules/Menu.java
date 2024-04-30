package rules;

import characters.Job;
import characters.jobs.Mage;
import characters.jobs.Warrior;

import java.util.Scanner;

public class Menu {

    private Job characterJob;
    private String characterName;
    public Menu (){

    }

    public Menu(String name, Job job) {
        this.characterName = name;
        this.characterJob = job;
    }

    public Menu createCharacter(String name) {
        Job job = this.getJobByName();
        return new Menu(name, job);
    }
    public boolean launchGame() {
        display("Wanna play ? (yes/no) (੭ ᵔ³ᵔ)੭ 口");
        return wannaPlay();
    }

    private boolean wannaPlay() {
        return switch (new Scanner(System.in).nextLine()) {
            case "yes", "Yes", "y", "Y", "" -> true;
            default -> false;
        };
    }
    public Job getJobByName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            display("Enter the class of your character: ");
            String jobName = scanner.nextLine();
            switch (jobName) {
                case "Warrior", "Guerrier", "warrior","guerrier" -> {
                    return new Warrior("Warrior");
                }
                case "Mage","mage" -> {
                    return new Mage("Mage");
                }
                case "quit", "exit" -> {
                    display("Go to hell ! █▬▬ ◟(`ﮧ´ ◟ )");
                    System.exit(0);
                }
                default -> display("Invalid job name. Please try again.");
            }
        }
    }

    public void askToRoll() {
        display("Press enter to roll the dice");
        new Scanner(System.in).nextLine();
    }

    public void display(Object o) {
        System.out.println(o.toString());
    }

    public String askName() {
        Scanner scanner = new Scanner(System.in);
        display("Enter the name of your character: ");
        return scanner.nextLine();
    }
    @Override
    public String toString() {
        return characterName + " is a " + characterJob.getName() + " with " + characterJob.getLifePoints() + " life points, " + characterJob.getAttackPoints() + " attack points, and is equipped with a " + characterJob.getWeapon().getName() + ".";
    }
}
