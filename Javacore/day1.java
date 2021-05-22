import java.util.Scanner;
public class day1 {
    public static void main(String[] argv) {
        System.out.println("chào các bạn lớp java4");
        Math math = new Math();
        System.out.println(math.isOdd(10));
        float weight = 61f;
        float height = 1.75f;
        System.out.println("Chỉ số BMI : " + math.calculateBMI(height, weight));

        System.out.println("Chu vi tam giác : " + math.circle_perimeter(3.0f));

        System.out.println("Có thể tạo thành tam giác : " + math.isTriangle(3, 4, 5));

        System.out.println("Số nhỏ nhất trong 3 số là : " + math.smallestIn3Numbers(4, 5, 6));

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.println("Tổng của Mảng là : " + math.sum(numbers));

        System.out.println("trung bình của Mảng là : " + math.average(numbers));

        System.out.println("Số lẻ trong Mảng là : " + math.countOddNumber(numbers));

        numbers = math.reverseArray(numbers);
        System.out.println("Mảng được đảo lại là : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        numbers = math.reverseArray(numbers);
        numbers = math.oddNumberArray(numbers);
        System.out.println("Mảng Số lẻ : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Bạn đang :" + math.bmiRating(height, weight));

        Scanner sc = new Scanner(System.in); 
        System.out.print("Mời bạn nhập N : ");
		int n = sc.nextInt();
        String[][] a= new String [100][100]; // Khai báo mảng 2 chiều có tên là a


        //Hình1
        for(int i=0; i<n; i++)
        {
          for(int j=0; j<n; j++)
          {
              a[i][j] = " * "; // gán mảng 2 chiều bằng * với i là hàng còn j là cột
          }
        }
        for(int i=0; i<n; i++)
        {
          for(int j=0; j<=i; j++)
          {
              System.out.print(a[i][j] + " ") ; // in ra mang 2 chiều 
          }
          System.out.println();
        }

        // Hình2
        int d=(2*n-1);
        int b=(d /2+1);
 
        for (int i=1;i<=n;i++)
        {
        for (int j=1;j<=d;j++)
        {
            if (i==1)
            {
                if ((j%2)!=0) System.out.print("*");
                else System.out.print(" ");
            }
            else if ((j==i) || (j==d+1-i)) System.out.print("*");
            else System.out.print(" ");
 
        }
        System.out.println();
    }
    

        
    }
}