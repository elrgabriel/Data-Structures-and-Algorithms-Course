package hashtable.chainedhashtable;

import hashtable.StoredObject;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable<T> {

    private LinkedList<StoredObject>[] hashtable;

    public ChainedHashTable(){
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length ; i++) {
            hashtable[i] = new LinkedList<StoredObject>();
        }
    }

    @SuppressWarnings("unchecked")
    public void put(String key, T object){
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredObject(key,object));
    }

    @SuppressWarnings("unchecked")
    public T get(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredObject> iterator = hashtable[hashedKey].listIterator();
        StoredObject item = null;
        while(iterator.hasNext()){
            item = iterator.next();
            if (item.key.equals(key)) {
                return (T) item.object;
            }
        }
        return null;
    }

    public T remove(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredObject> iterator = hashtable[hashedKey].listIterator();
        StoredObject item = null;
        int index = -1;
        while(iterator.hasNext()){
            item = iterator.next();
            index++;
            if (item.key.equals(key)) {
                break;
            }
        }
        if (item == null || !item.key.equals(key)) {
            return null;
        }
        else{
            hashtable[hashedKey].remove(index);
            return (T) item.object;
        }
    }
    private int hashKey(String key){
        //return key.length() % hashtable.length;
        return Math.abs(key.hashCode()) % hashtable.length;
    }

    public void printHashTable(){
        for (int i = 0; i < hashtable.length ; i++) {
            if (hashtable[i].isEmpty()) {
                System.out.println("Position " + i + ": empty");
            }
            else{
                System.out.print("Position " + i + ": ");
                ListIterator<StoredObject> iterator =  hashtable[i].listIterator();
                while(iterator.hasNext()){
                    System.out.print(iterator.next().object);
                    System.out.print(" -> ");
                }
                System.out.println("null");
            }
        }

    }

    }
