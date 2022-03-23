package weapons;

import behaviours.IWeapon;
import enemies.Enemy;

public class Club implements IWeapon {

    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(10);
    }
}
