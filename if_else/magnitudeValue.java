
import java.util.Scanner;

public class magnitudeValue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int m;
        if(n<69){
            m=-n;
            
        }else{
            m=n;
        }
        if(m<69){
            System.out.println("the magnitude value is :"+m);
        }else{
            System.out.println("not magnitude");
        }
    }
}

/* using methodes   
if(math.abs(n)<69){
    System.out.println("the magnitude value is :"+math.abs(n));
}else{
    System.out.println("not magnitude");
}

*/
