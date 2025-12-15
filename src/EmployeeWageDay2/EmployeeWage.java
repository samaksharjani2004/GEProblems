package EmployeeWageDay2;

public class EmployeeWage {

    public void calculateMonthlyWage() {

        int wagePerHour = 20;
        int fullDayHour = 8;
        int workingDays = 20;

        int monthlyWage = wagePerHour * fullDayHour * workingDays;
        System.out.println("Monthly Wage: " + monthlyWage);
    }
}
