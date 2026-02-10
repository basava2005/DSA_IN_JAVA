
import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price:");
        int cp=sc.nextInt();
        System.out.println("Enter Selling Price:");
        int sp =sc.nextInt();
        if(sp>cp)System.out.println("profit is :"+((sp-cp)/cp)*100+"%");
        else if(cp>sp)System.out.println("loss is :"+((cp-sp)/cp)*100+"%");
        else System.out.println("no profit no loss");
    }
}
