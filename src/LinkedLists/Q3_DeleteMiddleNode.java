package LinkedLists;

/**
 * Implement an algorithm to delete a node in the middle of a linked list
 * i.e. any node that is not the first or the last
 * Example:
 *        input: the node c from the linked list a->b->c->d->e->f
 *        output: a->b->d->e->f
 */

public class Q3_DeleteMiddleNode {

    // We do not have access to the head of the linked list. The solution is to simply copy the data from the next node
    // over to the current node
    boolean deleteNode(LinkedListNode node){
        if(node == null || node.next == null)
            return false;

        LinkedListNode next = node.next;
        node.data = next.data;
        node.next = next.next;
        return true;
    }
}


