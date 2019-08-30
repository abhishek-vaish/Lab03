package Solution02;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        double Rupay = 0.0;
        int rupay1;
        int paise;
        Scanner scan = new Scanner(System.in);
        Rupay = scan.nextDouble();
        rupay1 = (int) Rupay;
        paise = (int) ((Rupay - rupay1) * 100);
        System.out.println(rupay1 + " Ruppees " + paise + " Paise");

    }

}
