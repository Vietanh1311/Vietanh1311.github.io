package day2;

import java.util.Scanner;
import java.util.List;

public class Nangcao {
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

    public static void Locchuoi() {
        List<String> chuoibay = List.of("fuck", "sex", "rape", "shit", "bitch", "damn");

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào chuỗi hoặc gõ 'q' để thoát");
            String chuoi = input.nextLine();
            if (chuoi.equals("q")) {
                break;
            } else {
                for (int i = 0; i < chuoibay.size(); i++) {
                    // Kiểm tra xem chuoi co bay hay khong
                    if (chuoi.contains(chuoibay.get(i))) {
                        String tam = chuoibay.get(i);
                        tam = tam.replace(tam.charAt(1), '*');
                        chuoi = chuoi.replace(chuoibay.get(i), tam);
                    }
                }
            }
            System.out.println("chuỗi sau khi sửa lại là : " + chuoi);
        }
    }

}
