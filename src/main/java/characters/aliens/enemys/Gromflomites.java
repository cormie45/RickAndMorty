package characters.aliens.enemys;

import weapon.behaviours.IWeapon;
import characters.Character;
import java.util.ArrayList;

public class Gromflomites extends Character {

    private ArrayList<IWeapon> weapons;

    public Gromflomites(int health){
        super(health);
        this.weapons = new ArrayList<>();
    }
}
