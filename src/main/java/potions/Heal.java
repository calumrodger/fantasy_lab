package potions;

import behaviours.IHeal;
import characters.Character;
import characters.players.Player;

public class Heal implements IHeal {
    @Override
    public void heal(Character character) {
        character.getHealed(20);
    }
}
