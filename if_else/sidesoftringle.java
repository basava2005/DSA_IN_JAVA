
import java.util.Scanner;

public class sidesoftringle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first side of triangle");
        int a=sc.nextInt();
        System.out.println("enter the second side of triangle");
        int b = sc.nextInt();
        System.out.println("enter the third side of triangle");
        int c= sc.nextInt();
        if(a+b>c&&a+c>b&&b+c>a){
            System.out.println("the sides can form a triangle");
        }else{
            System.out.println("the sides can not form a triangle");
        }
    }
}