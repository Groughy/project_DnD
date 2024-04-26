public class Consummable {
    private String name;
    private String effectDescription;
    private int effect;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public Consummable() {
        this.name = "Little potion";
        Job job = new Job();
        int value = 2;
        this.effect = job.getLifePoints() + value;
        this.effectDescription = "Grant "+value+" life points";
    }
    public Consummable(String name, int value) {
        this.name = name;
        this.value = value;
        Job job = new Job();
        this.effect = job.getLifePoints() + value;
        this.effectDescription = "Grant "+value+" life points";
    }

    Consummable LittlePotion = new Consummable("Little potion", 2);
    Consummable BigPotion = new Consummable("Big potion", 5);
}
