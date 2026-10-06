package track.staticPgms;

class Demo {
    static int count = 0;

    Demo() {// here we can use non-static block or constructor both
        count++;
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        Demo d4 = new Demo();
        Demo d5 = new Demo();
        System.out.println("Number of objects: " + Demo.count);
    }
}
