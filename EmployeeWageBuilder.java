import java.util.Random;
public class EmployeeWageBuilder {
    //CONSTANTS
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int FULL_MONTH_WORKING_DAYS = 20;
    public static final int MAXIMUM_WORKING_HOUR = 100;

    public static void main(String[] args) {
        EmployeeWageBuilder emp = new EmployeeWageBuilder();
        emp.WageCheck();
    }
    public void WageCheck() {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalSalary = 0;
        int totalWorkingDays = 0;
        Random random = new Random();
        while (totalEmpHrs <= MAXIMUM_WORKING_HOUR && totalWorkingDays < FULL_MONTH_WORKING_DAYS) {
            totalWorkingDays = totalWorkingDays + 1;
            int empCheck = random.nextInt() % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs = empHrs + totalEmpHrs;
            System.out.println("Day: " + totalWorkingDays + " Employee Hour: " + empHrs);
        }
        totalSalary = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Employee Wage: " + totalSalary);
    }
}