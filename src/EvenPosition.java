import java.util.Scanner;
//5) Java Program to print the elements of an array present on an even position

public class EvenPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Elements ");
        int n= sc.nextInt();

        int[] array=new int[n];
        for (int i=0; i<n;i++){
            array[i]= sc.nextInt();
        }
        for (int i=0;i<n;i+=2){
            System.out.println(array[i]);
        }
    }
}
