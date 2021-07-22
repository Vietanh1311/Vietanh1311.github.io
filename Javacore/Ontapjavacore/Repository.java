package Ontapjavacore;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Collections;
import java.util.Comparator;
public class Repository<T> {
    ArrayList<Product> list;

    public Repository(){
        list = new ArrayList<Product>();
        list.add(new Product( "thịt lợn", "đồ ăn ", 1000, 100000, 500));
        list.add(new Product( "nồi cơm", "đồ gia dụng ", 5000, 1500000, 700));
        list.add(new Product( "tủ lạnh", "đồ gia dụng ", 3000, 2000000, 700));
        list.add(new Product( "kem trắng da", "mỹ phẩm ", 2000, 200000, 300));
        list.add(new Product( "áo sơ mi", "thời trang", 3000, 160000, 1000));
        list.add(new Product( "quần jean", "thời trang", 2000, 190000, 600));
        list.add(new Product( "rau cải", "đồ ăn ", 200, 10000, 100));
        list.add(new Product( "thịt gà", "đồ ăn ", 700, 150000, 500));
        list.add(new Product( "kem nền", "mỹ phẩm ", 1000, 110000, 200));
        list.add(new Product( "ti vi", "đồ gia dụng ", 1000, 100000, 500));
        list.add(new Product( "áo khoác", "thời trang", 500,400000,200));
        list.add(new Product( "son môi", "mỹ phẩm ", 200,90000,70));
    }
    public void print() {
        list.forEach(product -> System.out.println(product));
    }
    public void add(){
        Scanner input = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên: ");
        String name = input.nextLine();
        System.out.println("Mời bạn nhập kiểu(thời trang,đồ gia dụng,..): ");
        String type = input.nextLine();
        System.out.println("Mời bạn nhập số lượng :");
        int quantity = input.nextInt();
        System.out.println("Mời bạn nhập giá bán : ");
        int price = input.nextInt();
        System.out.println("Mời bạn nhập số lượng đã bán: ");
        int quantitysold = input.nextInt();
        
        list.add(new Product(name, type, quantity, price, quantitysold));

    }
    public Optional<Product> findById(Long id) {
        return list.stream().filter(p -> p.getId().equals(id)).findFirst();
    }
    public void deleteByID(Long id) {
        Iterator<Product> itr = list.iterator();
        while (itr.hasNext()) {
          Product item = itr.next();
          if (item.getId().equals(id)) {
            itr.remove();
          }
        }
      }
      public void update(T t) {
        for (int i = 0; i < list.size(); i++) {
          if (list.get(i).getId().equals(((Product) t).getId())) {
            list.set(i, (Product) t);
          }
        }
      }
    public void printtoname() {
        list.stream().sorted().forEach(product -> System.out.println(product));
    }
    public void case5() {
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        for (Product product : list) {
            map.put(product.getName(), product.getPrice() * product.getQuantitysold());
        }
        System.out.println("\nSố tiền bán được là : ");
        map.forEach((k, v) -> System.out.println(k + " - tổng Tiền bán được: "+ v  ));
    }
    public void dogiadung(){
        list.stream()
        .filter(i -> i.getType() == "đồ gia dụng ")
        .forEach(i-> System.out.println(i));
    }
    public void thoitrang(){
        list.stream()
        .filter(i -> i.getType() == "thời trang")
        .forEach(i-> System.out.println(i));
    }
    public void mypham(){
        list.stream()
        .filter(i -> i .getType() == "mỹ phẩm ")
        .forEach(i -> System.out.println(i ));
    }
    public void doan(){
        list.stream()
        .filter(i -> i .getType() == "đồ ăn ")
        .forEach(i -> System.out.println(i ));
    }
    public void vehinhchunhat() {
        String[][] a = new String[100][100];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                a[i][j] = " * "; // gán mảng 2 chiều bằng * với i là hàng còn j là cột
            }
        }
        System.out.print("Nhập chiều rộng  : ");
        int A = sc.nextInt();
        System.out.print("Nhập chiều cao : ");
        int B = sc.nextInt();
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                if (j==0 || i==A-1 || j==B-1 || i==0) {
                System.out.print(a[i][j]+ "");
                }
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
    public void SortName() {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
            }
        });
    }
      
}
