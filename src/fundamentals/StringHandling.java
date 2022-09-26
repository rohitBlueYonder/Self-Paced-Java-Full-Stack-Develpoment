package fundamentals;

public class StringHandling {
    public static void main(String[] args) {
        String s1 = "Rohit";
        String s3 = "rohit";
        String s2 = new String("Rai");
        System.out.println(s1+" "+s2);
        System.out.println(s1==s2);

        // string methods
        // length()
        // charAt()
        // equals() -> method, compare content, member of string class, true/false
        // == -> operator, compare address, not a member of String class
        // equalsIgnoreCase()

        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
