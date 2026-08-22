
public class A3 {

    public static void main(String[] args) {
        int temperatures[] = {29, 37, 27, 83, 28, 93, 109};

        int total = 0;

        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day " + (i + 1) + " :" + temperatures[i]);
            total = total + temperatures[i];
        }

        double average = (double) total / temperatures.length;
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
