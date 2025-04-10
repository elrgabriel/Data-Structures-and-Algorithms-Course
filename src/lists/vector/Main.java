package lists.vector;


import lists.arraylists.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//Vector class is thread safe, if used in different threads it synchronizes.
//Because of that it is slower than array lists.
public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();

        employeeList.add(new Employee("Jane","Jones",123));
        employeeList.add(new Employee("John","Doe",456));
        employeeList.add(new Employee("Mary","Smith",22));
        employeeList.add(new Employee("Mike","Wilson",987));
    }
}
