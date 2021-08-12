import java.util.Arrays;

public class homework {
    public static void main(String[] args) {
        String src[] = { "An", "Tùng", "Việt Anh", "Trung", "Long", "Khanh", "Phú", "Khoa", "Tốt", "Sơn" };
        System.out.println(seach(src, "Trung"));

    }

    public static int seach(String src[], String target) {
        Arrays.sort(src);
        int n = src.length;
        int ileft = 0;
        int iright = n - 1;

        while (ileft <= iright) {
            int imid = (ileft + iright) / 2;
            System.out.println(iright + " " + ileft+ " " + imid);
            if (src[imid].compareTo(target) < 0) {
                ileft = imid + 1;
            } else if (src[imid].compareTo(target) > 0) {
                iright = imid - 1;
            } else {
                return imid;
            }
        }
        return -1;

    }

}
