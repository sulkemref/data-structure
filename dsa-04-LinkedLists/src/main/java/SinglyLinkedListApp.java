public class SinglyLinkedListApp {

    public static void main(String[] args) {
        MySinglyLinkedList mylist = new MySinglyLinkedList();

        System.out.println(mylist.isEmpty());

        for (int i = 0; i< 10 ;i++){
            mylist.add(i);
        }


        mylist.printNodes();
        System.out.println();
        mylist.removeKthFromLast(10);
        System.out.println();
        mylist.printNodes();

    }

}
