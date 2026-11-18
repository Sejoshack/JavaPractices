import java.util.Scanner;
public class test1{
    public static void main(String[]args) throws InterruptedException{
        Scanner scanner=new Scanner(System.in);
        int i;
        double mark,total=0,average;
        
        for(i=0;i<4;i++){
            System.out.print("Enter the marks:");
            Thread.sleep(1000);
            mark=scanner.nextInt();
            total+=mark;
        }
        System.out.println("Total marks is:"+total);
        average=total/4;
        if(average>=50){
            System.out.println("You have PASSED the test.");
        }else{
            System.out.println("You have FAILED the test.");
        }
        scanner.close();
    }
}