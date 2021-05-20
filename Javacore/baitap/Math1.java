package baitap;
public class Math1 {
    public float average(int[] numbers) {
        float trungbinh;
        int dem=0;
        float sum = 0;
        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i];
            dem=dem+1;}
        
            trungbinh = sum / dem;
        
          return trungbinh;
      }
      
      public int[] reverseArray(int[] numbers) {
        return null;
      }
      
      // Đếm số lẻ trong một mảng
      public int countOddNumber(int[] numbers) {
        return 0;
      }
      
      //Trả về mảng chỉ gồm các số lẻ. Ví dụ đầu vào 1, 2, 4, 5, 3 thì trả về [1, 5, 3]
      public int[] oddNumberArray(int[] numbers) {
        return null;
      }
      /* Dựa vào chỉ số BMI hãy trả về các đánh giá: Nhẹ cân, Bình thường, Quá cân, Rất nguy hiểm
      BMI	      Đánh giá
      Dưới 18.5	Nhẹ cân
      18.5—24.9	Bình thường
      25.0—29.9	Quá cân
      30.0      Rất nguy hiểm
      */
      public String bmiRating(float height, float weight) {
      
      }
    
}
