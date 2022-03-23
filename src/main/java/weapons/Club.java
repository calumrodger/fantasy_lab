package weapons;

import behaviours.IWeapon;
import characters.Character;
import characters.enemies.Enemy;

import java.util.Random;

public class Club implements IWeapon {

    @Override
    public void attack(Character character) {
        Random rand = new Random();
        int randomNum = rand.nextInt((10 - 1) + 1) + 1;
        character.takeDamage(randomNum);
    }
}
