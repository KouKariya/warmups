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
    private Node first = null; //list head
    private Node last = null; //last element in list

    /**
    Constructor
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
        first = null;
        last = null;
    }

    /**
    The isEmpty method detects whether the linked list is empty
    @return true if list is empty, false otherwise.
    */
    public boolean isEmpty(){
        return first == null;
    }

    /**
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

    /**
    The add method adds an element ot the end of the list.
     @param e The value to add to the end of the list
     */
    public void add(String e){
        if(isEmpty()){
            first = new Node(e);
            last = first;
        }
        else{
            //Add to end of existing list
            last.next = new Node(e);
            last = last.next;
        }
    }

    /**
     * The add method adds an element at a position.
     * @param e The element to add to the list.
     * @param index The position at which to add the element.
     * @execption IndexOutOfBoundsException When index is out of bounds
     */
    public void add(int index, String e){
        if(index < 0 || index > size()){
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }
        //Index is at least 0
        if(index == 0){
            //New element goes at beginning
            first = new Node(e,first);
            if(last == null)  //If you remove the only element in the list
                last = first;  //last will also point to null
            return;
        }

        //Set a reference pred to point to the node that
        //will be the predecessor of the new node
        Node pred = first;
        for (int k = 1; k <= index -1; k++){
            pred = pred.next;
        }
        //Splice in a node containing the new element
        pred.next = new Node(e, pred.next);

        //Is there a new last element
        if (pred.next.next == null)
            last = pred.next;
    }

    /**
     * The toString method computes the string
     * representation of the list.
     * @return The string form of the list.
     */
    public String toString(){
        StringBuilder strBuilder = new StringBuilder();

        //Use p to walk down the linked list
        Node p = first;
        while (p != null){
            strBuilder.append(p.value + "\n");
            p = p.next;
        }
        return strBuilder.toString();
    }

//    /**
//    The print method traverses the list
//    and prints all of its elements
//    */
//    public void print(){
//        Node ref = first;
//        while(ref != null){
//            System.out.println(ref.value + " ");
//            ref = ref.next;
//        }
//
//    }

    /*
    The main method creates the linked list
    and invokes its print method
     */
    public static void main(String[] args){
        LinkedLists ll = new LinkedLists();
        String str = "The contents of the list are:";
        System.out.println(str);
        //ll.print();
    }

}
