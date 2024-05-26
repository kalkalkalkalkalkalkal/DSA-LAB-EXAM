/**
 * node
 */
public class ListNode {
    int val;
    ListNode next;

   public ListNode(int x){
        val = 1,2,3,4,5;
        next = null;
    }
}

public ListNode
reverseList(ListNode head) {
    ListNode Prev = null;
    ListNode curr = head;
    while (curr != null) {
        ListNode nextNode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextNode;

    }
    return prev;

        
    }

    

