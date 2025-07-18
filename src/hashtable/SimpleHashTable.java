package hashtable;

import lists.arraylists.Employee;

public class SimpleHashTable<T> {
    private StoredObject[] hashtable;


    public SimpleHashTable(){
        hashtable =  new StoredObject[10];
    }
    @SuppressWarnings("unchecked")
    public void put(String key, T object){
        int hashedKey = hashKey(key);

        //Collision resolution with linear probing
        if (isOccupied(hashedKey)) { //set the initial probe
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            }
            else{
                hashedKey++;
            }
            while(isOccupied(hashedKey) && hashedKey != stopIndex){ //set subsequence probes
                hashedKey = (hashedKey++) % hashtable.length;
            }
        }

        if (hashtable[hashedKey] != null) {
            System.out.println("Index " + hashedKey + " is already being used");
        }
        else{
            hashtable[hashedKey] = new StoredObject(key,object);
        }
    }

    @SuppressWarnings("unchecked")
    public T get(String key){
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        return (T) hashtable[hashedKey].object;
    }
    @SuppressWarnings("unchecked")
    public T remove(String key){
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }

        T object = (T) hashtable[hashedKey].object;
        hashtable[hashedKey] = null;
        StoredObject[] oldHashTable = hashtable;
         hashtable = new StoredObject[oldHashTable.length];
        for (int i = 0; i < oldHashTable.length ; i++) {
            if (oldHashTable[i] != null) {
                put(oldHashTable[i].key, (T) oldHashTable[i].object);
            }
        }
         
        return object;

    }

    public void printHashTable(){
        for (int i = 0; i < hashtable.length ; i++) {
            if (hashtable[i] == null) {
                System.out.println("Position " + i + ": " +"empty");
            }
            else {
                System.out.println("Position " + i + ": " + hashtable[i].object);
            }
        }
    }

    private int findKey(String key){
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null &&
            hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }


        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stopIndex &&
                hashtable[hashedKey] != null &&
                !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey++) % hashtable.length;
        }
        if (hashtable[hashedKey] != null &&
            hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }
        else{
            return -1;
        }
    }

    private boolean isOccupied(int index){
        return hashtable[index] != null;
    }

    private int hashKey(String key){

        return key.length() % hashtable.length;
    }

}
