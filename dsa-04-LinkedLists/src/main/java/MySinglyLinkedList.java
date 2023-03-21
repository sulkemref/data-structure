public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;
    boolean isEmpty(){
        return head==null;
    }

    void add(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head=tail=node;
        }else {
            tail.next=node;
            tail=node;
        }
        size++;

    }

    void printNodes(){
        Node current = head;
        while (current!=null){
            if(current.next==null){
                System.out.print(current.id + " => null");
            }else {
                System.out.print(current.id + " => ");
            }
            current = current.next;
        }
    }

    void deleteNode(int value){
        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }

        Node current= head;
        Node previous = head;

        while (current!=null){
//              My solution
//            if(head.id==value) {
//                head = current.next;
//                current.next = null;
//                size--;
//            }else if (current.id==value) {
//                previous.next = current.next;
//                current.next = null;
//                size--;
//            }

            if(current.id == value){
                if(current==head){
                    head = current.next;
                    current.next = null;
                }else if(current==tail){
                    tail=previous;
                    previous.next=null;
                }else {
                    previous.next = current.next;
                    current.next = null;
                }
                size--;
            }
            previous = current;
            current = current.next;
        }

    }
}
