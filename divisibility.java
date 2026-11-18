
import java.util.Scanner;

public class divisibility{
    public static void main(String[]args){
        Scanner scanner=new Scanner (System.in);
        int max,min,i;
        System.out.print("Enter maximum no:");
        max=scanner.nextInt();
        System.out.print("Enter minimum no:");
        min=scanner.nextInt();
        while(min<0||max<0){
            System.out.println("Try again with positive numbers.");
            System.out.print("Enter maximum no:");
            max=scanner.nextInt();
            System.out.print("Enter minimum no:");
            min=scanner.nextInt();
        }
        System.out.println("The divisible numbers by 3 are:");
        for(i=max;i>min;i--){
            if(i%3==0){
                System.out.println(i);
            }
        }
        
   
        scanner.close();
    }
}