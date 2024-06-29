package d2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int m = A / B;
        int n = A % B;
        System.out.println(A + "=" + m + "*" + B +  "+" + n);
    }
}
