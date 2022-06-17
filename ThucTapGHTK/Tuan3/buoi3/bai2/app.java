package buoi3.bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class app {
    /*
     * Tính số ngày sai lệch giữa hai thời điểm cho trước
     * Hướng dẫn:
     * B1: Nhập vào hai giá trị string
     * B2: Chuyển đổi các giá trị đầu vào từ String->Date qua lớp SimpleDateFormat
     * B3: Chuyển hai thời điểm thành mili giây
     * B4: Lấy trị tuyệt đối của hiệu hai mili giây này
     * B5: Chia cho số mili giây trong một ngày => DONE!
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mốc thời gian 1 theo định dạng ngày/tháng/năm : ");
        String start = scanner.nextLine();
        System.out.println("Nhập mốc thời gian 2 theo định dạng ngày/tháng/năm : ");
        String end = scanner.nextLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy MM dd");
        
        try {

            Date startDate = simpleDateFormat.parse(start);
            Date endDate = simpleDateFormat.parse(end);

            long startValue = startDate.getTime();
            long endValue = endDate.getTime();

            if (startValue <= endValue) {
                long tmp = Math.abs(startValue - endValue);

                long result = tmp / (24 * 60 * 60 * 1000);

                System.out.println("Số ngày chênh lệch : " + result + "ngày");

            } else {
                System.out.println("Ngày bắt đầu lớn hơn ngày kết thúc.");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
