public class SinglyLinkedListApp {

    public static void main(String[] args) {
        MySinglyLinkedList mylist = new MySinglyLinkedList();

        System.out.println(mylist.isEmpty());

        for (int i = 0; i< 10 ;i++){
            mylist.add(i);
        }

//        mylist.deleteNode(0);
        mylist.deleteNode(5);
        mylist.deleteNode(1);
        mylist.deleteNode(0);
        mylist.deleteNode(9);
        System.out.println(mylist.size);
        mylist.printNodes();
    }

}
