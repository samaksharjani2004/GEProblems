package EmployeeWageDay2;

public class EmployeeWage {

    public void calculateDailyWage() {

        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;

        int wagePerHour = 20;
        int empHours = 0;

        int empCheck = (int) (Math.random() * 3);

        switch (empCheck) {
            case IS_FULL_TIME:
                empHours = 8;
                System.out.println("Full Time Employee");
                break;

            case IS_PART_TIME:
                empHours = 4;
                System.out.println("Part Time Employee");
                break;

            default:
                empHours = 0;
                System.out.println("Employee is Absent");
        }

        int dailyWage = empHours * wagePerHour;
        System.out.println("Daily Wage: " + dailyWage);
    }
}
