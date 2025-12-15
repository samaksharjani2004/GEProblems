package EmployeeWageDay2;

public class EmployeeWage {

    public void calculateDailyWage() {

        int IS_PRESENT = 1;
        int wagePerHour = 20;
        int fullDayHour = 8;

        int empCheck = (int) (Math.random() * 2);

        if (empCheck == IS_PRESENT) {
            int dailyWage = wagePerHour * fullDayHour;
            System.out.println("Employee is Present");
            System.out.println("Daily Wage: " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Daily Wage: 0");
        }
    }
}

