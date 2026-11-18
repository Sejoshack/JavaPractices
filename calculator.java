import java.util.Scanner;

public class calculator{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1,num2,result=0;
        boolean validoperation=true;
        char operator;
        System.out.print("Enter the first number: ");
        num1=scanner.nextDouble();
        System.out.print("Enter the second number: ");
        num2=scanner.nextDouble();
        System.out.print("Enter the operator(+,-,*,/,^): ");
        operator=scanner.next().charAt(0);
        
        switch(operator){
            case '+'->result=num1+num2;
            case '-'->result=num1-num2;
            case '*'->result=num1*num2;
            case '/'->{
                if(num2==0){
                    System.out.println("Division by zero is not allowed.");
                    validoperation=false;
                }else{
                    result=num1/num2;
                }
            }
            case '^'->result=Math.pow(num1,num2);
            default->{
                System.out.println("invalid operation");
                validoperation=false;
            }
        }
        if(validoperation){
            System.out.println(result);
        }
        
        String name;
        name= scanner.nextLine();
        while(name.isEmpty()){
            System.out.print("Enter your name:");
            name= scanner.nextLine();
        }
        System.out.print("Hello "+name + " good math their dude...congra!");        

        scanner.close();
       
    }
}