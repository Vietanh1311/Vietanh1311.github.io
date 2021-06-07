package baitapontap;
import java.util.Map;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Ontap {
  /*
   * Hãy viết hàm isContain để kiểm tra strA có chứa strB không mà không hàm có
   * sẵn trong String
   */

  public boolean isContain(String strA, String strB) {

    final int length = strB.length();
    if (length == 0)
      return true;

    final char firstLo = Character.toLowerCase(strB.charAt(0));
    final char firstUp = Character.toUpperCase(strB.charAt(0));

    for (int i = strA.length() - length; i >= 0; i--) {
      final char ch = strA.charAt(i);
      if (ch != firstLo && ch != firstUp)
        continue;

      if (strA.regionMatches(i, strB, 0, length))
        return true;
    }

    return false;
  }

  /*
   * Nghịch đảo một chuỗi: Hello -> olleH
   */
  public String reverse(String str) {
    String string = str;
    String reverse = new StringBuffer(string).reverse().toString();
    System.out.println(reverse);

    return "";
  }

  /*
   * trả về vị trí mà strB được tìm thấy trong strA -1: không tìm thấy >= 0: là vị
   * trí tìm thấy
   */
  public int find(String strA, String strB) {
    
    final int length = strB.length();
    
    if (length == 0)
      return 0;

    for (int i = strA.length() - length; i >= 0; i--) {
      
      if (strA.regionMatches(i, strB, 0, length))
        return i;
    }

    return -1;
  }

  /*
   * Upper case ký tự đầu tiên của từ
   */
  public String camelCase(String input) {
    String[] arr = input.split(" ");
    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < arr.length; i++) {
      sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
    }
    return sb.toString().trim();
  }

  /*
   * "Không có gì quý hơn độc lập tự do" Từ dài nhất là "Không"
   */
  public String longestWord(String input) {
    String[] arr = input.split(" ");
    int max=0;
    for (int i=1; i<arr.length; i++){
      if(arr[max].length()<arr[i].length()){
        max=i;
      }
    }
      return arr[max];

  }

  /*
   * Đếm số lần tự lặp lại
   */

  /*
   * "Một con mèo, hai con chó, chó đuổi mèo" Một: 1 con: 2 mèo: 2 hai: 1 chó: 2
   * đuổi: 1
   */
  public Map<String, Integer> countWords(String input) {
    input = input.replace("," , "");
    String[] arr = input.split(" ");
    
    int dem=1 ;
    Map<String, Integer> map = new LinkedHashMap<String, Integer>();
    for(int i = 0; i < arr.length; i++){
      dem = 1;
      for(int j = i+1; j < arr.length; j++){
          if(arr[i].equals(arr[j])){
            dem++;
          }
      }
      if (!map.containsKey(arr[i])) {
        map.put(arr[i], dem);
      }
    
    }

    return map;

  }
}
