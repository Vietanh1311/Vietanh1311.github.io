package Hackathon.hackathon1;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        MyMath mymath = new MyMath();
        System.out.println(mymath.isTriangle(2,2,3));

        List fullNames = new ArrayList();
        fullNames.add("Nguyễn  hữu tiến ");
        fullNames.add("  Lê vĂn tốt ");
        fullNames.add("nguyễn việt ANh");
        fullNames.add("  Hoàng trọng  kHoa");
        fullNames.add(" ĐàO việt phong");
        mymath.Bai3(fullNames);

         List<String> list = new ArrayList<String>();
        list.add("Thụy Sĩ");
        list.add("TBN");
        list.add("Bỉ");
        list.add("Đan Mạch");
        System.out.println("So cach: "+mymath.Bai2(list));
        // mymath.Bai2(list);
        

    }

}
