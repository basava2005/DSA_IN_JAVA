
import java.util.Scanner;

public class elseIfcondithon {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("basvaraj suresh");
        }else if(n%3==0){
            System.out.println("suresh");
        }else if(n%5==0){
            System.out.println("basvaraj");
        }else{
            System.out.println("invalid");
        }
        sc.close();
    }
}
