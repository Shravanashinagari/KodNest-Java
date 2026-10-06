package track.constructors;

class Parent {
    int a = 10;
}

class child extends Parent {
    int a = 20;

    void disp2() {
        System.out.println("Parent a: " + super.a);
        System.out.println("Child a: " + a);
    }
}

public class pgm2 {
    public static void main(String[] args) {
        child c = new child();
        c.disp2();
    }

}
