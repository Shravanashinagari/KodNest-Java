import java.util.Scanner;

public class InsertElementAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        int b[] = new int[size + 1];

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        int index = 2;
        int element = 22;

        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }

        b[index] = element;

        for (int i = index; i < a.length; i++) {
            b[i + 1] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        sc.close();
    }
}
