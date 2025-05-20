package jp.sample;
/*
import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private String department;
    private int salary;
    
    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return name + " (" + department + ", " + salary + "円)";
    }
}

public class CollectionSort2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("田中", "開発部", 350000));
        employees.add(new Employee("鈴木", "営業部", 380000));
        employees.add(new Employee("佐藤", "開発部", 400000));
        employees.add(new Employee("高橋", "人事部", 320000));
        employees.add(new Employee("伊藤", "開発部", 370000));
        
        // 「開発部」の社員のみ抽出
        List<Employee> devEmployees = new ArrayList<>();
        for (Employee e : employees) {
            if ("開発部".equals(e.getDepartment())) {
                devEmployees.add(e);
            }
        }

        // 給与の高い順にソート（降順）
        devEmployees.sort((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary()));

        // 出力
        System.out.println(devEmployees);
    }
}
*/
