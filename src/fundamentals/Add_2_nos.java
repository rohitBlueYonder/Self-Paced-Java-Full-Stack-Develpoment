package fundamentals;

import java.util.Scanner;

public class Add_2_nos {
    public static void main(String[] args) {
// Command Line Method
        // parseInt generated NumberFormatException
//            int a  = Integer.parseInt(args[0]);
//            int b = Integer.parseInt(args[1]);
//            int c = a+b;
//        System.out.println("Sum is: "+c);


        //Using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 nos: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum is: "+(a+b));
    }
}
