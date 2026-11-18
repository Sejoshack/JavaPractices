
import java.util.Scanner;

public class shopsimple {

    public static void main(String[] args) {
        int quantity;
        double price, total;
        String item;

        Scanner scanner = new Scanner(System.in);
        System.out.print("What do oyu want to buy: ");
        item = scanner.nextLine();
        System.out.print("The price of @ is : ");
        price = scanner.nextDouble();
        System.out.print("How many do you want: ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("You need to pay $" + total + " for your items.");

        scanner.close();
    }
}
