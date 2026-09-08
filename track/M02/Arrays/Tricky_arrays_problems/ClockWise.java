
public class ClockWise {
    public static void main(String[] args) {
        int a[] = { 22, 33, 44, 55 };
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

        int temp = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }

        a[0] = temp;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
