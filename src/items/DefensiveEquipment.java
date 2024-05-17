package items;

public class DefensiveEquipment extends Item {
    public DefensiveEquipment(String name, int defensePoints) {
        this.name = name;
        this.defensePoints = defensePoints;
    }

    private int defensePoints;

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }
}
