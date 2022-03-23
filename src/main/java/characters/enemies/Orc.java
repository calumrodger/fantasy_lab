package characters.enemies;

import behaviours.IDefend;

public class Orc extends Enemy implements IDefend {
    public Orc(String name, int healthBar, int stamina, int criticalChance) {
        super(name, healthBar, stamina, criticalChance);
    }

    @Override
    public void defend() {
        this.getHealed(100);
    }
}
