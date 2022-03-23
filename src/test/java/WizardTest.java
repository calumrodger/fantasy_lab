import characters.enemies.Ogre;
import org.junit.Before;
import org.junit.Test;
import characters.players.Barbarian;
import characters.players.Wizard;
import spells.Fireball;
import spells.LightningBolt;
import weapons.Axe;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class WizardTest {

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
        barbarian = new Barbarian("Bob", 100, 10, 10, club);
        wizard = new Wizard("Tony", 80, 8, 8, fireball);
        ogre = new Ogre("James", 10, 20, 5);
    }

    @Test
    public void wizardHasSpell(){
        assertEquals(fireball, wizard.getSpell());
    }

    @Test
    public void wizardCanCastOnOgre(){
        fireball.cast(ogre);
        assertEquals(0, ogre.getHealthBar());
    }

    @Test
    public void wizardCanChangeSpell(){
        wizard.setSpell(lightningBolt);
        assertEquals(lightningBolt, wizard.getSpell());
    }

    @Test
    public void wizardCanDefend(){
        wizard.defend();
        assertEquals(180, wizard.getHealthBar());
    }

}
