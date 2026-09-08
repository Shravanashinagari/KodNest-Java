package track.Strings;

public class Stringpgm2 {
    public static void main(String[] args) {
        String str = " KodNest Technologies  ";

        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(3));
        System.out.println(str.contains("Kod"));
        System.out.println(str.contains("logies"));
        System.out.println(str.startsWith("Kod"));
        System.out.println(str.startsWith("Nest"));
        System.out.println(str.endsWith("Kod"));
        System.out.println(str.endsWith("logies"));
        System.out.println(str.indexOf('K'));
        System.out.println(str.indexOf('e'));
        System.out.println(str.length());
        System.out.println(str.replace('e', 'E'));
        System.out.println(str.trim());
        System.out.println(str.substring(4));
        System.out.println(str.substring(4, 7));
        System.out.println(str.substring(0, 3));

        String s2 = "Raja";
        System.out.println(s2.isBlank());// false
        System.out.println(s2.isEmpty());// false

        String s3 = " ";
        System.out.println(s3.isBlank());// true
        System.out.println(s3.isEmpty());// false

        String s4 = "";
        System.out.println(s4.isBlank());// true
        System.out.println(s4.isEmpty());// true
    }
}
