package pro.sky.java.course1.courseproject;

import java.util.Arrays;
import java.util.Objects;

public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void printAllEmployees() {
        System.out.println(Arrays.toString(employees));
    }

    public void salarySumm() {
        int summ = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            summ += employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты составила: " + summ);
    }

    public void findMinSalary() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата: " + min);
    }

    public void findMaxSalary() {
        int max = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата: " + max);
    }

    public void calcAvgSalary() {
        int summ = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            summ += employees[i].getSalary();
        }
        System.out.println("Среднее значение зарплат: " + summ / 5);
    }

    public void printEmployeesNames() {
        for (int i = 0; i <= employees.length - 1; i++) {
            System.out.println(" Сотрудник: " + employees[i].getName());
        }
    }

    public void indexSalary() {
        float index = 1.05F;
        for (int i = 0; i <= employees.length - 1; i++) {
            System.out.println("Зарплата проиндексирована. Текущая зарплата составляет: " + employees[i].getSalary() * index);
        }
    }

    public void findMinSalaryInDepartment(int department) {
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

    public void findMaxSalaryInDepartment(int department) {
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

    public void salarySummInDepartment(int department) {
        int summ = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                summ += employees[i].getSalary();
            }
        }
        System.out.println("Суммарная зарплата в отделе " + department + " составляет " + summ);
    }

    public void calcAvgSalaryInDepartment(int department) {
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

    public void indexSalaryInDepartment(int department, float index) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println("Зарплата в отеделе " + department + " проиндексирована. Текущая зарплата составляет: " + employees[i].getSalary() * index);
            }
        }
    }

    public void printAllEmployeesInDepartment(int department) {
        for (int i = 0; i <= employees.length - 1; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println("Сотрудник: " + employees[i].getName() + " Зарплата: " + employees[i].getSalary() + " ID: " + employees[i].getId());
            }
        }
    }

    public void findSalaryLessThen(int salaryNum) {
        for (int i = 0; i < employees.length; i++) {
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

    public void addEmployee(String name, int department, int salary) {
        if (size >= employees.length) {
            System.out.println("Невозможно добавить сотрудника, закончилось место");
        }
        Employee newEmployee = new Employee(name, department, salary);
        employees[size++] = newEmployee;
    }

    public void removeEmployee(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                employees[i] = null;
                if (i != employees.length) {
                    System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                }
                System.out.println(employees[i].getName() + " удален");
                size--;
                return;
            }

        }
    }

    public void changeEmployee(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                employees[i].setSalary(550000);
                employees[i].setDepartment(3);
            }
        }
    }

    public void printDepartmentsEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Отдел: " + employees[i].getDepartment() + " сотрудник: " + employees[i].getName());

        }

    }

    @Override
    public String toString() {
        return "EmployeeBook{" +
                "employees=" + Arrays.toString(employees) +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeBook that = (EmployeeBook) o;
        return size == that.size && Arrays.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(employees);
        return result;
    }
}
