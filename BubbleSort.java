import java.util.*;
import java.io.*;

public class BubbleSort {
   public static void main(String[] args) {
   
      int[] array1 = {1, 3, 2, 4};
      int[] expected1 = {1, 2, 3, 4};
      testdriver(array1, expected1);
      
      int[] array2 = {3, 4, 1, 2, 8};
      int[] expected2 = {1, 2, 3, 4, 8};
      testdriver(array2, expected2);
      
      int[] array3 = {1, 1, 1};
      int[] expected3 = {1, 1, 1};
      testdriver(array3, expected3);
      
      int[] array4 = {1};
      int[] expected4 = {1};
      testdriver(array4, expected4);
      
      int[] array5 = {};
      int[] expected5 = {};
      testdriver(array5, expected5); 
      
      int[] array6 = {1, 2, 3, 4};
      int[] expected6 = {1, 2, 3, 4};
      testdriver(array6, expected6);  
   }
   
   public static void testdriver(int[] array, int[] expected) {
      int[] result = bubbleSort(array);
      System.out.println(Arrays.equals(result, expected) + " : " + Arrays.toString(result) + " == " + Arrays.toString(expected));
   }
   
   public static int[] bubbleSort(int[] a) {
      boolean swapped = true;
      int length = a.length;
      int count = 0;
      
      while (swapped) {
         swapped = false;
         
         for (int i = 0; i < length - 1; i++) {
            int temp = a[i];
            if (temp > a[i + 1]) {
               a[i] = a[i + 1];
               a[i + 1] = temp;
               swapped  = true;
            }
         }
      }
      
      return a;  
   }
}