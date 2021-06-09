package Palindrome;
import java.util.Scanner;
public class Math {
    public void Palindrome() {
        String str, reverseStr;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nhập chuỗi cần kiểm tra hoặc ấn q để thoát : ");
            str = scanner.nextLine();

            StringBuilder stringBuilder = new StringBuilder(str);

            // tạo 1 StringBuilder chứa các ký tự được khai báo trong stringBuilder
            StringBuilder stringBuilder1 = new StringBuilder(stringBuilder);
            stringBuilder1.reverse();

            // ngược lại không là chuỗi Palindmore
            if (str.equals("q")) {
                break;
            } else {
                // nếu stringBuilder giống stringBuilder1 sau khi đảo ngược
                // thì chuỗi nhập vào là chuỗi Palindmore
                if (stringBuilder.toString().equals(stringBuilder1.toString())) {
                    System.out.println(str + " là chuỗi Palindmore");
                } else {
                    System.out.println(str + " không là chuỗi Palindmore"); // ngược lại không là chuỗi Palindmore
                }
            }
        }

    }
}
