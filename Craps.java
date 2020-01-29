
/**
 * Write a description of class Craps here.
 *
 * @author Marisa Guerra
 * @version January 14, 2020
 */

import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String play;
        boolean playing = true;
        System.out.println("Would you like instruction? (y/n): ");
        String instructions = in.nextLine();
        if (instructions.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println("1. A player rolls two six-sided dice and adds the numbers rolled together.");
            System.out.println("2. If the first roll is a 7 or an 11 you win. ");
            System.out.println("If the first roll is a 2, 3, or 12 you lose. ");
            System.out.println("If a 4, 5, 6, 8, 9, or 10 are rolled on the first roll, that number becomes the point. ");
            System.out.println("3. You will continues to roll the two dice again until you either roll the point again, in which case you win;"); 
            System.out.println("or they roll a 7, in which case you lose");
        }

        while (playing)
        {
            System.out.println("Please press enter to roll!");
            in.nextLine();
            Die d = new Die();
            int firstRoll = d.roll(); 
            System.out.println("You rolled a " + firstRoll);
            if(firstRoll == 7 || firstRoll == 11)
            {
                System.out.println("You win!");
            }
            else if (firstRoll == 2 || firstRoll == 3 || firstRoll == 12)
            {
                System.out.println("You lose :(");
            }
            else
            {
                System.out.println("Now lets roll for the point!");
                int point = firstRoll;
                int newRoll = d.roll();
                System.out.println("Please press enter to roll for the point!");
                in.nextLine();
                while(newRoll != point && newRoll != 7)
                {
                    newRoll = d.roll(); 
                    System.out.println("You rolled a " + newRoll);
                    if(newRoll == point)
                    {
                        System.out.println("You won!");
                    }
                    else if (newRoll == 7)
                    {
                        System.out.println("You lost :(");
                    }
                    else
                    {
                        System.out.println("Press enter to roll again!");
                        in.nextLine();
                    }
                }
            }
            System.out.println("Would you like to play again? (y/n): ");
            play = in.nextLine();
            if (play.substring(0,1).equalsIgnoreCase("n"))
            {
                playing = false;
            }
        }
    }
}
