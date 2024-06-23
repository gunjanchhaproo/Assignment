import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionMap {
    public static void main(String args[]){
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "John");
        linkedHashMap.put(2, "James");
        linkedHashMap.put(3, "Kashish");
        linkedHashMap.put(4, "Priti");
        System.out.println("Linked hashmap output");
        for (Map.Entry<Integer, String> em : linkedHashMap.entrySet()) {
            System.out.println("Key: " + em.getKey() + ", Value: " + em.getValue());
        }

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "John");
        treeMap.put(2, "James");
        treeMap.put(3, "Kashish");
        treeMap.put(4, "Preeti");
        System.out.println("treemap output");
        for (Map.Entry<Integer, String> em1 : treeMap.entrySet()) {
            System.out.println("Key: " + em1.getKey() + ", Value: " + em1.getValue());
        }

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "John");
        hashMap.put(2, "James");
        hashMap.put(3, "Kashish");
        hashMap.put(4, "Preeti");
        System.out.println("Hashmap output");
        for (Map.Entry<Integer, String> em2 : hashMap.entrySet()) {
            System.out.println("Key: " + em2.getKey() + ", Value: " + em2.getValue());
        }

        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, new Employee(1, "John"));
        employeeMap.put(2, new Employee(2, "James"));
        employeeMap.put(3, new Employee(3, "Kashish"));
        employeeMap.put(3, new Employee(4, "Preeti"));

        for (Map.Entry<Integer, Employee> em3 : employeeMap.entrySet()) {
            System.out.println("Key: " + em3.getKey() + ", Id: " + em3.getValue().getEmployeeId()+" ,Name: "+em3.getValue().getEmployeeName());
        }
    }
}
