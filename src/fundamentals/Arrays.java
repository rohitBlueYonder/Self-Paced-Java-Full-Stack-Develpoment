package fundamentals;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        //WAP to print sum of n nos
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of integer: ");
        int n = sc.nextInt();
        arr = new int[n];

        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i] = i+4;
            sum+=arr[i];
        }
        System.out.println("Sum is: "+ sum);
        System.out.println("Size of array is: "+arr.length);


    }
}
