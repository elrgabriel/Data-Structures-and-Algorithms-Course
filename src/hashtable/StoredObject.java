package hashtable;

public class StoredObject<T> {
    public String key;
    public T object;

    public StoredObject(String key, T object) {
        this.key = key;
        this.object = object;
    }
}
