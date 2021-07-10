package Stream.baitapvenha;
import java.util.ArrayList;
import java.util.Scanner;
public class Repository {
    ArrayList<Phone> list ;
    public Repository(){
        list = new ArrayList<Phone>();
        list.add(new Phone(1 , "Oppo Reno5 8GB-128GB" , "Oppo Reno5 8GB-128GB", 8390000 , 10 , 7, "OPPO" , "Điện thoại"));
        list.add(new Phone(2 , "Oppo Reno4 Pro" ,  "Oppo Reno4 Pro" , 11490000 , 25 , 10 , "OPPO" , "Điện thoại"));
        list.add(new Phone(3 , "Samsung Galaxy Z Flip" , "Samsung Galaxy Z Flip", 20990000 , 10 , 3, "Samsung" , "Điện thoại"));
        list.add(new Phone(4 , "Oppo A92 " , "Oppo A92 ", 5990000 , 30  , 15, "OPPO" , "Điện thoại"));
        list.add(new Phone(5 , "Xiaomi Redmi 9 4GB-64GB" , "Xiaomi Redmi 9 4GB-64GB",  3190000 , 30 , 25, "Xiaomi" , "Điện thoại"));
        list.add(new Phone(6 , "Asus Zenbook UX325EA-EG079T" , "Asus Zenbook UX325EA-EG079T", 20790000  , 10 , 6, "Asus" , "Laptop"));
        list.add(new Phone(7 , "Dell G3 15 i5 10300H" , "Dell G3 15 i5 10300H",  21840000 , 11 , 2, "Dell" , "Laptop"));
        list.add(new Phone(8 , "Dell Inspiron N7501 i7 10750H" , "Dell Inspiron N7501 i7 10750H",  28970000 , 5 , 2, "Dell" , "Laptop"));
        list.add(new Phone(9 , "iPhone 12 Pro Max 128GB" , "iPhone 12 Pro Max 128GB", 30990000 , 13 , 2, "Iphone" , "Apple"));
        list.add(new Phone(10 , "MacBook Air 13 2020 M1 16GB/256GB" , "MacBook Air 13 2020 M1 16GB/256GB", 33990000 , 5 , 2, "Iphone" , "Apple"));
        list.add(new Phone(11 , " Loa bluetooth Compact 2 " , " Loa bluetooth Compact 2 ", 290000 , 20 , 7, "Xiaomi" , "Phụ kiện"));
        list.add(new Phone(12 , " Loa bluetooth i.value BT116 " , " Loa bluetooth i.value BT116", 290000 , 20 , 7, "Xiaomi" , "Phụ kiện"));
        list.add(new Phone(13, "Vivo Y20 4GB-64GB" , "Vivo Y20 4GB-64GB", 3690000 , 10 , 7, " Vivo" , "Điện thoại"));


    }
    public void print() {
        list.forEach(phone -> System.out.println(phone));
    }
    public void dienthoai(){
        list.stream()
        .filter(dienthoai -> dienthoai.getDirectory() == "Điện thoại")
        .forEach(dienthoai -> System.out.println(dienthoai));
    }
    public void Laptop(){
        list.stream().filter(laptop -> laptop.getDirectory()=="Laptop")
        .forEach(laptop -> System.out.println(laptop));
    }
    public void Apple(){
        list.stream().filter(apple -> apple.getDirectory()=="Apple")
        .forEach(apple -> System.out.println(apple));
    }
    public void Phukien(){
        list.stream().filter(phukien -> phukien.getDirectory()=="Phụ kiện")
        .forEach(phukien -> System.out.println(phukien));
    }
    public void gia(){
        list.stream().filter(gia -> gia.getPrice()<2000000)
        .forEach(gia -> System.out.println(gia));
    }
    public void gia2(){
        list.stream().filter(gia2 -> (gia2.getPrice()>2000000 && gia2.getPrice()<4000000))
        .forEach(gia2 -> System.out.println(gia2));
    }
    public void gia3(){
        list.stream().filter(gia3 -> gia3.getPrice()>4000000).filter(gia3 -> gia3.getPrice()<7000000)
        .forEach(gia3 -> System.out.println(gia3));
    }
    public void gia4(){
        list.stream().filter(gia4 ->( gia4.getPrice()>7000000 && gia4.getPrice()<13000000))
        .forEach(gia4-> System.out.println(gia4));
    }
    public void gia5(){
        list.stream().filter(gia5 -> gia5.getPrice()>13000000)
        .forEach(gia5 -> System.out.println(gia5));
    }
    public  void timkiem() {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        list.stream().filter(i -> (i.getName().equals(str))).forEach(i -> System.out.println(i));
        

    }
    
    
    
}
