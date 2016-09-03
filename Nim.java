package assignments.product;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class Nim {

    public static void main(String[] args) {
        new Nim().program();
    }

    void program() {

        Random rand = new Random();
        Scanner sc = new Scanner(in);

        int again = 1;

        while (again == 1){

            int val = 0;
            int dator = 0;
            int antal = 13;

            out.println("\nWelcome to NIM!\nThere's 13 coins in the pile.\nPick between 1-3 coins.");

            while(antal > 0){

                out.print("\nPick coins > ");
                val = sc.nextInt();

                while (val < 1 || val > 3 || (antal-val) < 0){
                    out.print("Not accepted! Pick coins again> ");
                    val = sc.nextInt();
                }

                antal = antal - val;
                out.println("Player took " + val + " coins.");
                out.println("There's " + antal + " coins in the pile.");

                if(antal == 0){
                    out.println("Player has won the game!");
                    break;
                }

                if(antal > 2) {
                    dator = rand.nextInt(3) + 1;
                }
                else{
                    dator = rand.nextInt(antal) + 1;
                }

                antal = antal - dator;
                out.println("Computer took " + dator + " coins.");
                out.println("There's " + antal + " coins in the pile.");

                if(antal == 0){
                    out.println("Computer has won the game!");
                    break;
                }

            }

            out.print("\nPlay agan? Yes(1)/No(0) > ");
            again = sc.nextInt();

            while (again < 0 || again > 1){
                out.print("Not accepted! Yes(1)/No(0) > ");
                again = sc.nextInt();
            }

        }

        out.println("The game has ended!");

    }

}