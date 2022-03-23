package characters.enemies;

import behaviours.IDefend;
import characters.Character;

public abstract class Enemy extends Character implements IDefend {


    public Enemy(String name, int healthBar, int stamina, int criticalChance) {
        super(name, healthBar, stamina, criticalChance);
    }
}
