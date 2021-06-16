package characters.people.heroes;

import characters.Character;
import gadget.behaviours.IGadget;
import weapon.behaviours.IWeapon;

import java.util.ArrayList;

public class Morty extends Character {

    private String name;
    private ArrayList<IWeapon> weapons;
    private ArrayList<IGadget> gadgets;

    public Morty(int health){
        super(health);
        this.name = "Morty";
        this.weapons = new ArrayList<>();
        this.gadgets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addWeapon(IWeapon weapon){
        weapons.add(weapon);
    }

    public void addGadget(IGadget gadget){
        gadgets.add(gadget);
    }

}
