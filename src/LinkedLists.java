/**
 * Created by kariya on 4/17/2016.
 */
public class LinkedLists {

    //Inner Node class to be used for the linked list
    public static class Node{

        String value;
        Node next;

        /*
        Constructor
        @param val The element to store in this node
        @param nn The reference to the next node
         */

        Node(String val, Node n){
            value = val;
            next = n;
        }
        /*
        Constructor
        @param val The element to store in this node
        @param nn The reference to the next node
         */
        Node(String val){
            value = val;
            next = null;
        }

    }


    //Reference to the first node in the list
    //'first' is the name of the first node that is created when the
    //LinkedLists class is created
    private Node first = null;

    /*
    Constructor
    builds a linked list
     */
    public LinkedLists() {


//        //Incrementally build the list(first example)
//        //Chuck Debby Elaine Fred
//        first = new Node("Debby");
//        first.next = new Node("Elaine");
//        first.next.next = new Node("Fred");
//        first = new Node("Chuck", first);
//
//        String[] names = {"Bob", "Allen"};
//
//        /*
//        Use a loop to add all names in the array to the
//        front of the linked list to build the list
//        Allan Bob Chuck Debby Elaine Fred
//         */
//        for (String s : names) {
//            first = new Node(s, first);
//        }
    }

    /*
    The isEmpty method detects whether the linked list is empty
    @return true if list is empty, false otherwise.
    */
    public boolean isEmpty(){
        return first == null;
    }

    /*
    The size method returns the length of the list.
    @return The number of elements in the list.
     */
    public int size(){
        int count = 0;
        Node p = first;
        while(p != null){
            count ++;
            p = p.next;
        }
        return count;
    }

    /*
    The print method traverses the list
    and prints all of its elements
    */
    public void print(){
        Node ref = first;
        while(ref != null){
            System.out.println(ref.value + " ");
            ref = ref.next;
        }

    }

    /*
    The main method creates the linked list
    and invokes its print method
     */
    public static void main(String[] args){
        LinkedLists ll = new LinkedLists();
        String str = "The contents of the list are:";
        System.out.println(str);
        ll.print();
    }

}
