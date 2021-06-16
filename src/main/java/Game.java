import characters.aliens.bosses.MrJellybean;
import characters.aliens.enemys.Gromflomites;
import characters.people.heroes.Morty;
import characters.people.heroes.Rick;
import weapon.LaserGun;
import weapon.PulseRifle;

import java.util.Scanner;

public class Game {

    Scanner myChoice = new Scanner(System.in);
    Rick rick = new Rick(100);
    Morty morty = new Morty(100);
    Gromflomites gromflomite1 = new Gromflomites(20);
    Gromflomites gromflomite2 = new Gromflomites(20);
    MrJellybean mrJellybean = new MrJellybean(150);
    LaserGun laserGun = new LaserGun(20);
    PulseRifle pulseRifle1 = new PulseRifle(15);
    PulseRifle pulseRifle2 = new PulseRifle(15);

    public void getYesorNo(String answer) {

        if (answer.equals("y")) {
            System.out.println("Let's go!");
            levelOne();
        } else if (answer.equals("n")) {
            System.out.println("Bye");
            System.exit(0);
        } else {
            System.out.println("Please type y for yes or n for no.");
            String newAnswer = myChoice.nextLine();
            getYesorNo(newAnswer);
        }

    }

    public void levelOne() {
        System.out.println("Rick: Welcome to Venzenulon 9 Morty, it's colder than a witches tit at night here so lets find those Mega Seeds and get the fuck out of here!");
        System.out.println("Morty: Oh geez Rick, I've got a bad feeling about this place.");
        System.out.println("Where do you look first?");
        System.out.println("1 - A large clearing near the Space Cruiser");
        System.out.println("2 - A gaping chasm where you can see right into the planet's core.");
        System.out.println("3 - Garden centre");
        String answer = myChoice.nextLine();
        choice1(answer);
    }

    public void choice1(String answer) {
        switch (answer) {
            case "1":
                System.out.println("Yes let's go there");
                level2();
                break;
            case "2":
                System.out.println("It's obviously not going to be there, try again.");
                System.out.println("1 - A large clearing near the Space Cruiser");
                System.out.println("3 - Garden centre");
                String newAnswer1 = myChoice.nextLine();
                choice1(newAnswer1);
                break;
            case "3":
                System.out.println("If only it was that easy");
                System.out.println("1 - A large clearing near the Space Cruiser");
                System.out.println("2 - A gaping chasm where you can see right into the planet's core.");
                String newAnswer2 = myChoice.nextLine();
                choice1(newAnswer2);
                break;


        }
    }

    public void level2() {
        System.out.println("Morty: Hey Rick, I think theres something following us...");
        System.out.println("Rick: Goddammit! Its those pesky Gromflomites from the Galactic Federation, wanna kick their ass?");
        System.out.println("Morty: I don't have any weapons Rick, what have you got?");
        System.out.println("1 - Plumbus");
        System.out.println("2 - Neutrino Bomb");
        System.out.println("3 - Laser Gun");
        String answer = myChoice.nextLine();
        choice2(answer);
    }

    public void choice2(String answer) {
        rick.addWeapon(laserGun);

        switch (answer) {
            case "1":
                System.out.println("A plumbus Morty? We don't have time for your adolescent urges!!!");
                System.out.println("The Gromflomites open fire on Rick and Morty, Rick pushes Morty into the line of fire...");
                pulseRifle1.attack(morty);
                System.out.println("Morty's health: " + morty.getHealth());
                System.out.println("2 - Neutrino Bomb");
                System.out.println("3 - Laser Gun");
                String newAnswer1 = myChoice.nextLine();
                choice2(newAnswer1);
                break;
            case "2":
                System.out.println("Yeah great choice Morty just wipe out the entire planet... With us still on it, dumbass!");
                System.out.println("The Gromflomites open fire on Rick and Morty, Rick dives behind a tree, Morty doesn't react quickly enough...");
                pulseRifle1.attack(morty);
                System.out.println("Morty's health: " + morty.getHealth());
                System.out.println("1 - Plumbus");
                System.out.println("3 - Laser Gun");
                String newAnswer2 = myChoice.nextLine();
                choice2(newAnswer2);
                break;
            case "3":
                System.out.println("Yes good choice, fry those bureaucrats!");
                System.out.println("Rick brutally murders the two Gromflomites, sadistically laughing as he fires upon them.");
                System.out.println("Morty: Jesus Rick!, lets get out of here!");
                level3();
                break;
            default:
                System.out.println("Please type 1, 2 or 3");
                String newAnswer3 = myChoice.nextLine();
                choice2(newAnswer3);
                break;
        }

    }

    public void level3() {

    }
}
