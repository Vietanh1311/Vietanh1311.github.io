package day2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Baitap {

    public void getName() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("nhập vào tên của bạn hoặc gõ q để thoát : ");
            String name = sc.nextLine();
            if (name.equals("q")) {
                break;
            } else if (name.length() < 3) {
                continue;
            } else {
                System.out.println("tên của bạn quá đẹp : " + name);
            }
        }
        sc.close();
    }

    public void guessname() {
        ArrayList<String> manNames = new ArrayList<>();

        manNames.add("Cường");
        manNames.add("Dũng");
        manNames.add("Thắng");
        manNames.add("Kiên");
        manNames.add("Long");
        manNames.add("Trung");
        manNames.add("Thành");
        manNames.add("Quân");

        List<String> womanNames = List.of("Hoa", "Lan", "Hương", "Hằng", "Thuỷ", "Dung");
        List<String> neutralNames = List.of("Bình", "Thanh", "Linh");

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào tên của bạn, hoặc gõ 'q' để thoát");
            String name = input.nextLine();
            if (name.equals("q")) {
                break;
            } else {
                // Kiểm tra nếu tên nằm trong danh sách tên của Nam
                for (String s : manNames) {
                    if (s.equals(name)) {
                        System.out.println("Nam giới");
                        break;
                    }
                }
                // Kiểm tra nếu tên nằm trong danh sách tên của Nữ
                for (String s : womanNames) {
                    if (s.equals(name)) {
                        System.out.println("Nữ giới");
                        break;
                    }
                }

                // Kiểm tra nếu tên nằm trong danh sách tên không rõ Nam hay Nữ
                for (String s : neutralNames) {
                    if (s.equals(name)) {
                        System.out.println("Giới tính của bạn là gì?");
                        String gender = input.nextLine();
                        System.out.println(name + " có giới tính là " + gender);
                        break;
                    }
                }
            }
        }
        input.close();
    }

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
                    System.out.println("Số bạn nhập vào lớn hơn");
                } else if (guessNumber < number) {
                    System.out.println("Số bạn nhập vào nhỏ hơn");
                } else {
                    System.out.println("Bạn đã đoán đúng số " + number);
                }
            }
        }
        input.close();
    }

    public void guessBMI() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Hãy nhập chiều cao(1,xx) của bạn hoặc là ấn 0 để thoát :");
            float height = input.nextFloat();
            System.out.println("Hãy nhập cân nặng của bạn : ");
            float weight = input.nextFloat();
            float BMI = weight / (height * height);
            if (height == 0) {
                break;
            } else {
                if (BMI <= 18.5) {
                    System.out.println("Bạn đang nhẹ cân và cần bổ sung dinh dưỡng .");
                } else if (18.5 <= BMI && BMI <= 24.9) {
                    System.out.println("Bạn đang có một body cân đối .");
                } else if (25.0 <= BMI && BMI <= 29.9) {
                    System.out.println("Bạn đang thừa cân .");
                } else if (BMI >= 30.0) {
                    System.out.println("Bạn đang quá béo và cân nặng của bạn có hại cho sức khỏe .");
                }
            }
        }
        input.close();
    }

    public void testemail() {

        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời bạn nhập email hoặc ấn q để thoát : ");
            String email = scanner.nextLine();
            if (email.equals("q")) {
                break;
            } else if (Pattern.matches(EMAIL_PATTERN, email) == true) {
                System.out.println("Bạn đã nhập đúng định dạng. ");
            } else {
                System.out.println("Bạn đã nhập sai định dạng .");
            }

        }

    }

}
