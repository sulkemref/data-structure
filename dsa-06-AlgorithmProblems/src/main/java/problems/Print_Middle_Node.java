package problems;

import utilities.ListNode;
import utilities.NodeUtility;

import java.util.List;

public class Print_Middle_Node {


    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ListNode list1 = NodeUtility.createListNodeFromArray(arr1);
        ListNode list2 = NodeUtility.createListNodeFromArray(arr2);

        Print_Middle_Node obj = new Print_Middle_Node();

        NodeUtility.printListNode(obj.printMiddleOfNodeList(list1));
        NodeUtility.printListNode(obj.printMiddleOfNodeList(list2));




    }

    public ListNode printMiddleOfNodeList (ListNode head){

        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;

        int count = 0;

        while (fast!=null){
            if(count%2==0&&count!=0){
                slow=slow.next;
            }
            fast=fast.next;
            count++;
        }
        System.out.println(count);


        if(count%2==0){
            slow.next.next=null;
            return slow;
        }

        slow.next=null;
        return slow;
    }
}
