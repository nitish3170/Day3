import java.util.Scanner;
//4) Java Program to print the smallest element in an array

import static java.lang.System.exit;
public class SmalestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Elements ");
        int n= sc.nextInt();

        if(n==0)exit(0);

        int[] array=new int[n];
        for (int i=0; i<n;i++){
            array[i]= sc.nextInt();
        }
        int minimum=Integer.MAX_VALUE;
        for (int i=0; i<n;i++){
            if (minimum>array[i])minimum=array[i];
        }
        System.out.printf("Minimum value: %d",minimum);
    }
}
