package LinkedLists;

public class Q2_KthToLastElement {

    // Solution takes O(n) time and O(1) space
    public static LinkedListNode printKthToLastElement_iterative(LinkedListNode head, int v){
        LinkedListNode p1 = head;
        LinkedListNode p2 = head;
        // Move p1 v nodes in the list
        for (int i = 0; i < v; i++) {
            if( p1 == null)
                return null;
            p1 = p1.next;
        }
        // Move them at the same pace. When p1 hits the end, p2 will be at the right element
        while( p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
