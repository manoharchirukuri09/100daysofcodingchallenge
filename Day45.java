19. Remove Nth Node From End of List
  class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp = head;
        while(temp!=null){
            temp= temp.next;
            size++;
        }
        if(size==n){
            head = head.next;
            return head;
        
        }
        // find the previous element 
        int i=1;
        int j = size-n;
        ListNode prev = head;
        while(i<j){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}

237. Delete Node in a Linked List
  class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = null;
        while(node!=null && node.next!=null){
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        if(node != null){//Means list is not empty
            if(prev != null) prev.next = null;
            else node = null;//Means list has only one node
        }
    }
}
