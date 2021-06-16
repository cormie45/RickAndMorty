import org.junit.Before;
import org.junit.Test;
import characters.people.heroes.Rick;
import weapon.LaserGun;

import static org.junit.Assert.assertEquals;

public class RickTest {

    Rick rick;
    LaserGun laserGun;
    int newHealth;

    @Before
    public void before(){
        rick = new Rick(100);
        newHealth = 80;
        laserGun = new LaserGun(20);
    }

    @Test
    public void canGetName(){
        assertEquals("Rick", rick.getName());
    }

    @Test
    public void canSetName(){
        rick.setName("Pickle Rick");
        assertEquals("Pickle Rick", rick.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, rick.getHealth());
    }

    @Test
    public void canSetHealth(){
        rick.setHealth(newHealth);
        assertEquals(80, rick.getHealth());
    }

}
