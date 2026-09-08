import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int a[] = new int[size];
        int b[] = new int[size - 1];

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        int index = 3;
        int element = 22;

        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }

        for (int i = index; i < a.length - 1; i++) {
            b[i] = a[i + 1];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        sc.close();
    }
}
