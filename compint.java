import java.util.Scanner;
public class compint{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        double principle,rate,amount;
        int times,year;
        
        System.out.print("Enter the principle: ");
        principle=scanner.nextDouble();
        System.out.print("Enter the rate (in %): ");
        rate=scanner.nextDouble();
        rate/=100.0;
        System.out.print("Enter the no. of years: ");
        year=scanner.nextInt();
        System.out.print("Enter the times compounded per year: ");
        times=scanner.nextInt();
        
        amount=principle*Math.pow(1+rate/times,times*year);
        System.out.printf("The amount is : $%.2f",amount);
        scanner.close();
        
    }
}