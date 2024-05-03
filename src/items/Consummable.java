package items;

import characters.Job;

public class Consummable extends Item {

    private String effectDescription;
    private int effect;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value;



    public String getEffectDescription() {
        return effectDescription;
    }

    public void setEffectDescription(String effectDescription) {
        this.effectDescription = effectDescription;
    }

    public int getEffect() {
        return effect;
    }

    public void setEffect(int effect) {
        this.effect = effect;
    }
    public void drinkPotion(Job character, Consummable consummable) {
        character.setLifePoints(character.getLifePoints() + consummable.getEffect());
        System.out.println(character.getNameCharacter() + " drinks " + consummable.getName() + " and gains " + consummable.getEffect() + " life points.");
    }
}
