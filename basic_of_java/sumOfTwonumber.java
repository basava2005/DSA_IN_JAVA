
import java.util.Scanner;

public class sumOfTwonumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter 1st number :");
        int a=sc.nextInt();
        System.out.print("enter 2nd number :");
        int b=sc.nextInt();
        System.out.print("enter 3rd number :");
        int c = sc.nextInt();
        int sum =a+b+c;
        System.out.println("sum of three number is :"+sum);
        sc.close();

    }
}
