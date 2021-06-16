package weapon;

import characters.Character;
import weapon.behaviours.IWeapon;

public abstract class Weapon implements IWeapon {

    private int damage;

    public Weapon(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void attack(Character character){
        character.setHealth(character.getHealth() - damage);
    }
}
