package EmployeeWageDay2;

public class EmployeeWage {

    public void calculateDailyWage() {

        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;

        int wagePerHour = 20;
        int fullTimeHour = 8;
        int partTimeHour = 4;

        int empCheck = (int) (Math.random() * 3);
        int empHours = 0;

        if (empCheck == IS_FULL_TIME) {
            empHours = fullTimeHour;
            System.out.println("Employee is Full Time");
        } else if (empCheck == IS_PART_TIME) {
            empHours = partTimeHour;
            System.out.println("Employee is Part Time");
        } else {
            System.out.println("Employee is Absent");
        }

        int dailyWage = empHours * wagePerHour;
        System.out.println("Daily Wage: " + dailyWage);
    }
}
