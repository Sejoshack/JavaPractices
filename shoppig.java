
import java.util.Scanner;

public class shoppig {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items={"good1","good2","good3","good4"};
        int quantity, i;
        double price, total=0, cost;

        for (i = 0; i < 4; i++) {
            System.out.print(items[i] + ":");
            price = scanner.nextDouble();
            System.out.print("Quantity:");
            quantity = scanner.nextInt();
            cost = price * quantity;
            total += cost;
        }
        System.out.println("The total amount is " + total);

        scanner.close();
    }
}
