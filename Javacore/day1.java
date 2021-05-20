public class day1 {
    public static void main(String[] argv) {
        System.out.println("chào các bạn lớp java4");
        Math math = new Math();
        System.out.println(math.isOdd(10));
        float weight = 65f;
        float height = 1.76f;
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
    }
}