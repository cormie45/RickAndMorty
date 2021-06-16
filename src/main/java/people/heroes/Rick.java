package people.heroes;

import gadget.behaviours.IGadget;
import people.Human;
import weapon.behaviours.IWeapon;

import java.util.ArrayList;

public class Rick extends Human {

    private ArrayList<IWeapon> weapons;
    private ArrayList<IGadget> gadgets;

    public Rick(String name, int health){
        super(name, health);
        this.weapons = new ArrayList<>();
        this.gadgets = new ArrayList<>();
    }
}
