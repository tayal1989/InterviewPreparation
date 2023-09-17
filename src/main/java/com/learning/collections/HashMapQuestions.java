package com.learning.collections;

import javax.swing.text.AsyncBoxView;
import java.lang.reflect.AnnotatedArrayType;
import java.util.*;

public class HashMapQuestions {
    public static void main(String[] args) {
        List<EmployeeHM> employeeList = new ArrayList<>();
        employeeList.add(new EmployeeHM(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new EmployeeHM(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new EmployeeHM(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new EmployeeHM(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new EmployeeHM(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new EmployeeHM(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new EmployeeHM(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new EmployeeHM(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new EmployeeHM(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new EmployeeHM(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new EmployeeHM(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new EmployeeHM(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new EmployeeHM(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new EmployeeHM(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new EmployeeHM(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new EmployeeHM(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new EmployeeHM(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        getCountOfMaleAndFemaleEmployees(employeeList);
        printDepartmentName(employeeList);
        getAvgAgeOfMaleAndFemaleEmp(employeeList);
        employeeJoiningAfter(employeeList, 2015);
        findOldestEmployee(employeeList);
        averageAndTotalSalary(employeeList);
        findHighestExperiencedEmployee(employeeList);
        getNumberOfEmployeeFromEachDepartment(employeeList);
        getTotalSalaryForEachDepartment(employeeList);
    }

    public static void getCountOfMaleAndFemaleEmployees(List<EmployeeHM> list) {
        int countMaleEmp = 0;
        int countFemaleEmp = 0;
        String gender = null;

        for (int i = 0; i < list.size(); i++) {
            gender = list.get(i).getGender();
            if(gender.equalsIgnoreCase("Male")) {
                countMaleEmp++;
            } else {
                countFemaleEmp++;
            }
        }

        System.out.println("=====================================");
        System.out.println("Male Emp : " + countMaleEmp + ", Female Emp : " + countFemaleEmp);
        System.out.println("=====================================\n");
    }

    public static void printDepartmentName(List<EmployeeHM> list) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if(!set.contains(list.get(i).getDepartment())) {
                set.add(list.get(i).getDepartment());
            }
        }

        System.out.println("=====================================");
        System.out.println(set);
        System.out.println("=====================================\n");
    }

    public static void getAvgAgeOfMaleAndFemaleEmp(List<EmployeeHM> list) {
        String gender = null;
        int sumMaleEmp = 0;
        int sumFemaleEmp = 0;
        int countMaleEmp = 0;
        int countFemaleEmp = 0;

        for (int i = 0; i < list.size(); i++) {
            gender = list.get(i).getGender();
            if(gender.equalsIgnoreCase("Male")) {
                sumMaleEmp += list.get(i).getAge();
                countMaleEmp++;
            } else {
                sumFemaleEmp += list.get(i).getAge();
                countFemaleEmp++;
            }
        }

        System.out.println("=====================================");
        System.out.println("Average age of Male Emp : " + sumMaleEmp/countMaleEmp);
        System.out.println("Average age of Female Emp : " + sumFemaleEmp/countFemaleEmp);
        System.out.println("=====================================\n");
    }

    public static void employeeJoiningAfter(List<EmployeeHM> list, int year) {
        System.out.println("=====================================");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getYearOfJoining() > year) {
                System.out.println(list.get(i).getName());
            }
        }
        System.out.println("=====================================\n");
    }

    public static void findOldestEmployee(List<EmployeeHM> list) {
        System.out.println("=====================================");

        int maxAge = 0;
        String nameOfEmp = null;
        String deptName = null;

        for (int i = 0; i < list.size(); i++) {
            if(maxAge < list.get(i).getAge()) {
                maxAge = list.get(i).getAge();
                nameOfEmp = list.get(i).getName();
                deptName = list.get(i).getDepartment();
            }
        }

        System.out.println("Name of Emp : " + nameOfEmp + ", age : " + maxAge + ", dept : " + deptName);
        System.out.println("=====================================\n");
    }

    public static void averageAndTotalSalary(List<EmployeeHM> list) {
        System.out.println("=====================================");

        double sumOfSalary = 0;

        for (int i = 0; i < list.size(); i++) {
            sumOfSalary = sumOfSalary + list.get(i).getSalary();
        }

        System.out.println("Sum of salary : " + sumOfSalary);
        System.out.println("Average salary : " + sumOfSalary/list.size());
        System.out.println("=====================================\n");
    }

    public static void findHighestExperiencedEmployee(List<EmployeeHM> list) {
        System.out.println("=====================================");

        int highestExpInYears = list.get(0).getYearOfJoining();
        String name = null;

        for (int i = 0; i < list.size(); i++) {
            if(highestExpInYears >= list.get(i).getYearOfJoining()) {
                highestExpInYears = list.get(i).getYearOfJoining();
                name = list.get(i).getName();
            }
        }

        System.out.println("Highest Exp Employee : " + name + ", Year of Joining : " + highestExpInYears);
        System.out.println("=====================================\n");
    }

    public static void getNumberOfEmployeeFromEachDepartment(List<EmployeeHM> list) {
        System.out.println("=====================================");
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            if(map.containsKey(list.get(i).getDepartment())) {
                map.put(list.get(i).getDepartment(), map.get(list.get(i).getDepartment()) + 1);
            } else {
                map.put(list.get(i).getDepartment(), 1);
            }
        }

        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("Department = " + entry.getKey() + ", No of employee = " + entry.getValue());
        }
        System.out.println("=====================================\n");
    }

    public static void getTotalSalaryForEachDepartment(List<EmployeeHM> list) {
        System.out.println("=====================================");
        Map<String, Double> salaryMap = new HashMap<>();
        Map<String, Integer> totalDeptEmpMap = new HashMap<>();
        Map<String, String> mapForEmpNameInEachDept = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            if(salaryMap.containsKey(list.get(i).getDepartment())) {
                salaryMap.put(list.get(i).getDepartment(), salaryMap.get(list.get(i).getDepartment()) + list.get(i).getSalary());
                totalDeptEmpMap.put(list.get(i).getDepartment(), totalDeptEmpMap.get(list.get(i).getDepartment()) + 1);
                mapForEmpNameInEachDept.put(list.get(i).getDepartment(),
                        mapForEmpNameInEachDept.get(list.get(i).getDepartment()) + ", " + list.get(i).getName());
            } else {
                salaryMap.put(list.get(i).getDepartment(), list.get(i).getSalary());
                totalDeptEmpMap.put(list.get(i).getDepartment(), 1);
                mapForEmpNameInEachDept.put(list.get(i).getDepartment(), list.get(i).getName());
            }
        }

        Iterator<Map.Entry<String, Double>> itr = salaryMap.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Double> entry = itr.next();
            System.out.println("Department = " + entry.getKey() +
                    ", Total Salary = " + entry.getValue()/totalDeptEmpMap.get(entry.getKey()) +
                    ", Names of Employees = " + mapForEmpNameInEachDept.get(entry.getKey()));
        }
        System.out.println("=====================================\n");
    }
}
