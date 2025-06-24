package queue;

import lists.arraylists.Employee;

public class Main {
    public static void main(String[] args) {
    ArrayQueue<Employee> queue = new ArrayQueue<Employee>(10);

        Employee billEnd = new Employee("Bill","End",78);
        queue.add(new Employee("Jane","Jones",123));
        queue.add(new Employee("Mary","Smith",22));
        queue.add(new Employee("John","Doe",456));
        queue.add(new Employee("Mike","Wilson",987));

        System.out.println(queue.size());
        //System.out.println("removed: "+queue.remove());
        //queue.printQueue();
        //System.out.println(queue.size());
        System.out.println(queue.peek());

    }
}
