
public class StudentApplication {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.rollNo = 101;
        s1.name = "asha";
        s1.height = 5.6;

        System.out.println("rollNo: " + s1.rollNo);
        System.out.println("name: " + s1.name);
        System.out.println("height: " + s1.height);

        s1.run();
        s1.sleep();

        System.out.println("==================================");

        Student s2 = new Student();

        s2.rollNo = 102;
        s2.name = "Deepa";
        s2.height = 5.1;

        System.out.println("rollNo: " + s2.rollNo);
        System.out.println("name: " + s2.name);
        System.out.println("height: " + s2.height);

        s2.run();
        s2.sleep();

    }
}
