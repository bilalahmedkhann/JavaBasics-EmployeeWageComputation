import java.util.Random;
public class EmployeeWageBuilder {
    int IS_ABSENT = 0;
    int IS_FULL_TIME = 1;
    int IS_PART_TIME = 2;
    int EMP_RATE_PER_HOUR = 20;
    int FULL_DAY_HOUR = 8;
    int PART_TIME_HOUR = 4;

    public static void main(String[] args) {
        EmployeeWageBuilder emp = new EmployeeWageBuilder();
        emp.attendanceCheck();
    }
    public void attendanceCheck() {
        int empHrs = 0;
        int daily_wage = 0;
        Random random = new Random();
        int empCheck = random.nextInt() % 3;
        switch (empCheck) {
            case 1:
                empHrs = 8;
                break;
            case 2:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }
        daily_wage = (empHrs * EMP_RATE_PER_HOUR);
        System.out.println("Employee Daily wage is :" + daily_wage);
    }
}