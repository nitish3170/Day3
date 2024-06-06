import java.util.Scanner;
//1) Java Program to print the elements of an array
public class PrintElements {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number Of Elements ");
        int n= sc.nextInt();
        int[] array=new int[n];
        for (int i=0; i<n;i++){
            array[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }

    }
}
