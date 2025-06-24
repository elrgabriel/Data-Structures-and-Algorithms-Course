package queue;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

//Generic class implementation
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
        if (back == queue.length) {
            T[]  newArray = (T[]) new Object[2 * queue.length];
            System.arraycopy(queue,0,newArray,0,queue.length);
            queue = newArray;
        }

        queue[back]=object;
        back++;
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
        return back - front;
    }

    public void printQueue(){
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}
