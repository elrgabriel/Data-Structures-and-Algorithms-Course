package hashtable;

import lists.arraylists.Employee;

public class SimpleHashTable<T> {
    private T[] hashtable;

    public SimpleHashTable(){
        hashtable = (T[]) new Object[10];
    }

    public void put(String key, T object){
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null) {
            System.out.println("Index " + hashedKey + " is already being used");
        }
        else{
            hashtable[hashedKey] = object;
        }
    }

    public T get(String key){
        int hashedKey = hashKey(key);

        return hashtable[hashedKey];
    }

    public void printHashTable(){
        for (int i = 0; i < hashtable.length ; i++) {
            System.out.println(hashtable[i]);
        }
    }

    private int hashKey(String key){

        return key.length() % hashtable.length;
    }

}
