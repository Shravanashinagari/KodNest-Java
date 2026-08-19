
class S {

    String name;
    int age;

    S(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Student {

    public static void main(String[] args) {
        S s1 = new S("Shravana", 21);
        s1.display();
        S s2 = new S("Kavya", 22);
        s2.display();

    }
}
