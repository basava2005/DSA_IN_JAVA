
import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter principal :");
        double p=sc.nextDouble();
        System.out.print("enter rate :");
        double r=sc.nextDouble();
        System.out.print("enter time :");
        double t=sc.nextDouble();
        double si=(p*r*t)/100;
        System.out.println("simple interest :"+si);

        sc.close();

    }
}
