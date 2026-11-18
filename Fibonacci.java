import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        long a = 1, b = 1;
        //long product = 1;

        for (int i = 0; i < n; i++) {
           // product *= a;   // multiply instead of display

            long next = a + b;
            a = b;
            b = next;
            System.out.println("fibonacci="+n);
        }

        //System.out.println("fibonacci="+n );

        input.close();
    }
}