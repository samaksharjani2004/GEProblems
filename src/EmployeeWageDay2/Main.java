package EmployeeWageDay2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC-8: Passing company details as parameters
        EmployeeWage.computeEmployeeWage("DMart", 20, 20, 100);
        EmployeeWage.computeEmployeeWage("Reliance", 25, 22, 110);
        EmployeeWage.computeEmployeeWage("TCS", 30, 20, 120);
    }
}
