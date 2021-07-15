package Thread;

import java.util.ArrayList;
import java.util.Scanner;
public class Repository {
    ArrayList<Laptrinhvien> list ;
    public Repository(){
        list = new ArrayList<Laptrinhvien>();
        list.add(new Laptrinhvien("1", "Nguyễn Việt ANh", 20 , 123456789 , "va@gmail.com", 2000000, 60));
        list.add(new Laptrinhvien("2", "Nguyễn Minh An", 20 , 123456789 , "va@gmail.com", 2000000, 50));
        list.add(new Laptrinhvien("3", "Nguyễn Thành Trung", 25 , 123456789 , "va@gmail.com", 2000000, 70));
        list.add(new Laptrinhvien("4", "Nguyễn Quang Tùng", 21 , 123456789 , "va@gmail.com", 2000000, 80));
        list.add(new Laptrinhvien("5", "Nguyễn Công Khanh", 26 , 123456789 , "va@gmail.com", 2000000, 40));
        list.add(new Laptrinhvien("6", "Chử văn Long", 21 , 123456789 , "va@gmail.com", 2000000, 50));
        list.add(new Laptrinhvien("7", "Bùi Giáng Sơn", 28 , 123456789 , "va@gmail.com", 2000000, 60));


    }
    public void print() {
        for (Laptrinhvien nhanvien : list) {
            System.out.println(nhanvien);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}
