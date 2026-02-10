
import java.util.Scanner;

public class total_surface_area {
    public static void main(String[] args) {
        //double l=10,b=15,h=13;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length: ");
        double l=sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b=sc.nextDouble();
        System.out.print("Enter heigth: ");
        double h=sc.nextDouble();
        double tsa=2*(l*b+b*h+h*l);//tsa=2(lb+bh+lh)
        System.out.println("Total Surface Area of Cuboid :"+tsa);
        sc.close();
    }
}
