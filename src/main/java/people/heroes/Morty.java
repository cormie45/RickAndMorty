package people.heroes;

import gadget.behaviours.IGadget;
import people.Human;
import weapon.behaviours.IWeapon;

import java.util.ArrayList;

public class Morty extends Human {

    private ArrayList<IWeapon> weapons;
    private ArrayList<IGadget> gadgets;

    public Morty(String name, int health){
        super(name, health);
        this.weapons = new ArrayList<>();
        this.gadgets = new ArrayList<>();
    }
}
