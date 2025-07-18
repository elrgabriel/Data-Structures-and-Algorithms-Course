package hashtable.exploringjdk;

import lists.arraylists.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",4567);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",123);

        Map<String,Employee> hashMap = new HashMap<String,Employee>();

        hashMap.put("jones",janeJones);
        hashMap.put("doe",johnDoe);
        hashMap.put("smith",marySmith);
        hashMap.put("wilson",mikeWilson);

//        Iterator<Employee> iterator = hashMap.values().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        hashMap.forEach((k,v) -> System.out.println("Key: " + k + " Employee: " + v));

    }
}
