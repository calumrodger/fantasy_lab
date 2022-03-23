package characters.players;

import behaviours.IHeal;

public class Cleric extends Player {

    private IHeal heal;

    public Cleric(String name, int healthBar, int stamina, int criticalChance, IHeal heal) {
        super(name, healthBar, stamina, criticalChance);
        this.heal = heal;

    }

    public IHeal getHeal() {
        return heal;
    }

    public void setHeal(IHeal heal) {
        this.heal = heal;
    }
}
