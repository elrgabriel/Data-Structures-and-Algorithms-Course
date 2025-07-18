package lists.linkedlist;

import lists.arraylists.Employee;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addToFrontL(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront(){
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext();
        removedNode.setNext(null);
        size--;
        return removedNode;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while(current != null){
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
