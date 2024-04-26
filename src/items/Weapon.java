package items;

public class Weapon extends Item {
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setClassRestriction(String classRestriction) {
        this.classRestriction = classRestriction;
    }

    private String classRestriction;

    public Weapon(String name, int damage, String classRestriction) {
        this.setName(name);
        this.damage = damage;
        this.classRestriction = classRestriction;

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
            System.out.println(equipment.getName() + " has a damage of " + equipment.damage + ".");
        }
    }
}