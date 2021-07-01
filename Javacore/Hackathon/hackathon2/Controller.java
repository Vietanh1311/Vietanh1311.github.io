package Hackathon.hackathon2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;


public class Controller {

    private LocalDate ngayGiaoDich;
    private long id;
    private ArrayList<String> lichSu=new ArrayList<String>();

    private static long balanceNumber = 5000000;
    
    
    
    public long getBalanceNumber(){
        return balanceNumber;
    }

    public static long transfer(long money){
        if(money < 50000){
            System.out.println("số tiền chuyển tối thiểu phải là 50.000");
        }
        else{
            if(money > balanceNumber){
                
                System.out.println("Tài khoản không đủ");
            }
            else{
                balanceNumber = balanceNumber-money;
                System.out.println("chuyển khoản thành công, in ra số dư mới và thêm lịch sử giao dịch mới");
            }
        }
        //Kiểm tra nếu số tiền nhỏ hơn 50.000 thì thông báo số tiền chuyển tối thiểu phải là 50.000 
        //Nếu số tiền chuyển lớn hơn số dư thì thông báo tài khoản không đủ
        //Nếu chuyển thành công, thì thông báo chuyển khoản thành công, in ra số dư mới và thêm lịch sử giao dịch mới
        return balanceNumber;

    }

    public void actionTransfer(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tài khoản: ");
        String soTKChuyen = scanner.next();
        System.out.println("Nhập số tiền muốn chuyển : ");
        long money =scanner.nextLong();
        System.out.println("Mô tả :");
        String Mota= scanner.next();
        // money = transfer(money);
        balanceNumber = transfer(money); 
        //  TransactionHistory giaoDich = new TransactionHistory();
        // //  giaoDich.nhap();
         this.id = IdGenerate.getNewID();
         DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        lichSu.add(id+" - "+ngayGiaoDich.now().format(myFormatter).toString()+" - "+Mota+" - "+soTKChuyen+" - "+money);
        
        
        //Thực hiện các công việc như nhập số tài khoản thụ hưởng, số tiền mô tả tại đây
    }

    public void getHistory(){
        //In danh sách lịch sử giao dịch
        System.out.println("Lịch Sử : ");
        lichSu.forEach(i-> System.out.println(i));
        
    }


    //Định dạng số tiền theo mình mong muốn
    public static String formatMoney(long money){
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        //100000->100,000.00
        return formatter.format(money);
        
    }


    

    
}
