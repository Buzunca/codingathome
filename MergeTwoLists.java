import java.util.*;
import java.io.*;

public class MergeTwoLists {
   public static void main(String[] args) {
   
   }
   
   public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode dummyHead = result;
        ListNode d1 = l1;
        ListNode d2 = l2;
        
        while (d1 != null && d2 != null) {
            if (d1.val <= d2.val) {
                dummyHead.next = d1;
                d1 = d1.next;
            } else {
                dummyHead.next = d2;
                d2 = d2.next;
            }
            
             dummyHead = dummyHead.next;
        }
        
        if (d1 != null) {
            while (d1 != null) {
               dummyHead.next = d1;
               d1 = d1.next;
               dummyHead = dummyHead.next;
            }
        } else {
            while (d1 != null) {
               dummyHead.next = d2;
               d2 = d2.next;
               dummyHead = dummyHead.next;
            }
        }
        
        return result.next;
    }
}