package Lambda.baitap;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;



public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1, "Tivi Samsung", 16000000, "Tivi màn hình cong", 80));
        list.add(new Product(2, "Tivi Sony", 1800000, "Tivi màn 4k", 50));
        list.add(new Product(3, "Tủ lạnh panasonic", 7000000, "Tủ lạnh cỡ lớn", 70));
        list.add(new Product(4, "Điều Hòa inverter", 22000000, "Điều hòa 2 chiều", 30));
        list.add(new Product(5, "Máy giặt panasonic", 5000000, "Máy giặt cửa trên", 10));
        list.add(new Product(6, "Quạt hơi nước", 2000000, "Quạt nước", 200));
        list.add(new Product(7, "Nồi cơm điện", 5000000, "Nồi cơm ", 50));

        show(list);

        Collections.sort(list, (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });

        //Sử dụng lambda sắp xếp theo tên với phương thức compareByName
        Collections.sort(list, (o1, o2) -> Product.compareByName(o1, o2));
        System.out.println("Danh sách sắp xếp theo tên: ");
        show(list);

        //Sử dụng lambda sắp xếp theo số lượng bán
        Collections.sort(list, (o1, o2) -> Product.compareByAmountsales(o1, o2));
        System.out.println("Danh sách theo số lượng bán : ");
        show(list);

        System.out.println("Danh sách những sản phẩm lớn hơn 10000000 là : ");
        for (Product product2 : list) {
            if(product2.getPrice() > 10000000){
                System.out.println(product2);
            }
        }
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        for (Product product : list) {
            map.put(product.getName(), product.getPrice() * product.getAmountsales());
        }
        System.out.println("\nTổng số tiền bán được là:");
        map.forEach((k, v) -> System.out.println(k + " - tổng Tiền bán được: "+ v  + " tr"));
    }
    public static void show(ArrayList<Product> list) {
        list.forEach(person -> System.out.println(person));
    }
}
