package prob;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Array(배열) 데이더를 담아줄
        int[] nums = new int[5];
        /*
        nums[0] = scanner.nextInt();

         */
         int count = 0;
         while (count < 5) {
             nums[count] = scanner.nextInt();
             count++;
         }
         for (int i = 0; i < 5; i++){
             nums[i] = scanner.nextInt();
         }

    }
}
