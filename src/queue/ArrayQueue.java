package queue;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

//Generic class implementation

//Circular Queue
public class ArrayQueue<T> {
    private T[] queue;
    private int front;
    private int back;

    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity) {
        queue = (T[]) new Object[capacity]; //Cast T as an array of object
    }

    @SuppressWarnings("unchecked")
    public void add(T object){
        if (size() == queue.length - 1) { // Resizing only happens if there are no empty positions in the array.
            int numItems = size();
            T[]  newArray = (T[]) new Object[2 * queue.length];

            //Unwrap the queue
            System.arraycopy(queue,front,newArray,0,queue.length - front);
            System.arraycopy(queue,0,newArray,queue.length - front,back);

            front = 0;
            back = numItems;
            queue = newArray;
        }

        queue[back]=object;
        // Implementation for circular queue
        if (back < queue.length - 1) { // If there is still space in the back positions of the array, the back pointer will be incremented
            back++;
        }
        else{ // If the back of the array is full, the back pointer will point to the empty front positions
            back = 0;
        }
    }

    public T remove(){
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        T object = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        } else if (front == queue.length) {
            front = 0;
        }
        return object;
    }

    public T peek(){
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size(){
        if (front <= back) {
            return back - front;
        }
        else{
            return back - front + queue.length;
        }
    }

    public void printQueue(){
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
        else{
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back ; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}
