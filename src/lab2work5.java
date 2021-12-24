package lab2;

import java.util.Scanner;

public class lab2work5 {
    public static void main(String[] args) {
        int x, y, z, q;
        double x3, y3, z3, N;
        System.out.println("n=");
        int n = new Scanner(System.in).nextInt();
        q=0;
        for (x = 1; x < n; x++) {
            x3 = Math.pow(x, 3);
            for (y = 1; y < n; y++) {
                y3 = Math.pow(y, 3);
                for (z = 1; z < n; z++) {
                    z3 = Math.pow(z, 3);
                    N = x3 + y3 + z3;
                    if (N == n) {
                        System.out.println(x + "^3 + " + y + "^3 + " + z + "^3 = " + N);
                    q=1;
                    }
                    }
                }
            }
        if (q != 1) {
            System.out.println("No such combinations!");
        }
    }
}
