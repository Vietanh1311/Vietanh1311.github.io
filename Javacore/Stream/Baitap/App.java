package Stream.Baitap;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class App {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(90);
        list.add(20);
        list.add(62);
        list.add(11);
        list.add(35);
        list.add(37);

        System.out.println("Các số trong dãy là :");
        list.forEach(num->System.out.println(num));
        System.out.println("Chia hết cho 2: ");
        list.stream().filter(i->i%2==0).forEach(i -> System.out.println(i));
        

        System.out.println("\nChia het cho 5:");
        list.stream().filter(i -> i % 5 == 0).forEach(i -> System.out.printf("%d, ", i));

        System.out.println("Loại bỏ 3 phầm tử đầu tiên : ");
        list.stream().skip(3).forEach(i -> System.out.println(i));

        System.out.println("In ra tối đa 5 phần tử : ");
        list.stream().limit(5).forEach(i -> System.out.println(i));

        System.out.println("Chia hết cho 2 in ra 2 phần tử đầu tiên: ");
        list.stream().filter(i->i%2==0).limit(2).forEach(i -> System.out.println(i));

        System.out.println("Danh sách các số nhân với 10 :");
        list.stream().map(num->num*10).forEach(num -> System.out.println(num));

        System.out.println("Danh sách sau khi sắp xếp : ");
        list.stream().sorted().forEach(num -> System.out.println(num));

        ArrayList<String> string = new ArrayList<String>();
        
        string.add("python");
        string.add("java");
        string.add("Ruby");
        string.add("abstract");
        System.out.println("Chuỗi khi sắp xếp ");
        string.stream().sorted().forEach(str -> System.out.println(str));

        Stream<String> stream = Stream.of("Hoa","linh","Hùng","Tuấn","Đạt ");

        System.out.println("Danh sách tên là :");
        List<String> names = stream.collect(Collectors.toList());
        names.stream().forEach(name -> System.out.println(name));

        Boolean ischeck = names.stream().anyMatch(name ->name.startsWith("H")); 
        System.out.println(ischeck);

        ischeck =names.stream().allMatch(name ->name.startsWith("H"));
        System.out.println(ischeck);

        long count = list.stream().filter(num-> num%2 == 0).count();
        System.out.println(count);
        
        Long count1 = list.stream().filter(num-> num>5).count();
        System.out.println(count1);

        // Integer max = list.stream().max();
    }
}
