package hashtable.chainedhashtable;

import hashtable.SimpleHashTable;
import lists.arraylists.Employee;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",4567);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",123);

        ChainedHashTable ht = new ChainedHashTable<>();

        ht.put("jones",janeJones);
        ht.put("doe",johnDoe);
        ht.put("smith",marySmith);
        ht.put("wilson",mikeWilson);

        ht.printHashTable();

//        System.out.println("Retrieve key wilson: " + ht.get("wilson"));
//        System.out.println("Retrieve key smith: " + ht.get("smith"));
//        System.out.println("Removed: " + ht.remove("jones"));
//
//        ht.printHashTable();
//        System.out.println("Retrieve key smith: " + ht.get("smith"));
    }
}
