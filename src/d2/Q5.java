package d2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        System.out.println(temperature > 20 && temperature < 30);

    }
}
