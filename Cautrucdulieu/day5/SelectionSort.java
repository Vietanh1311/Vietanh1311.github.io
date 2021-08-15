public class SelectionSort {

    public int[] sortArray(int[] arr) {
        int n = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }

}
