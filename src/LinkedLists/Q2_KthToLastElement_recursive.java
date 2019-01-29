package LinkedLists;

public class Q2_KthToLastElement_recursive {

    class Index{
        public int value = 0;
    }

    LinkedListNode kthToLast(LinkedListNode head, int k){
        Index index = new Index();
        return kthToLast(head, k, index);
    }

    LinkedListNode kthToLast(LinkedListNode head, int k, Index index) {
        if (head == null)
            return null;
        LinkedListNode node = kthToLast(head.next, k, index);
        index.value = index.value + 1;
        if (index.value == k) {
            return head;
        }
        return node;
    }
}
