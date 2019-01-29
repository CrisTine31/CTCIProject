package LinkedLists;

import java.util.concurrent.LinkedBlockingDeque;

public class Q4_PartitionLinkedList {

    LinkedListNode partition_version1(LinkedListNode node, int x){
        LinkedListNode beforeStart = null;
        LinkedListNode beforeEnd = null;
        LinkedListNode afterStart = null;
        LinkedListNode afterEnd = null;

        while( node != null){
            LinkedListNode next = node.next;
            node.next = null;
            if(node.data < x){
                // Insert node into end of before_list
                if(beforeStart == null){
                    beforeStart = node;
                    beforeEnd = beforeStart;
                }else{
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            }else{
                // Insert node into end of after_list
                if(afterStart == null){
                    afterStart = node;
                    afterEnd = afterStart;
                }else{
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }
            node = next;
        }
        if(beforeStart == null){
            return afterStart;
        }
        // Merge the before_list and after_list
        beforeEnd.next = afterStart;
        return beforeStart;
    }


    LinkedListNode partition_version2(LinkedListNode node, int x){
        LinkedListNode head = null;
        LinkedListNode tail = null;

        while( node != null){
            LinkedListNode next = node.next;
            if( node.data < x ){
                // Insert node at head
                node.next = head;
                head = node;
            }else{
                // Insert node at tail
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;
        // Head has changed so we return the new head
        return head;
    }
}
