import characters.aliens.bosses.MrJellybean;
import characters.people.heroes.Morty;
import characters.people.heroes.Rick;

import java.util.Scanner;

public class PlayGame {

    public static void main(String[] args) {

        Scanner myChoice = new Scanner(System.in);
        Game game = new Game();

        System.out.println("Welcome to the Rick & Morty experience.");
        System.out.println("Would you like to continue?");
        System.out.println("y for Yes");
        System.out.println("n for No");

        String answer = myChoice.nextLine();
        game.getYesorNo(answer);
        }

}
