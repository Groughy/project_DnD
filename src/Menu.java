import java.util.Scanner;

public class Menu {

    public Menu (){

    }
    public Character createCharacter() {
        Scanner scanner = new Scanner(System.in);
        display("Enter the name of your character: ");
        String name = scanner.nextLine();
        Job job = this.getJobByName();
        return new Character(name, job);
    }
    public boolean launchGame() {
        display("Welcome to the game! (•̀ᴗ•́)و ̑̑");
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
                case "Warrior" -> {
                    return new Job("Warrior");
                }
                case "Mage" -> {
                    return new Job("Mage");
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
}
