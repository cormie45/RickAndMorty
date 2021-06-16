import characters.people.heroes.Rick;
import org.junit.Before;
import org.junit.Test;
import weapon.LaserGun;

import static org.junit.Assert.assertEquals;

public class LaserGunTest {

    LaserGun laserGun;
    Rick rick;

    @Before
    public void before(){
        laserGun = new LaserGun(20);
        rick = new Rick(100);
    }

    @Test
    public void canGetDamage(){
        assertEquals(20, laserGun.getDamage());
    }

    @Test
    public void checkRickAttack(){
        laserGun.attack(rick);
        assertEquals(80, rick.getHealth());
    }


}
