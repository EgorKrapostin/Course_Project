package pro.sky.java.course1.courseproject;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Employee employee = new Employee("Иванов Иван", 1, 50_000);
        Employee employee1 = new Employee("Иванов Иван1", 2, 51_000);
        Employee employee2 = new Employee("Иванов Иван2", 3, 52_000);
        Employee employee3 = new Employee("Иванов Иван3", 4, 53_000);
        Employee employee4 = new Employee("Иванов Иван4", 5, 54_000);
        Employee employee5 = new Employee("Иванов Иван5", 1, 55_000);
        Employee employee6 = new Employee("Иванов Иван6", 2, 56_000);
        Employee employee7 = new Employee("Иванов Иван7", 3, 57_000);
        Employee employee8 = new Employee("Иванов Иван8", 4, 58_000);
        Employee employee9 = new Employee("Иванов Иван9", 5, 59_000);
        employees[0] = employee;
        employees[1] = employee1;
        employees[2] = employee2;
        employees[3] = employee3;
        employees[4] = employee4;
        employees[5] = employee5;
        employees[6] = employee6;
        employees[7] = employee7;
        employees[8] = employee8;
        employees[9] = employee9;

        Employee.printAllEmployees(employees);
        System.out.println(" ");
        Employee.salarySumm(employees);
        System.out.println(" ");
        Employee.findMinSalary(employees);
        System.out.println(" ");
        Employee.findMaxSalary(employees);
        System.out.println(" ");
        Employee.calcAvgSalary(employees);
        System.out.println(" ");
        Employee.printEmployeesNames(employees);
        System.out.println(" ");
        Employee.indexSalary(employees);
        System.out.println(" ");
        Employee.findMinSalaryInDepartment(employees,2);
        System.out.println(" ");
        Employee.findMaxSalaryInDepartment(employees,2);
        System.out.println(" ");
        Employee.salarySummInDepartment(employees, 2);
        System.out.println(" ");
        Employee.calcAvgSalaryInDepartment(employees,2);
        System.out.println(" ");
        Employee.indexSalaryInDepartment(employees,2,1.15F);
        System.out.println(" ");
        Employee.printAllEmployeesInDepartment(employees,2);
        System.out.println(" ");
        Employee.findSalaryLessThen(employees,55_500);
    }
}


