package weapons;

import behaviours.IWeapon;
import characters.Character;
import characters.enemies.Enemy;

import java.util.Random;

public class Axe implements IWeapon {

    @Override
    public void attack(Character character) {
        Random rand = new Random();
        int randomDamageValue = rand.nextInt((10 - 1) + 1) + 1;
//        int criticalChanceValue = rand.nextInt((100 - 1) + 1) + 1;
        character.takeDamage(randomDamageValue);
    }
}
