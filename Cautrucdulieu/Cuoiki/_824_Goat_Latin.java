public class _824_Goat_Latin {
    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
    }

    public static String toGoatLatin(String sentence) {
        String vowel = "aeiouAEIOU";
        String[] arr = sentence.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i].charAt(0);
            if (vowel.indexOf(c) >= 0) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i].substring(1)).append(c);
            }
            appendTail(sb, i + 1);
        }
        return sb.toString().trim();
    }

    private static void appendTail(StringBuffer sb, int n) {
        sb.append("ma");
        for (int i = 0; i < n; i++) {
            sb.append('a');
        }
        sb.append(' ');
    }
}
