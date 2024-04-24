import java.util.Objects;
import java.util.Scanner;

public class Character {
    private String name;
    private String characterClass;
    private int lifePoints;
    private int attackPoints;
    private Weapon weapon;

    private Character character(String name,  String characterClass) {
        this.name = name;
        this.characterClass = characterClass;
        if(characterClass.equals("Warrior")){
            this.lifePoints = 10;
            this.attackPoints = 10;
            this.weapon = new Weapon("beginningSword",0, "Warrior");
        }
        else {
            this.characterClass = "Mage";
            this.lifePoints = 6;
            this.attackPoints = 15;
            this.weapon = new Weapon("beginningSpell", 0, "Mage");
        }
        return this;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of your character: ");
        String name = scanner.nextLine();
        System.out.println("Enter the class of your character: ");
        String getClass = scanner.nextLine();
       Character someone = new Character().character(name, getClass);
        System.out.println(someone.name + " is a " + someone.characterClass + " with " + someone.lifePoints + " life points, " + someone.attackPoints + " attack points, and is equipped with a " + someone.weapon.name + ".");
    }
    public void setWeapon(Weapon weapon) {
        if (!weapon.getClassRestriction().equals(this.characterClass)) {
            throw new IllegalArgumentException("This weapon is not allowed for this class.");
        }
        this.weapon = weapon;
    }
}
