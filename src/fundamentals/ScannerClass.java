package fundamentals;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        // methods
        // nextInt(), nextDouble(), nextFloat(), nextByte(), nextShort()
        // nextInt() generates InputMismatchException

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("Age is: "+age);

        //....................................................................................
        //Accepting Strings
        // methods
        // next(), nextLine()

        Scanner kb= new Scanner(System.in);
        System.out.println("Enter name:");
        String name = kb.next();
        System.out.println("with next() name is: "+ name);;

        // to flush
        kb.nextLine();

        System.out.println("Enter name again:");
        String againName = kb.nextLine();
        System.out.println("with nextLine() name is: "+againName);

    }
}
