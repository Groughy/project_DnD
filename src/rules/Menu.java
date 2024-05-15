package rules;

import characters.Job;
import characters.jobs.Mage;
import characters.jobs.Warrior;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    public Menu (){
    }

    public boolean launchGame() {
        display("Wanna play ? (yes/no) (੭ ᵔ³ᵔ)੭ 口");
        return wannaPlay();
    }

    boolean wannaPlay() {
        return switch (scanner.nextLine().toLowerCase()) {
            case "yes", "y", "" -> true;
            default -> false;
        };
    }
    public Job getJobByName() {

        while (true) {
            display("Enter the class of your character: ");
            String jobName = scanner.nextLine();
            switch (jobName.toLowerCase()) {
                case "warrior","guerrier" -> {
                    return new Warrior();
                }
                case "mage" -> {
                    return new Mage();
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
        scanner.nextLine();
    }

    public void display(Object o) {
        System.out.println(o.toString());
    }

    public String askName() {
        display("Enter the name of your character: ");
        Scanner askName = new Scanner(System.in);
        return askName.nextLine();
    }
}