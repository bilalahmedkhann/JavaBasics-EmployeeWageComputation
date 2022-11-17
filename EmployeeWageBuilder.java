import java.util.Random;

public class EmployeeWageBuilder {
    int IS_ABSENT = 0;
    int IS_FULL_TIME = 1;
    int IS_PART_TIME = 2;
    int EMP_RATE_PER_HOUR = 20;
    int FULL_MONTH = 20;
    int MAXIMUM_WORKING_HOUR = 100;
    public static void main(String[] args) {
        EmployeeWageBuilder emp = new EmployeeWageBuilder();
        emp.WageCheck();
    }
    public void WageCheck() {
        int empHrs = 0;
        int daily_Wage = 0;
        int monthly_Wage = 0;
        int totalEmpHrs = 0;
        int totalSalary = 0;
        int totalWorkingDays = 0;
        Random random = new Random();
        int empCheck = random.nextInt() % 3;
        while (totalEmpHrs < MAXIMUM_WORKING_HOUR && totalWorkingDays < FULL_MONTH) {
            if (empCheck == IS_FULL_TIME) {
                empHrs = 8;
            } else if (empCheck == IS_PART_TIME) {
                empHrs = 4;
            } else if (empCheck == IS_ABSENT) {
                empHrs = 0;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
            totalWorkingDays++;
        }
        totalSalary = totalEmpHrs * empHrs;
        System.out.println(totalSalary);
    }
}