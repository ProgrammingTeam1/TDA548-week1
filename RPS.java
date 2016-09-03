package exercises;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class RPS {

    public static void main(String[] args) {
        new RPS().program();
    }

    void program() {

        Random rand = new Random();
        Scanner sc = new Scanner(in);

        int val, dator, poang = 0;
        out.println("\nHej! Nu börjar spelet!");

        while(poang > -2 && poang < 2) {

            out.print("\nValj sten(1), sax(2) eller pase(3) > ");
            val=sc.nextInt();
            dator=rand.nextInt(3)+1;
            out.println("Datorn valde " + dator);

            if(val == dator) {
                out.println("Oavgjort!");
            }
            else if(val == 2 || dator == 2) {
                if(val < dator) {
                    out.println("Spelare vann!");
                    poang++;
                }
                else {
                    out.println("Datorn vann!");
                    poang--;
                }
            }
            else {
                if(val == 3) {
                    out.println("Spelare vann!");
                    poang++;
                }
                else {
                    out.println("Datorn vann!");
                    poang--;
                }
            }

            out.println("Poangstallning: " + poang);

        }

        out.println("\nSpelet ar slut!");

    }

}