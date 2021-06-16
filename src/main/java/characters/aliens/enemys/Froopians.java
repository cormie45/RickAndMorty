package characters.aliens.enemys;

import weapon.behaviours.IWeapon;
import characters.Character;
import java.util.ArrayList;

public class Froopians extends Character {

    private ArrayList<IWeapon> weapons;

    public Froopians(int health){
        super(health);
        this.weapons = new ArrayList<>();
    }
}
