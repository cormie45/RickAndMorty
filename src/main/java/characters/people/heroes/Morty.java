package characters.people.heroes;

import characters.Character;
import gadget.behaviours.IGadget;
import weapon.behaviours.IWeapon;

import java.util.ArrayList;

public class Morty extends Character {

    private String name;

    public Morty(int health){
        super(health);
        this.name = "Morty";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
