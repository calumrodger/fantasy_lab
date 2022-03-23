package characters.players;
import characters.Character;

public abstract class Player extends Character{


    public Player(String name, int healthBar, int stamina, int criticalChance) {
        super(name, healthBar, stamina, criticalChance);
    }



}
