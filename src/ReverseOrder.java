import java.util.Scanner;
//6) Java Program to print the elements of an array in reverse order

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Elements ");
        int n= sc.nextInt();

        int[] array=new int[n];
        for (int i=0; i<n;i++){
            array[i]= sc.nextInt();
        }
        for (int i=n-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
