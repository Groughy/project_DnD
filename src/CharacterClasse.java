public class CharacterClasse {
    String name;
    int lifePoint;
    int attackPoint;
    String offensiveEquipment;
    String defensiveEquipment;

    public CharacterClasse(String name, int lifePoint, int attackPoint, String offensiveEquipment, String defensiveEquipment) {
        this.name = name;
        this.lifePoint = lifePoint;
        this.attackPoint = attackPoint;
        this.offensiveEquipment = offensiveEquipment;
        this.defensiveEquipment = defensiveEquipment;
    }
    public static void main(String[] args) {
        CharacterClasse Warrior = new CharacterClasse("Warrior", 10,10,"Sword","Shield");
        CharacterClasse Mage = new CharacterClasse("Mage", 5,15,"Spell","Philtre");
        System.out.println(Warrior + " " + Mage);
    }
}
