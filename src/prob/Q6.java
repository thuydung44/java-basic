package prob;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        // for문으로 5번 입력받기
        for (int i = 0; i < 5; i++) {
            nums[i] = scanner.nextInt();
        }
        // 최대값 위치
        int maxIdx = 0;
        for (int  i = 0;  i < 5;  i++) {
            // 현제 최대값보다
            // nums[maxIdx]는
            if (nums[maxIdx] < nums[i]){
                maxIdx = i;
            }

        }
        System.out.println(maxIdx);

    }
}
