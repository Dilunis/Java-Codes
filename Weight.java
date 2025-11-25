import java.util.Scanner;
public class Weight {
    public static void main(String []args){
     Scanner scan=new Scanner(System.in);
     
     System.out.print("Enter weight:");
     double weight=scan.nextDouble();
     
     double fullCharge= weight<=5 ? 500:500+(weight-5)*100;
     System.out.println("Full Charge:"+fullCharge);
        
    }
}
