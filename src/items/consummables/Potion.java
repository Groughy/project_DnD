package items.consummables;

import items.Consummable;

public class Potion extends Consummable {
    public Potion() {
        this.setName("Potion");
        this.setEffect(2);
        this.setEffectDescription("Heals " + getEffect() + " life points.");
    }
}
