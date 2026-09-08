import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int matrix[][] = new int[rows][columns];

        for (rows = 0; rows < matrix.length; rows++) {
            for (columns = 0; columns < matrix[rows].length; columns++) {
                matrix[rows][columns] = sc.nextInt();
            }
        }

        for (rows = 0; rows < matrix.length; rows++) {
            for (columns = 0; columns < matrix[rows].length; columns++) {
                if (columns > 0) {
                    System.out.print(" ");
                }
                System.out.print(matrix[rows][columns]);
            }
            System.out.println();
        }
        sc.close();

    }
}
