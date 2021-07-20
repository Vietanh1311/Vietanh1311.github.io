package Hackathonnumber2.Hackathon1;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Mời bạn nhập vào một số hoặc ấn 0 để thoát : ");
            int n = scanner.nextInt();
            if(n==0){
                break;
            }
            else{
                if(isPrimeNumber(n)){
                    System.out.println("Số bạn nhập vào là số nguyên tố .");
                }
                else{
                    System.out.println("Số bạn nhập không phải số nguyên tố .");
                }
            }
        }
        
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
