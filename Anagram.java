import java.io.*;
import java.util.*;

public class Anagram {
   public static void main(String[] args) {
   
      testDriver("", "", true);
      testDriver("abc", "", false);
      testDriver("", "cba", false);
      testDriver("abc", "cba", true);
      testDriver("a", "a", true);
      testDriver("ac", "cba", false);
      testDriver("abcabc", "cba", false);
   }
   
   public static void testDriver(String a, String b, boolean expected) {
      System.out.println((anagram(a, b) == expected) + " - a: " + a + ", b: " + b);
   }
   
   public static boolean anagram(String a, String b) {
      int s1 = a.length();
      int s2 = b.length();
      
      if (s1 != s2) {
         return false;
      }
      
      if (s1 == 0) {
         return true;
      }
      
      char[] arrayA = a.toCharArray();
      char[] arrayB = b.toCharArray();
      
      Arrays.sort(arrayA);
      Arrays.sort(arrayB);
      
      for (int i = 0; i < s1; i++) {
         if (arrayA[i] != arrayB[i]) {
            return false;
         }
      }  
      
      return true;
   }
}
