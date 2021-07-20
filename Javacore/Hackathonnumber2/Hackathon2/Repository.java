package Hackathonnumber2.Hackathon2;

import java.util.ArrayList;
import java.util.Scanner;


public class Repository {
    ArrayList<Customer> list;
    Validate validate = new Validate();

    public Repository() {
        list = new ArrayList<Customer>();
        list.add(new Customer(123456789, "Nguyễn Việt Anh ", "21-01-2001", "male", "Việt Nam", "372206089",
                "nva@gmail.com"));
        list.add(
                new Customer(113432335, "Nguyễn Minh An ", "2-10-2001", "male", "Việt Nam", "034341234", "An@gmail.com"));
        list.add(
                new Customer(241343512, "David Mousth ", "1-07-2003", "male", "America", "124423545", "David@gmail.com"));
        list.add(new Customer(231442315, "Jessica Talon ", "11-06-1999", "female", "England", "0124342352",
                "Jessica@gmail.com"));
        list.add(new Customer(123456789, "Nguyễn Thị Hương ", "12-11-2001", "female", "Việt Nam", "013343415",
                "Huong@gmail.com"));
        list.add(new Customer(123456789, "Bùi Thị Thảo ", "19-10-2001", "female", "Việt Nam"," 0523421312",
                "Thao@gmail.com"));
        list.add(new Customer(574563435, "Tạ Thành Nhật ", "12-01-2001", "male", "Việt Nam", "0121230210",
                "Nhat@gmail.com"));
        list.add(new Customer(963459232, "Vũ Tiến Đạt ", "19-01-2001", "male", "Việt Nam", "012312411", "Dat@gmail.com"));
        list.add(new Customer(472329340, "Đỗ Thị Ngọc Anh ", "14-05-1998", "female", "Việt Nam", "0121244235",
                "Anh@gmail.com"));
        list.add(new Customer(457293423, "Đỗ Thị Thảo Diệp ", "10-03-2001", "female", "Việt Nam"," 092341123",
                "Diep@gmail.com"));
        list.add(new Customer(569456353, "Lê Hoài Nam", " 9-05-2001", "male", "Việt Nam", "0543234235", "Nam@gmail.com"));
        list.add(new Customer(582359242, "Nguyễn Ngọc Thiện", " 2-11-2001", "male", "Việt Nam", "0234232034",
                "Thien@gmail.com"));
        list.add(new Customer(959645624, "Linda Swith", "10-01-1997", "male", "France", "0312413413", "Linda@gmail.com"));

    }

    public void print() {
        list.forEach(customer -> System.out.println(customer));
    }

    public void Sex1() {
        list.stream().filter(Male -> Male.getSex() == "male").forEach(Male -> System.out.println(Male));
    }

    public void Sex2() {
        list.stream().filter(female -> female.getSex() == "female").forEach(female -> System.out.println(female));
    }

    public void AddCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Mời bạn nhập số cmt hoặc cccd");
        int customerCode = input.nextInt();
        System.out.println("Mời bạn nhập tên :");
        String name = input.nextLine();
        System.out.println("Mời bạn nhập ngày tháng năm sinh :");
        String dateOfBirth = input.nextLine();
        System.out.println("Mời bạn nhập giới tính");
        String sex = input.nextLine();
        System.out.println("Mời bạn nhập quốc tịch :");
        String country = input.nextLine();
        System.out.println("Mời bạn nhập số điện thoại : ");
        String phoneNumber = input.nextLine();
        validate.validateMobile(phoneNumber);
        System.out.println("Mời bạn nhập email :");
        String email = input.next();
        validate.validateEmail(email);
        
        list.add(new Customer(customerCode, name, dateOfBirth, sex, country, phoneNumber, email));

    }

    public void SearchByCode() {
        System.out.println("Mời bạn nhập mã khách hàng : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        list.stream().filter(code -> code.getCustomerCode() == n).forEach(code -> System.out.println(code));
        
    }
}
