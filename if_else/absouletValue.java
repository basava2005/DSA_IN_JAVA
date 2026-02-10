
import java.util.Scanner;

public class absouletValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
         int num = sc.nextInt();
        //  if(num<0){
        //     num =-1*num;
        //     System.out.println("absolute value is :"+num);
        //  }
        //  else{
        //     System.out.println("absolute value is :"+num);
        //  }
        // if(num>=0)System.out.println("absolute value is :"+num);
        // else System.out.println(-num +" is absolute value");
        if(num<0)num=-num;
        System.out.println("absolute value is :"+num);
    }
}
