public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;

    }

    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.id + " => null");
            } else {
                System.out.print(current.id + " => ");
            }
            current = current.next;
        }
    }



    int indexOf(int id){
        int index = 0;
        Node current = head;
        while (current!=null){
            if (current.id==id)
                return index;
            current=current.next;
            index++;
        }
        return -1;
    }

    void addFirst(int data){
        Node firtsNewNode = new Node(data);
        firtsNewNode.next=head;
        head=firtsNewNode;
    }



    void removeKthFromLast(int k) {
        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }
        if(k<0){
            System.out.println("Index of element must be positive");
            return;
        }
        int index = 0;
        Node fast = head;
        Node slow = head;
        Node previous = head;
        boolean isOutOfRange=true;
        while (fast!=null){
            if(index>k){
                previous=slow;
                slow=slow.next;
            }
            fast=fast.next;
            index++;
        }

        if(k>index){
            System.out.println("Provided index out of range");
            return;
        }

        if(slow==head){
            head=slow.next;
        }else {
            previous.next = slow.next;
        }
        slow.next=null;

    }

    int getKthFromLast(int k){
        if (isEmpty()){
            System.out.println("List is empty");
            return -1;
        }
        int index = 0;
        Node fast = head;
        Node slow = head;
        while (fast!=null){
            if(index>k){
                slow=slow.next;
            }
            fast=fast.next;
            index++;
        }
        return slow.id;
    }
    void deleteById(int id){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }

        Node previous = head;
        Node current = head;

        while (current!=null){
            if(current.id==id){
                if(current==head){
                    head=current.next;
                    current.next=null;
                }else if(current==tail){
                    tail=previous;
                    previous.next=null;
                }else {
                    previous.next=current.next;
                    current.next=null;
                }
                size--;
                return;
            }
            previous=current;
            current=current.next;
        }
    }

    void removeKthFromLastHilal(int k) {
        Node p1 = head;
        Node p2 = head;
        Node prev=head;
        for (int i = 0; i < k-1; i++) {
            p2 = p2.next;
        }
        while (p2.next != null) {
            prev=p1;
            p1 = p1.next;
            p2 = p2.next;
        }

        prev.next=p1.next;
        p1.next=null; //break link
    }

}
