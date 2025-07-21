86. Partition List
  class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        
        ListNode leftTail = left;
        ListNode rightTail = right;
        
        while(head != null){
            if(head.val < x){
                leftTail.next = head;
                leftTail = leftTail.next;
            }
            else{
                rightTail.next = head;
                rightTail = rightTail.next;
            }
            head = head.next;
        }
        
        leftTail.next = right.next;
        rightTail.next = null;
        
        return left.next;
    }
}


Insertion Sort List
  class Solution {
    public ListNode insertionSortList(ListNode head) {
              ListNode d = new ListNode(0, head);
        
        ListNode prev = head;
        ListNode curr = head.next;
        
        while (curr != null) {
            if (curr.val >= prev.val) {
                prev = curr;
                curr = curr.next;
                continue;
            }
            
            ListNode tmp = d;
            while (curr.val > tmp.next.val) {
                tmp = tmp.next;
            }
            
            prev.next = curr.next;
            curr.next = tmp.next;
            tmp.next = curr;
            curr = prev.next;
        }
        return d.next;
    }
}
