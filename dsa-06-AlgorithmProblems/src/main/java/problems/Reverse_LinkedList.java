package problems;

import utilities.ListNode;
import utilities.NodeUtility;

import java.util.List;

public class Reverse_LinkedList {

    public static void main(String[] args) {

        Reverse_LinkedList obj = new Reverse_LinkedList();

        ListNode list1 = NodeUtility.createListNodeFromArray(new int[]{1,2,3,4,5,6,7});

        list1 = obj.reverseLinkedList(list1);

        NodeUtility.printListNode(list1);
    }

    public ListNode reverseLinkedList (ListNode head){
        ListNode current = head;
        ListNode prev = null;

        while (current!=null){
            ListNode next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}
