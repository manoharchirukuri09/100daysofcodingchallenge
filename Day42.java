876. Middle of the Linked List
  class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

234. Palindrome Linked List
  class Solution {
    public boolean isPalindrome(ListNode head) {
        // find the mid
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        // reverse the linkedlist 2nd half
        ListNode curr = mid;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode right = prev;
        ListNode left = head;
        // compare the left and right 
        while(right != null){
            if(left.val!= right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }
}
