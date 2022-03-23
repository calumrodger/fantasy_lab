package characters.players;

import behaviours.IWeapon;

public class Barbarian extends Fighter {


    public Barbarian(String name, int healthBar, int stamina, int criticalChance, IWeapon weapon) {
        super(name, healthBar, stamina, criticalChance, weapon);
    }

//    public int attackWithWeapon(){
//        return this.weapon.attack();
//    }
}
