

//Comparable: Implemented within the class and defines the natural ordering of objects. Use the compareTo method.
//Comparator: Implemented as separate classes or anonymous classes and defines custom orderings. Use the compare method.
//You can create multiple comparators for different sort orders.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparableVsComparator {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(2);
        intList.add(9);
        intList.add(1);
        intList.add(7);

        System.out.println("Before sorting: " + intList);

        Collections.sort(intList);
        System.out.println("After sorting: " + intList);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "John"));
        employees.add(new Employee(1, "James"));
        employees.add(new Employee(2, "Priti"));

        System.out.println("Before sorting by ID: " + employees);
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.getEmployeeId(), e2.getEmployeeId());
            }
        });
        System.out.println("After sorting by ID: " + employees);

        System.out.println("Before sorting by Name: " + employees);
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getEmployeeName().compareTo(e2.getEmployeeName());
            }
        });
        System.out.println("After sorting by Name: " + employees);


        List<Employee> employees1 = new ArrayList<>();
        employees1.add(new Employee(3, "John"));
        employees1.add(new Employee(1, "James"));
        employees1.add(new Employee(2, "Priti"));

        System.out.println("Before sorting: " + employees1);

        Collections.sort(employees1);
        System.out.println("After sorting: " + employees1);
    }

}