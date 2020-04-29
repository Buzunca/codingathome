public class Anagram {
   public static void main(String[] args) {
   
      anagram("abc", "cba");
      anagram("ac", "cba");
      anagram("abcabc", "cba");
   }
   
   public static void anagram(String a, String b) {
      if (a.length() != b.length()) {
         result("NO");
         return;
      }
      while (a.length() == b.length()) {
      
         char letter = a.charAt(0);
         String s = letter + "";
         
         if (b.indexOf(letter) > -1) {
            b.replaceFirst(s, "");
            a = a.substring(1);
         } 
         else {
            result("NO");
            return;
         }
      }
      
      result("YES");
   }
   
   public static void result(String s) {
      System.out.println(s);
   }
}
