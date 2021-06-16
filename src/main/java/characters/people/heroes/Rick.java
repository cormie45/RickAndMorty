package characters.people.heroes;

import characters.Character;
import gadget.behaviours.IGadget;
import weapon.Weapon;
import weapon.behaviours.IWeapon;

import java.util.ArrayList;

public class Rick extends Character{

    private String name;
    private ArrayList<IWeapon> weapons;
    private ArrayList<IGadget> gadgets;
    private String talk;

    public Rick(int health){
        super(health);
        this.name = "Rick";
        this.weapons = new ArrayList<>();
        this.gadgets = new ArrayList<>();
        this.talk = "";
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

    public String speak(){
        return talk;
    }

    public void becomePickleRick(){
        setHealth(100);
        setName("Pickle Rick");
        talk = "I'M PICKLE RIIIIIIIIIIIIIIIIIIIIICK!!!!";
    }

}
