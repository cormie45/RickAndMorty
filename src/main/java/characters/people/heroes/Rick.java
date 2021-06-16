package characters.people.heroes;

import characters.Character;
import gadget.behaviours.IGadget;
import weapon.Weapon;
import weapon.behaviours.IWeapon;

import java.util.ArrayList;

public class Rick extends Character{

    private String name;

    public Rick(int health){
        super(health);
        this.name = "Rick";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
