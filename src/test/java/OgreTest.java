import characters.enemies.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

    private Ogre ogre;

    @Before
    public void setUp(){
        ogre = new Ogre("Jimmy", 50, 10, 10);
    }

    @Test
    public void ogreCanDefend(){
        ogre.defend();
        assertEquals(150, ogre.getHealthBar());
    }
}
