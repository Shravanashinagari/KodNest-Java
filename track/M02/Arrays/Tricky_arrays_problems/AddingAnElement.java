import java.util.Scanner;

public class AddingAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int a[] = new int[size];
        int b[] = new int[size + 1];

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        b[size] = 5;

        for (int i = 0; i < size; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        sc.close();
    }
}
