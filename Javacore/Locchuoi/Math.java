package Locchuoi;
import java.util.Scanner;
import java.util.List;

public class Math {
    public void Locchuoi() {
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
