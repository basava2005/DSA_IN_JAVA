
import java.util.Scanner;

public class fourDingitnumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();

        if(n>999 && n<10000){
            System.out.println("four digit number");

        }else{
            System.out.println("not a four digit number");

        }
        sc.close();
    }
}
