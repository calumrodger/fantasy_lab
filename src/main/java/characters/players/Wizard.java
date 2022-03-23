package characters.players;

import behaviours.ISpell;

public class Wizard extends Mage{
    public Wizard(String name, int healthBar, int stamina, int criticalChance, ISpell spell) {
        super(name, healthBar, stamina, criticalChance, spell);
    }


    @Override
    public void defend() {
        this.getHealed(100);
    }
}
