package baitapontap;

public class App {
    public static void main(String[] args) {
        // String strA = "Cuộc đời vốn đẹp";
        // String strB = "đẹp";
    
        // if (strA.contains(strB)) {
        //   System.out.println("\"" + strA + "\" chứa \"" +  strB + "\"");
        // } else {
        //   System.out.println("\"" + strA + "\" không chứa \"" +  strB + "\"");
        // }
        Ontap ontap = new Ontap();
        // System.out.println(ontap.isContain("Cuộc đời vốn đẹp", "vốn"));
        // System.out.println(ontap.reverse("hello"));
        // System.out.println(ontap.camelCase("cuộc đời vống không đẹp "));
        // System.out.println(ontap.find("cuộc đời vốn đẹp", "v")); //bắt đầu đếm từ 0;
        // System.out.println(ontap.longestWord("Cuộc đờiiiiiiii vốn đẹp"));
        System.out.println(ontap.countWords("Một con mèo, hai con chó, chó đuổi mèo"));
    
    
      }
}
