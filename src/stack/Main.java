package stack;

import lists.arraylists.Employee;

public class Main {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);
        LinkedStack linkedStack = new LinkedStack();

        Employee billEnd = new Employee("Bill","End",78);
        linkedStack.push(new Employee("Jane","Jones",123));
        linkedStack.push(new Employee("Mary","Smith",22));
        linkedStack.push(new Employee("John","Doe",456));
        linkedStack.push(new Employee("Mike","Wilson",987));

        //stack.printStack();
        System.out.println("Popped: "+linkedStack.pop());
        linkedStack.push(billEnd);
        System.out.println(linkedStack.peek());


    }
}
