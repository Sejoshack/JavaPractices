import java.util.Scanner;
import java.util.Random;

public class brocode{
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);//used to enable user enter a variable
        System.out.print("Enter your name: ");
        String name=scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age=scanner.nextInt();
        
        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old.");
        
        scanner.close();
        
        Random random=new Random();
        int num;
        double result;
        result=Math.pow(8,2);
        result =Math.sqrt(9);
        result =Math.max(10,20);
        num=random.nextInt();
        System.out.println(result);
        System.out.println(num);
        System.out.printf("%03.4f",Math.PI);
    } 
}