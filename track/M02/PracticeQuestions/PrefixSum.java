package track.M02.PracticeQuestions;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int prefixSum[] = new int[n];

        prefixSum[0] = a[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + a[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(prefixSum[i] + " ");
        }
    }

}
