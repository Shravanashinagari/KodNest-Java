package track.M02.PracticeQuestions;

public class SuffixSum {
    public static void main(String[] args) {
        int a[] = { 25, 20, 30, 40, 55 };

        int n = a.length;
        int suffix[] = new int[n];

        suffix[n - 1] = a[n - 1];

        for (int i = n - 1; i > 0; i--) {
            suffix[i - 1] = suffix[i] + a[i - 1];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(suffix[i] + "");
        }
    }
}
