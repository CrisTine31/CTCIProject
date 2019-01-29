package LinkedLists;

import java.util.HashSet;

/**
 * Remove duplicates from an unsorted linked list.
 * Follow up - temporary buffer not allowed
 */

public class Q1_RemoveDuplicates {

    // Solution takes O(n) time where n is the length of the list
    public void deleteDuplicates( LinkedListNode n ){
        HashSet<Integer> set = new HashSet<>();
        LinkedListNode previous = null;
        while( n!=null ){
            if(set.contains(n.data)){
                previous.next = n.next;
            }else {
                set.add(n.data);
                previous = n;
            }
            n = n.next;
        }
    }

    // Solution takes O(1) space, but O(n2) time
    public void deleteDupsWithoutTempBuffer(LinkedListNode head ){
       LinkedListNode current = head;
       while( current != null){
           LinkedListNode runner = current;
           while( runner != null){
               if( runner.next.data == current.data){
                   runner.next = runner.next.next;
               }else{
                  runner = runner.next;
               }
           }
           current = runner.next;
       }
    }

}
