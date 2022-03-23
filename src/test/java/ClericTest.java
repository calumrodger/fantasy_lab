import characters.enemies.Ogre;
import org.junit.Before;
import org.junit.Test;
import characters.players.Barbarian;
import characters.players.Cleric;
import characters.players.Wizard;
import potions.Heal;
import potions.Rejuvenate;
import spells.Fireball;
import spells.LightningBolt;
import weapons.Axe;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Heal heal;
    Rejuvenate rejuvenate;
    Barbarian barbarian;
    Wizard wizard;
    LightningBolt lightningBolt;
    Fireball fireball;
    Club club;
    Ogre ogre;
    Axe axe;

    @Before
    public void setUp(){
        club = new Club();
        axe = new Axe();
        fireball = new Fireball();
        lightningBolt = new LightningBolt();
        heal = new Heal();
        rejuvenate = new Rejuvenate();
        cleric = new Cleric("Pete", 50, 5, 20, heal);
        barbarian = new Barbarian("Bob", 100, 10, 10, club);
        wizard = new Wizard("Tony", 80, 8, 8, fireball);
        ogre = new Ogre("James", 10, 20, 5);
    }

    @Test
    public void clericHasPotion(){
        assertEquals(heal, cleric.getHeal());
    }

    @Test
    public void clericCanHealPlayer(){
        heal.heal(barbarian);
        assertEquals(120, barbarian.getHealthBar());
    }

    @Test
    public void clericCanChangePotion(){
        cleric.setHeal(rejuvenate);
        assertEquals(rejuvenate, cleric.getHeal());
    }


}

