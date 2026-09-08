
import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int FrequencyArray[] = new int[size];

        for (int i = 0; i < FrequencyArray.length; i++) {
            FrequencyArray[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int freq = 0;

        for (int i = 0; i < FrequencyArray.length; i++) {
            if (FrequencyArray[i] == target) {
                freq++;
            }
        }

        System.out.println("Frequency: " + freq);

        if (freq == 0) {
            System.out.println("Frequency absent");
        } else if (freq == 1) {
            System.out.println("Frequency appears once");
        } else {
            System.out.println("Frequency appears multiple times");
        }
        sc.close();
    }
}
