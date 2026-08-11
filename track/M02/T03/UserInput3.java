
import java.util.Scanner;

public class UserInput3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        char ch = sc.next().charAt(3);
        System.out.println("your name is: " + ch);

    }
}
