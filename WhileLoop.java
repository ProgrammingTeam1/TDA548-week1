package assignments.basics;

import java.text.DecimalFormat;
import static java.lang.System.*;;

public class WhileLoop {

    public static void main(String[] args) {
        new WhileLoop().program();
    }

    void program() {

        DecimalFormat df = new DecimalFormat("0.0##");
        DecimalFormat dg = new DecimalFormat("0.##");

        out.print("a) ");
        int heltal = -20;
        while(heltal < 4) {
            out.print(heltal + ", ");
            heltal++;
        }

        out.print("\nb) ");
        heltal = 10;
        while(heltal > -11) {
            out.print(heltal + ", ");
            heltal--;
        }

        out.print("\nc) ");
        heltal = 5;
        while(heltal < 101) {
            out.print(heltal + ", ");
            heltal += 5;
        }

        out.print("\nd) ");
        double tal = 0.0;
        while(tal < 9.1) {
            out.print(df.format(tal) + "  ");
            tal += 0.3;
        }

        out.print("\ne) ");
        double k = 1;
        while(k < 9) {
            out.print("1/" + dg.format(Math.pow(2,k)) + ", ");
            k++;
        }

        out.print("\nf) ");
        double pi4 = 0;
        double i = 0;
        while(i < 100) {
            pi4 += ((Math.pow(-1,i))/(1+(2*i)));
            i++;
        }
        out.print("pi = " + 4*pi4);

    }

}