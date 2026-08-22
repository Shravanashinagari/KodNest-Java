
class Student {

    String name;
    int age;
    double height;

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}

public class StudentApplication {

    public static void main(String[] args) {
        Student s1 = new Student("Shravana", 22, 5.2);//constructor

        Student s2 = new Student("Sonu", 21, 5.3);

        s1.display();
        s2.display();
    }
}
