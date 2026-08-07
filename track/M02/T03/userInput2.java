
import java.util.Scanner;

public class userInput2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("enter your height: ");
        float height = sc.nextFloat();
        System.out.println("your height is: " + height);

        sc.nextLine();//this reads the above left line 

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
    }
}
