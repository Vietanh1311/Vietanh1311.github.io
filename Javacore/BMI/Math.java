package BMI;
import java.util.Scanner;

public class Math {
    public void guessBMI() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Hãy nhập chiều cao(1,xx) của bạn hoặc là ấn 0 để thoát :");
            float height = input.nextFloat();
            if (height == 0) {
                break;
            }
            System.out.println("Hãy nhập cân nặng của bạn hoặc có thể ấn 0 để thoát : ");
            float weight = input.nextFloat();
            float BMI = weight / (height * height);
            if (weight == 0) {
                break;
            } else {
                if (BMI < 18.5) {
                    System.out.println("Bạn đang nhẹ cân và cần bổ sung dinh dưỡng .");
                } else if (18.5 < BMI && BMI < 24.9) {
                    System.out.println("Bạn đang có một body cân đối .");
                } else if (25.0 < BMI && BMI < 29.9) {
                    System.out.println("Bạn đang thừa cân .");
                } else if (BMI > 30.0) {
                    System.out.println("Bạn đang quá béo và cân nặng của bạn có hại cho sức khỏe .");
                }
            }
        }
        input.close();
    }
}
