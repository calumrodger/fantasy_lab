package characters.players;

import behaviours.IDefend;
import behaviours.ISpell;

public abstract class Mage extends Player implements IDefend {

    private ISpell spell;

    public Mage(String name, int healthBar, int stamina, int criticalChance, ISpell spell) {
        super(name, healthBar, stamina, criticalChance);
        this.spell = spell;
    }

    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }


}
