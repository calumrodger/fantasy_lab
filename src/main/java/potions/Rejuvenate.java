package potions;

import behaviours.IHeal;
import characters.Character;
import characters.players.Player;

public class Rejuvenate implements IHeal {
    @Override
    public void heal(Character character) {
        character.getHealed(100);
    }
}
