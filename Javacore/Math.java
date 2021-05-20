public class Math {
    public boolean isOdd(int x) {
        return x % 2 == 0;
    }

    public float calculateBMI(float height, float weight) {

        return weight / (height * height);
    }

    public float circle_perimeter(float diameter) {
        return diameter * 3.14f;
    }

    public boolean isTriangle(float x, float y, float z) {

        return (x + y > z && x + z > y && z + y > x);

    }

    public float smallestIn2Numbers(float x, float y) {
        return (x < y) ? x : y;
    }

    public float smallestIn3Numbers(float x, float y, float z) {

        return smallestIn2Numbers(smallestIn2Numbers(x, y), z);
    }

    public float sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public float average(int[] numbers) {
        float trungbinh;
        int dem = 0;
        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            dem = dem + 1;
        }

        trungbinh = sum / dem;

        return trungbinh;
    }

    public int[] reverseArray(int[] numbers) {

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        ;

        return numbers;
    }

    // Đếm số lẻ trong một mảng
    public int countOddNumber(int[] numbers) {
        int dem = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                dem = dem + 1;
            }

        }
        return dem;
    }

    // Trả về mảng chỉ gồm các số lẻ. Ví dụ đầu vào 1, 2, 4, 5, 3 thì trả về [1, 5,
    // 3]
    public int[] oddNumberArray(int[] numbers) {
        int[] Newarray = new int[countOddNumber(numbers)];
        int vitri = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                Newarray[vitri++] = numbers[i];
            }
        }
        return Newarray;
    }

    /*
     * Dựa vào chỉ số BMI hãy trả về các đánh giá: Nhẹ cân, Bình thường, Quá cân,
     * Rất nguy hiểm BMI Đánh giá Dưới 18.5 Nhẹ cân 18.5—24.9 Bình thường 25.0—29.9
     * Quá cân 30.0 Rất nguy hiểm
     */
    public String bmiRating(float height, float weight) {
        float BMI = weight / (height * height);
        if (BMI <= 18.5) {
            return "nhẹ cân";
        } else if (18.5 <= BMI && BMI <= 24.9) {
            return "Bình thường";
        } else if (25.0 <= BMI && BMI <= 29.9) {
            return "Quá cân";
        } else if (BMI >= 30.0) {
            return "rất nguy hiểm";
        }
        return null;
    }

}
