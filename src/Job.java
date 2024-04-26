import java.util.Scanner;

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
    public Job(String name, int lifePoints, int attackPoints) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.attackPoints = attackPoints;
        this.weapon = new Weapon("beginningWeapon",0,name);
    }
    public Job getJobByName(String jobName) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the class of your character: ");
            jobName = scanner.nextLine();
            switch (jobName) {
                case "Warrior" -> {
                    return new Job("Warrior");
                }
                case "Mage" -> {
                    return new Job("Mage");
                }
                case "quit", "exit" -> {
                    System.out.println("Go to hell ! █▬▬ ◟(`ﮧ´ ◟ )");
                    System.exit(0);
                }
                default -> System.out.println("Invalid job name. Please try again.");
            }
        }
    }
}
