public class _13_Roman_to_Integer {
    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }

    public static int romanToInt(String s) {
        int n = s.length();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            switch (s.charAt(i)) {
                case 'I':
                    arr[i] = 1;
                    break;
                case 'V':
                    arr[i] = 5;
                    break;
                case 'X':
                    arr[i] = 10;
                    break;
                case 'L':
                    arr[i] = 50;
                    break;
                case 'C':
                    arr[i] = 100;
                    break;
                case 'D':
                    arr[i] = 500;
                    break;
                case 'M':
                    arr[i] = 1000;
                    break;
            }
        }

        int sol = 0;
        int i = 0;
        while (i < n - 1) {
            if (arr[i] < arr[i + 1])
                sol -= arr[i];
            else
                sol += arr[i];
            i++;
        }

        return sol + arr[i];
    }
}
