package track.staticPgms;

class Demo1 {
    static {
        System.out.println("1st Static Block");
    }
    static {
        System.out.println("2nd Static Block");
    }
    static {
        System.out.println("3rd Static Block");
    }

    {
        System.out.println("1st non static Block");
    }
    {
        System.out.println("2nd non static Block");
    }
    {
        System.out.println("3rd non static Block");
    }

    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        Demo1 d2 = new Demo1();
        Demo1 d3 = new Demo1();

    }
}
