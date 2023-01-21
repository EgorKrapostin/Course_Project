package pro.sky.java.course1.courseproject;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Иванов Иван", 1, 50_000);
        employeeBook.addEmployee("Иванов Иван1", 2, 51_000);
        employeeBook.addEmployee("Иванов Иван2", 3, 52_000);
        employeeBook.addEmployee("Иванов Иван3", 4, 53_000);
        employeeBook.addEmployee("Иванов Иван4", 5, 54_000);
        employeeBook.addEmployee("Иванов Иван5", 1, 55_000);
        employeeBook.addEmployee("Иванов Иван6", 2, 56_000);
        employeeBook.addEmployee("Иванов Иван7", 3, 57_000);
        employeeBook.addEmployee("Иванов Иван8", 4, 58_000);
        employeeBook.addEmployee("Иванов Иван9", 5, 59_000);
        employeeBook.removeEmployee("Иванов Иван4");

        employeeBook.printAllEmployees();
        System.out.println(" ");
        employeeBook.salarySumm();
        System.out.println(" ");
        employeeBook.findMinSalary();
        System.out.println(" ");
        employeeBook.findMaxSalary();
        System.out.println(" ");
        employeeBook.calcAvgSalary();
        System.out.println(" ");
        employeeBook.printEmployeesNames();
        System.out.println(" ");
        employeeBook.indexSalary();
        System.out.println(" ");
        employeeBook.findMinSalaryInDepartment(2);
        System.out.println(" ");
        employeeBook.findMaxSalaryInDepartment(2);
        System.out.println(" ");
        employeeBook.salarySummInDepartment(2);
        System.out.println(" ");
        employeeBook.calcAvgSalaryInDepartment(2);
        System.out.println(" ");
        employeeBook.indexSalaryInDepartment(2, 1.15F);
        System.out.println(" ");
        employeeBook.printAllEmployeesInDepartment(2);
        System.out.println(" ");
        employeeBook.findSalaryLessThen(55_000);
        System.out.println(" ");
        employeeBook.changeEmployee("Иванов Иван1");
        System.out.println(" ");
        employeeBook.printAllEmployees();
        System.out.println(" ");
        employeeBook.printDepartmentsEmployees();
    }
}


