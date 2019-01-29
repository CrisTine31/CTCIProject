package LinkedLists;

public class Q5_SumLinkedLists {

    LinkedListNode addLists(LinkedListNode linkedListNode1, LinkedListNode linkedListNode2, int carry){
        if(linkedListNode1 == null && linkedListNode2 == null && carry ==0 ){
            return null;
        }

        LinkedListNode result = new LinkedListNode();
        int value = carry;
        if(linkedListNode1 != null){
            value += linkedListNode1.data;
        }
        if(linkedListNode2 != null){
            value += linkedListNode2.data;
        }

        result.data = value % 10; // get the second digit of number

        // Recurse
        if(linkedListNode1 != null || linkedListNode2 != null){
            LinkedListNode more = addLists(linkedListNode1 == null ? null : linkedListNode1.next,
                                           linkedListNode2 == null ? null : linkedListNode2.next,
                                           value >= 10 ? 1 : 0);
            result.setNext(more);
        }
        return result;
    }
}
