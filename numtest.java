import java.util.Scanner;
import java.util.Random;

public class numtest{
    public static void main(String[]args){
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your number for testing:");
        num =scanner.nextInt();
        if(num>0){
            System.out.println("The number is POSITIVE");
        }else if(num<0){
            System.out.println("The number is NEGATIVE");
        }else{
            System.out.println("The number is ZERO");
        }
        Double result=Math.pow(num,2);
        System.out.println(result);
        scanner.close();
    }
}