package Testemail;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Math {
    public void testemail() {

        String EMAIL_PATTERN = "^(.+)@(.+)$";

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời bạn nhập email hoặc ấn q để thoát : ");
            String email = scanner.nextLine();
            if (email.equals("q")) {
                break;
            } else if (Pattern.matches(EMAIL_PATTERN, email) == true) {
                System.out.println("Bạn đã nhập đúng định dạng email. ");
            } else {
                System.out.println("Bạn đã nhập sai định dạng email .");
            }

        }

    }
}
