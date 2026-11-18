import java.util.Scanner;
public class nestedif{
    public static void main(String []args){
        int age;
        boolean isCitizen=false;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your age:");
        age=sc.nextInt();
        if(isCitizen){
            System.out.println("You have passed the first qualificaton.");
            if(age>=18){
                System.out.println("You are old enough to vote.");
            }else{
                System.out.println("Not old enough to vote.");
            }
        }else{
            System.out.println("You must be a citizen to vote.");
        }
        
    }
}