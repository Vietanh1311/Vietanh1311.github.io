public class _202_Happy_Number {
    public static void main(String[] args) {
        System.out.println(isHappy(8));
    }

    public static boolean isHappy(int n) {
        if (n == 1)
            return true;
        if (n == 7)
            return true; 
        int sum = 0; 
        while (n > 9) {
            sum = 0; 
            while (n != 0) { 
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            if (sum == 7)
                return true; // 7 is a happy number which is < 9
            n = sum;
        }
        return sum == 1;

    }

}
