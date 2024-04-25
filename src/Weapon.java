public class Weapon {
    String name;
    private int damage;
    private String classRestriction;

    public Weapon(String name, int damage, String classRestriction) {
        this.name = name;
        this.damage = damage;
        this.classRestriction = classRestriction;

    }
    public String getName() {
        return name;
    }

    public String getClassRestriction() {
        return classRestriction;
    }

    public static void main(String[] args) {
        Weapon[] equipments = {
                new Weapon("Sword", 5, "Warrior"),
                new Weapon("Mace", 3, "Warrior"),
                new Weapon("Fire Ball", 7, "Mage"),
                new Weapon("Thunder Bolt", 2, "Mage")
        };

        for (Weapon equipment : equipments) {
            System.out.println(equipment.name + " has a damage of " + equipment.damage + ".");
        }
    }
}