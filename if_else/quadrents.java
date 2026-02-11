
import java.util.Scanner;

public class quadrents {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the x");
        int X =sc.nextInt();
        System.out.println("enter the y");
        int Y = sc.nextInt();
        if(X==0 && Y==0){
            System.out.println("the point in origin");
        }else if(X!=0 && Y==0){
            System.out.println("the point is on x axis");
        }else if(X==0 && Y!=0){
            System.out.println("the point on Y axis");
        }else if(X>0 && Y>0){
            System.out.println("1st quadrent");
        }else if(X<0 && Y>0){
            System.out.println("2nd quadrent");
        }else if(X<0 && Y<0){
            System.out.println("3rd quadrent");
        }else if(X>0 && Y<0){
            System.out.println("4th quadrent");
        }

    }
}
