package day10_14_12.algorithms.and.data.structures.data.structure;

/**
 * Implements a single linked list data structure.
 * The list contains nodes that are linked between them.
 */
public class CustomLinkedList {
    /**
     * Head of the list.
     */
    Node head;

    /**
     * Constructor to initialize an object of this class.
     */
    public CustomLinkedList() {
        head = null;
    }

    /**
     * This method implements the functionality of adding a new element to the list.
     * The element will be added at the end of the list.
     * @param value - value to be inserted in the list.
     */
    public void insert(int value) {
        Node newNode = new Node(value);
        // If the head of the list is null then the newNode becomes the head of the list.
        if (head == null) {
            head = newNode;
        } else {
            // Traverse till the last node from the list and insert the node there.
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            // newNode becomes he next element in the list after the last node.
            last.next = newNode;
        }
    }

    /**
     * Display in the console all the elements from the list.
     */
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node node = head;
            System.out.print("List: ");
            // Iterate through the entire list.
            while(node != null){
                System.out.print(node.data + ", ");
                node = node.next;
            }
        }
    }
}

