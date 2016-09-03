package assignments.basics;

import java.util.Scanner;
import static java.lang.System.*;

public class SumAvg {

    public static void main(String[] args) {
        new SumAvg().program();
    }

    void program() {

        Scanner sc = new Scanner(in);

        int count = 0;
        double sum = 0;
        double val = 0;
        double avg = 0;

        while (val > -1) {

            out.print("> ");
            val = sc.nextInt();

            if(val < 0 ) {
                break;
            }

            sum = sum + val;
            count++;

        }

        avg = sum/count;
        out.print("Count=" + count + " Sum=" + sum + " Avg=" + avg);

    }

}