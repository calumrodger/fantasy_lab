package players;

import behaviours.IWeapon;

public abstract class Fighter extends Player{

    private IWeapon weapon;

    public Fighter(String name, int healthBar, int stamina, int criticalChance, IWeapon weapon) {
        super(name, healthBar, stamina, criticalChance);
        this.weapon = weapon;

    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

//    public int attack(){
//        return weapon.getDamage();
//    }
}
