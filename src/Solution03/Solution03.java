package Solution03;

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner scan = new Scanner(System.in);
        fahrenheit = scan.nextDouble();
        celsius = (fahrenheit - 32) / 1.8;
        System.out.println(celsius);

    }

}
