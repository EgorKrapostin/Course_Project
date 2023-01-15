package pro.sky.java.course1.courseproject;

import java.util.Arrays;

public class Employee {
    private String name;
    private int department;
    private int salary;
    private int id = Main.counter;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = Main.counter++;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void printAllEmployees(Employee[] employees) {
        System.out.println(Arrays.toString(employees));

    }

    public static void salarySumm(Employee[] employees) {
        int summ = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            summ += employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты составила: " + summ);
    }

    public static void findMinSalary(Employee[] employees) {
        int min = 1000000;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата: " + min);
    }

    public static void findMaxSalary(Employee[] employees) {
        int max = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата: " + max);
    }

    public static void calcAvgSalary(Employee[] employees) {
        int summ = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            summ += employees[i].getSalary();
        }
        System.out.println("Среднее значение зарплат: " + summ / 5);
    }

    public static void printEmployeesNames(Employee[] employees) {
        for (int i = 0; i <= employees.length - 1; i++) {
            System.out.println(" Сотрудник: " + employees[i].getName());
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}



