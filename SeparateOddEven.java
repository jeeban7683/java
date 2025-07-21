// package leetcode.medium;
// import util.ListNode;
// import java.util.List;
// import java.util.*;
// public class AddTwoNumber{
//     ListNode addTwoNumber(ListNode l1,ListNode l2){
//         ListNode result = new ListNode();
//         ListNode ptr = result;
//         int carry = 0;
//         while(l1 !=null && l2!=null ){
//             int sum = 0+carry;
//             if(l1 !=null){
//                 sum += l1.val;
//                 l1 = l1.next;
//             }
//             if (l2 != null) {
//                 sum+=l2.val;
//                 l2 = l2.next;
//             }
//             carry = sum/10;
//             sum= sum%10;
//             ptr.next = new ListNode(sum);
//             ptr = ptr.next;
//         }
//         if (carry == 1) ptr.next = new ListNode(1); 
//             return result.next;
//         }

//     }
class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SeparateOddEven {
    
    // Function to separate odd and even numbers in a linked list
    public static ListNode separateOddEven(ListNode head) {
        if (head == null) {
            return null;
        }
        
        // Create two dummy heads for even and odd linked lists for making it constant
        ListNode evenHead = new ListNode(0);
        ListNode oddHead = new ListNode(0);
        
        ListNode even = evenHead;
        ListNode odd = oddHead;
        
        ListNode current = head;
        
        while (current != null) {
            if (current.val % 2 == 0) {  // Even number
                even.next = current;
                even = even.next;
            } else {  // Odd number
                odd.next = current;
                odd = odd.next;
            }
            current = current.next;
        }
        
    
        // Combine even and odd lists
        even.next = oddHead.next;
        odd.next = null;  // End the odd list
        
        return evenHead.next;  // Return the head of the even list with odd numbers appended
    }

    // Function to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

       public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        
        System.out.println("Original List:");
        printList(head);
        
        head = separateOddEven(head);
        
        System.out.println("List after separating odd and even numbers:");
        printList(head);
    }
}
