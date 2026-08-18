
import java.util.Scanner;

public class pgm1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter Array Elements: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array Elements are: ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i] + " ");
        }

        int sum = 0;

        for (int i = 0; i <= a.length - 1; i++) {
            sum += a[i];
        }
        System.out.println("Total: " + sum);
    }
}
