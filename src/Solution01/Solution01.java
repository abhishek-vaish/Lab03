package Solution01;

import java.util.Scanner;
// Harmonic Series

public class Solution01 {
    public static void main(String[] args) {
        double n;
        double sum = 0.0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextDouble();
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0 / i;
        }
        System.out.println(sum);
    }
}
