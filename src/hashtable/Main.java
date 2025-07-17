package hashtable;

import lists.arraylists.Employee;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",4567);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",123);

        SimpleHashTable ht = new SimpleHashTable();

        ht.put("jones",janeJones);
        ht.put("doe",johnDoe);
        ht.put("smith",marySmith);
        ht.put("wilson",mikeWilson);

        ht.printHashTable();
        System.out.println("Retrieve key wilson: " + ht.get("wilson"));
    }
}
