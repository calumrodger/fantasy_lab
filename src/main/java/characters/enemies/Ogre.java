package characters.enemies;

import behaviours.IDefend;

public class Ogre extends Enemy implements IDefend {
    public Ogre(String name, int healthBar, int stamina, int criticalChance) {
        super(name, healthBar, stamina, criticalChance);
    }

    @Override
    public void defend() {
        this.getHealed(100);
    }
}
