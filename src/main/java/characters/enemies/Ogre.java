package characters.enemies;

import behaviours.IDefend;
import behaviours.IWeapon;

public class Ogre extends Enemy implements IDefend {
    public Ogre(String name, int healthBar, int stamina, int criticalChance) {
        super(name, healthBar, stamina, criticalChance);
    }

    @Override
    public void defend() {
        this.getHealed(100);
    }

    public String dies() {
        if (this.getHealthBar() < 0){
            return "You killed the ogre!!!";
        } else {
            return "He's still kickin!";
        }
    }

}
