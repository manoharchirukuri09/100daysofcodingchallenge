160. Intersection of Two Linked Lists
 public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      if(headA==null || headB==null){
        return null;
      }
      ListNode a = headA;
      ListNode b = headB;
      while(a!=b){
        a=a==null ? headB : a.next;
        b=b==null ? headA : b.next;
      }
      return a;
    }
}

203. Remove Linked List Elements
  class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            //It remove the value
            head = head.next;
        }
        ListNode curr = head;
        while(curr !=null && curr.next != null){
            if(curr!=null && curr.next.val == val){
            curr.next = curr.next.next;
        }else{
            //element is not found
            curr = curr.next;
        }
        }
        
        return head;
    }
}
  
