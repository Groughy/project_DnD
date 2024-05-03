package items;

import characters.Job;

public class Item {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Item() {
        this.name = "items.Item";
    }

    public void use(Job character) {
        System.out.println(character.getNameCharacter() + " uses " + this.getName());
    }
}
