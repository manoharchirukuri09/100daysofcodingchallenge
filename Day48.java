82. Remove Duplicates from Sorted List II
  class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
          
      if (current.next != null && current.val == current.next.val) {
               
                while (current.next != null && current.val == current.next.val) {
                    current = current.next;
                }
               
                prev.next = current.next;
            } else {
               
                prev = prev.next;
            }
            current = current.next;
        }

        return dummy.next;
    }
}


382. Linked List Random Node
  import java.util.*;
class Solution {
    private List<Integer> arr;
    private Random rand;
    public Solution(ListNode head) {
        arr = new ArrayList<>();
        rand = new Random();
        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
    }
    public int getRandom() {
        int r_index = rand.nextInt(arr.size());
        return arr.get(r_index);
    }
}
