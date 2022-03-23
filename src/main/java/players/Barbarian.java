package players;

import behaviours.IWeapon;

public class Barbarian extends Fighter {


    public Barbarian(String name, int healthBar, int stamina, int criticalChance, IWeapon weapon) {
        super(name, healthBar, stamina, criticalChance, weapon);
    }

//    @Override
//    public int attack() {
//        return weapon.getDamage();
//    }
}
