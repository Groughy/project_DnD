package items;

public class OffensiveEquipment extends Item {
    private int damage;
    private String classRestriction;

    public OffensiveEquipment() {

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setClassRestriction(String classRestriction) {
        this.classRestriction = classRestriction;
    }

    public OffensiveEquipment(String name, int damage, String classRestriction) {
        this.setName(name);
        this.damage = damage;
        this.classRestriction = classRestriction;

    }
    public String getClassRestriction() {
        return classRestriction;
    }

    public void displayWeapons(){
        OffensiveEquipment[] equipments = {
                new OffensiveEquipment("Sword", 5, "Warrior"),
                new OffensiveEquipment("Mace", 3, "Warrior"),
                new OffensiveEquipment("Fire Ball", 7, "Mage"),
                new OffensiveEquipment("Thunder Bolt", 2, "Mage")
        };

        for (OffensiveEquipment equipment : equipments) {
            System.out.println(equipment.getName() + " has a damage of " + equipment.damage + ".");
        }
    }
}