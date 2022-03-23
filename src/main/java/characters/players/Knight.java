package characters.players;

import behaviours.IWeapon;

public class Knight extends Fighter {
    public Knight(String name, int healthBar, int stamina, int criticalChance, IWeapon weapon) {
        super(name, healthBar, stamina, criticalChance, weapon);
    }
}
