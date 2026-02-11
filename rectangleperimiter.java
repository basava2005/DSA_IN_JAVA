import java.util.Scanner;

public class rectangleperimiter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int L=sc.nextInt();
        System.out.println("enter the breadth of rectangle");
        int B = sc.nextInt();
        int area =L*B;
        int perimiter=2*(L+B);
        if(area>perimiter){
            System.out.println("area is greater then the perimiter");

        }else if(perimiter>area){
            System.out.println("perimiter is greater then the area");

        }else{
            System.out.println("area and perimiter are equal");
        }
    }
}
