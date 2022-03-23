package spells;

import behaviours.ISpell;
import characters.Character;
import characters.enemies.Enemy;

public class LightningBolt implements ISpell {

    @Override
    public void cast(Character character) {
        character.takeDamage(15);
    }
}
