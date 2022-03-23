package players;

import behaviours.IWeapon;

public class Dwarf extends Fighter {
    public Dwarf(String name, int healthBar, int stamina, int criticalChance, IWeapon weapon) {
        super(name, healthBar, stamina, criticalChance, weapon);
    }
}
