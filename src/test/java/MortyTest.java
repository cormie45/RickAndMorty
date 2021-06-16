import org.junit.Before;
import org.junit.Test;
import characters.people.heroes.Morty;
import weapon.LaserGun;

import static org.junit.Assert.assertEquals;

public class MortyTest {

    Morty morty;
    int newHealth;
    LaserGun laserGun;

    @Before
    public void before(){
        morty = new Morty(100);
        newHealth = 80;
        laserGun = new LaserGun(20);
    }

    @Test
    public void canGetName(){
        assertEquals("Morty", morty.getName());
    }

    @Test
    public void canSetName(){
        morty.setName("Android Morty");
        assertEquals("Android Morty", morty.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, morty.getHealth());
    }

    @Test
    public void canSetHealth(){
        morty.setHealth(newHealth);
        assertEquals(80, morty.getHealth());
    }

}
