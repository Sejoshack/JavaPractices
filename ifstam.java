
import java.util.Scanner;

public class ifstam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        System.out.print("Type in your email: ");
        email = scanner.nextLine();

        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println(username);
        System.out.println(domain);

        scanner.close();
        
        /*if (email.contains("@")){
            printf("%s",email);
            print("\n");
        }
        continue;*/

    }
}
