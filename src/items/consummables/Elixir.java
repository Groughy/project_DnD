package items.consummables;

import items.Consummable;

public class Elixir extends Consummable {
    public Elixir() {
        this.setName("Elixir");
        this.setEffect(5);
        this.setEffectDescription("Heals " + getEffect() + " life points.");
    }
}
