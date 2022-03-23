import enemies.Enemy;
import enemies.Ogre;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Club club;
    Ogre ogre;

    @Before
    public void setUp(){
        club = new Club();
        barbarian = new Barbarian("Bob", 100, 10, 10, club);
        ogre = new Ogre("James", 10, 20, 5);
    }

    @Test
    public void barbarianHasWeapon(){
        assertEquals(club, barbarian.getWeapon());
    }

    @Test
    public void barbarianCanAttackOgre(){
        club.attack(ogre);
        assertEquals(0, ogre.getHealthBar());
    }


}
