
import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age,i=0,j;
        System.out.print("Enter your age in years:");
        age=scanner.nextInt();
        if(age>=18){
            System.out.print("You are eligible to register.");
        }else{
            System.out.print("you are not eligible to register.");
        }
        scanner.close();
        
        while(i<5){
            j=i;
            while(j<5){
                System.out.print("A");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
