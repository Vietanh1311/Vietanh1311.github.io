public class _1309_Decrypt_String {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        char[] ch = s.toCharArray();
        int val = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            StringBuilder sb = new StringBuilder();
            if (ch[i] == '#') {
                sb.append(ch[i - 2]).append(ch[i - 1]);
                val = Integer.valueOf(sb.toString());
                result.insert(0, (char) (val + 96));
                i -= 2;
            } else {
                val = Integer.valueOf(String.valueOf(ch[i]));
                result.insert(0, (char) (val + 96));
            }
        }
        return result.toString();

    }
}
