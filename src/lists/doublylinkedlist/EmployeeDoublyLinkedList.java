package lists.doublylinkedlist;

import lists.arraylists.Employee;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addToFront(Employee employee){
        lists.doublylinkedlist.EmployeeNode node = new lists.doublylinkedlist.EmployeeNode(employee);
        node.setNext(head);

        if (head == null) {
            tail = node;
        }
        else{
            head.setPrevious(node);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee){
        lists.doublylinkedlist.EmployeeNode node = new lists.doublylinkedlist.EmployeeNode(employee);
        node.setNext(null);
        if (tail == null) {
            head = node;
        }
        else{
        tail.setNext(node);
        node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public lists.doublylinkedlist.EmployeeNode removeFromFront(){
        if (isEmpty()) {
            return null;
        }

        lists.doublylinkedlist.EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        }
        else{
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        removedNode.setNext(null);
        size--;
        return removedNode;
    }

    public lists.doublylinkedlist.EmployeeNode removeFromEnd(){
        if (isEmpty()) {
            return null;
        }

        lists.doublylinkedlist.EmployeeNode removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        }
        else{
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        removedNode.setPrevious(null);
        size--;
        return removedNode;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while(current != null){
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
