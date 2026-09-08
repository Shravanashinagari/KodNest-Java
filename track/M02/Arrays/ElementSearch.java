
import java.util.Scanner;

public class ElementSearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] productCodes = new int[size];

        for (int i = 0; i < productCodes.length; i++) {
            productCodes[i] = scan.nextInt();
        }

        int targetCode = scan.nextInt();
        boolean found = false;

        for (int i = 0; i < productCodes.length; i++) {
            if (productCodes[i] == targetCode) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Product found");
        } else {
            System.out.println("Product not found");
        }
        scan.close();

    }
}
