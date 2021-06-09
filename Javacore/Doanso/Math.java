package Doanso;
import java.util.Scanner;
import java.util.Random;

public class Math {
    public void guessnumber() {
        Random r = new Random();
        int number = r.nextInt(100);

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Hãy đoán số hoặc gõ 'q' để thoát");
            String str = input.nextLine();
            if (str.equals("q")) {
                break;
            } else {
                int guessNumber = Integer.parseInt(str);
                if (guessNumber > number) {
                    System.out.println("Số bạn nhập vào lớn quá");
                } else if (guessNumber < number) {
                    System.out.println("Số bạn nhập vào nhỏ quá");
                } else {
                    System.out.println("Tuyệt bạn đoán đúng rồi " + number);
                }
            }
        }
        input.close();
    }
}
