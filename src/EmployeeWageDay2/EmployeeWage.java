package EmployeeWageDay2;

public class EmployeeWage {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    // UC-8: Class Method with Parameters
    public static void computeEmployeeWage(String company,
                                           int empRatePerHour,
                                           int maxWorkingDays,
                                           int maxWorkingHours) {

        int empHours;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        while (totalEmpHours < maxWorkingHours &&
                totalWorkingDays < maxWorkingDays) {

            totalWorkingDays++;

            int empCheck = (int) (Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_PART_TIME:
                    empHours = 4;
                    break;

                case IS_FULL_TIME:
                    empHours = 8;
                    break;

                default:
                    empHours = 0;
            }

            totalEmpHours += empHours;
        }

        int totalEmpWage = totalEmpHours * empRatePerHour;

        System.out.println("Company: " + company);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalEmpHours);
        System.out.println("Total Employee Wage: " + totalEmpWage);
        System.out.println("------------------------------------");
    }
}