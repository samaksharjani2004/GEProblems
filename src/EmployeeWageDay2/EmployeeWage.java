package EmployeeWageDay2;

public class EmployeeWage {

    public void calculateWageTillCondition() {

        int wagePerHour = 20;
        int maxWorkingDays = 20;
        int maxWorkingHours = 100;

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

        while (totalWorkingDays < maxWorkingDays &&
                totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

            int empCheck = (int) (Math.random() * 3);
            int empHours = 0;

            if (empCheck == 1) {
                empHours = 8;
            } else if (empCheck == 2) {
                empHours = 4;
            }

            totalWorkingHours += empHours;
        }

        int totalWage = totalWorkingHours * wagePerHour;

        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Wage: " + totalWage);
    }
}
