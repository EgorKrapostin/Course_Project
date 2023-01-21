package pro.sky.java.course1.courseproject;

import java.util.Arrays;
import java.util.Objects;

public class Employee {
    static int counter = 0;
    private String name;
    private int department;
    private int salary;
    private int id = counter;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
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
        int min = Integer.MAX_VALUE;
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

    public static void indexSalary(Employee[] employees) {
        float index = 1.05F;
        for (int i = 0; i <= employees.length - 1; i++) {
            System.out.println("Зарплата проиндексирована. Текущая зарплата составляет: " + employees[i].getSalary() * index);
        }
    }

    public static void findMinSalaryInDepartment(Employee[] employees, int department) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() < min) {
                    min = employees[i].getSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата в отделе " + department + " составляет: " + min);
    }

    public static void findMaxSalaryInDepartment(Employee[] employees, int department) {
        int max = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() > max) {
                    max = employees[i].getSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата в отделе " + department + " составляет: " + max);
    }

    public static void salarySummInDepartment(Employee[] employees, int department) {
        int summ = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                summ += employees[i].getSalary();
            }
        }
        System.out.println("Суммарная зарплата в отделе " + department + " составляет " + summ);
    }

    public static void calcAvgSalaryInDepartment(Employee[] employees, int department) {
        int counter = 0;
        int summ = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                counter++;
                summ += employees[i].getSalary();
            }
        }
        int avgSalary = summ / counter;
        System.out.println("Средняя зарплата в отедел " + department + " составляет: " + avgSalary);
    }

    public static void indexSalaryInDepartment(Employee[] employees, int department, float index) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println("Зарплата в отеделе " + department + " проиндексирована. Текущая зарплата составляет: " + employees[i].getSalary() * index);
            }
        }
    }

    public static void printAllEmployeesInDepartment(Employee[] employees, int department) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println("Сотрудник: " + employees[i].getName() + " Зарплата: " + employees[i].getSalary() + " ID: " + employees[i].getId());
            }
        }
    }

    public static void findSalaryLessThen(Employee[] employees, int salaryNum) {
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i].getSalary() < salaryNum) {
                System.out.println("Сотрудники с зарплатой меньше чем " + salaryNum);
                System.out.println("Сотрудник: " + employees[i].getName() + " Зарплата: " + employees[i].getSalary() + " Отдел: " + employees[i].getDepartment() + " ID: " + employees[i].getId());
                System.out.println(" ");
            } else {
                System.out.println(" ");
                System.out.println("Сотрудники с зарплатой больше чем " + salaryNum);
                System.out.println("Сотрудник: " + employees[i].getName() + " Зарплата: " + employees[i].getSalary() + " Отдел: " + employees[i].getDepartment() + " ID: " + employees[i].getId());
            }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }
}



