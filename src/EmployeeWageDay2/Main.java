package EmployeeWageDay2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWage dMart =
                new EmployeeWage("DMart", 20, 20, 100);

        EmployeeWage reliance =
                new EmployeeWage("Reliance", 25, 22, 110);

        EmployeeWage tcs =
                new EmployeeWage("TCS", 30, 20, 120);

        dMart.computeEmployeeWage();
        reliance.computeEmployeeWage();
        tcs.computeEmployeeWage();
    }
}
