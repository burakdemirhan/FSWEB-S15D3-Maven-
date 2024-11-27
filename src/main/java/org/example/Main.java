package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1,"Ayse","Demirhan"));
        employees.add(new Employee(2, "Sıla", "Naz"));
        employees.add(new Employee(3, "Fazlı", "Baba"));
        employees.add(new Employee(4, "Pelin", "Anne"));
        employees.add(new Employee(5, "Esma", "Avci"));
        employees.add(new Employee(6, "Çagla", "Caliskan"));
        employees.add(new Employee(7, "Ekin", "Topgül"));
        employees.add(new Employee(8, "Irem ", "Arslaner"));
        employees.add(new Employee(9, "Sena", "Dalgın"));
        employees.add(new Employee(2, "Sıla", "Naz"));
        employees.add(new Employee(8, "Irem ", "Arslaner"));
        employees.add(new Employee(6, "Çagla", "Çalışkan"));
        employees.add(null);
        System.out.println(employees);




    }
    public static List<Employee> findDuplicates(List<Employee> list){
        List<Employee> duplicates = new ArrayList<>();
        Set<Employee> seen = new HashSet<>();
        for(Employee employee : list){
            if(!seen.add(employee)) {
                if(!duplicates.contains(employee)){
                    duplicates.add(employee);
                }
            }
        }

        return duplicates;


    }
    public static Map<Integer, Employee> findUniques(List<Employee> list) {
        Map<Integer, Employee> uniqueMap = new LinkedHashMap<>();
        Set<Employee> seen = new HashSet<>();
        Set<Employee> duplicates = new HashSet<>();

        for (Employee employee : list) {
            if (employee != null) {
                if (!seen.add(employee)) {
                    duplicates.add(employee);
                }
            }
        }

        for (Employee employee : list) {
            if (employee != null) {
                if (!duplicates.contains(employee)) {
                    uniqueMap.put(employee.getId(), employee);
                } else if (!uniqueMap.containsKey(employee.getId())) {
                    uniqueMap.put(employee.getId(), employee);
                }
            }
        }

        return uniqueMap;
    }

    public static List<Employee> removeDuplicates(List<Employee> list){

       HashMap<Employee, Integer> frequencyMap = new HashMap<>();
       for(Employee employee : list){
        frequencyMap.put(employee, frequencyMap.getOrDefault(employee, 0) + 1);
       }
        LinkedList<Employee> result = new LinkedList<>();
       for(Map.Entry<Employee, Integer> entry : frequencyMap.entrySet()){
           if(entry.getValue() == 1) {
               result.add(entry.getKey());
           }
       }


return result;
    }




}
