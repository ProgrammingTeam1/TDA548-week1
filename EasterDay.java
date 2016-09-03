package assignments.basics;

import java.util.Scanner;
import static java.lang.System.*;

public class EasterDay {

    public static void main(String[] args) {
        new EasterDay().program();
    }

    void program() {

        Scanner sc = new Scanner(in);

        int a, b, c, d, e, s, t;
        int date, year, month;

        out.print("Input a year (1900-2099) > ");
        year = sc.nextInt();

        a = year % 19;
        b = year % 4;
        c = year % 7;
        s = 19*a + 24;
        d = s % 30;
        t = 2*b + 4*c + 6*d + 5;
        e = t % 7;
        date = 22 + d + e;

        if(date < 32) {
            month = 3;
        }
        else {
            if(date == 26) {
                date = 19;
                month = 4;
            }
            else if ((date == 25) && (a == 16) && (d == 28)) {
                date = 18;
                month = 4;
            }
            else{
                date = d + e - 9;
                month = 4;
            }
        }

        out.print("Easter day for " + year + " is " + date + "/" + month);

    }

}