package Hackathon.hackathon1;
import java.util.ArrayList;
import java.util.List;
// import java.io.*;
// import java.util.*;

class MyMath {
    public boolean isTriangle(double a, double b, double c) {
        if(a+b>c && a+c>b && c+b>a){
            return true;
        }
        return false;
        
    }
    public String Chuanhoa(String st) {
        st = st.trim().toLowerCase();
        st = st.replaceAll("\\s+", " ");
        String[] temp = st.split(" ");
        // sau khi tách xong, gán xâu st thành sâu rỗng
        st = "";
        for (int i = 0; i < temp.length; i++) {
            st += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) // nếu tempt[i] không phải từ cuối cùng
                st += " "; // cộng thêm một khoảng trắng
        }
        return st;
    }

    public void Bai3(List<String> list) {
        int length = list.size();
        for (int i = 0; i < length; i++) {
            list.set(i, Chuanhoa(list.get(i)));
        }

        list.forEach(i -> System.out.println(i));
    }
    public int Bai2(List<String> list) {
        int lengthList = list.size();
        List<String> tranDau = new ArrayList<String>();

        for (int i = 0; i < lengthList; i++) {
            for (int j = i + 1; j < lengthList; j++) {
                tranDau.add(list.get(i) + " - " + list.get(j));
            }
        }

        int lengthTran = tranDau.size();
        List<String> cap = new ArrayList<String>();

        for (int i = 0; i < lengthTran; i++) {
            String[] strA = tranDau.get(i).split(" - ");
            for (int j = i + 1; j < lengthTran; j++) {
                String[] strB = tranDau.get(j).split(" - ");
                if (strA[0].equals(strB[0]) || strA[1].equals(strB[1]) || strA[1].equals(strB[0])) {
                    continue;
                } else {
                    cap.add("(" + tranDau.get(i) + ")  ******  (" + tranDau.get(j) + ")");
                }
            }
        }
        cap.forEach(i -> System.out.printf("%s\n", i));

        return cap.size();
    }


}
