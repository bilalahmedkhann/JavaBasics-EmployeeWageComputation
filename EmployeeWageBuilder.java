import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        int IS_ABSENT = 0;
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        EmployeeWageBuilder emp = new EmployeeWageBuilder();
        emp.attendanceCheck(IS_FULL_TIME,EMP_RATE_PER_HOUR,FULL_DAY_HOUR,IS_PART_TIME,IS_ABSENT);

    }
    public void attendanceCheck(int IS_FULL_TIME,int EMP_RATE_PER_HOUR,int FULL_DAY_HOUR, int IS_PART_TIME, int IS_ABSENT){
        int empHrs = 0;
        int dailyWage = 0;
        Random random=new Random();
        int empCheck=random.nextInt()%3;

        if (empCheck==IS_FULL_TIME){
            empHrs = 8;
            //int total_Salary=(FULL_DAY_HOUR*EMP_RATE_PER_HOUR);
            //System.out.println("Employee is present & his daily wage is :"+total_Salary);
        } else if (empCheck==IS_PART_TIME) {
            empHrs = 4;

        } else if (empCheck==IS_ABSENT){
            empHrs = 0;
        }
        int daily_wage = (empHrs*EMP_RATE_PER_HOUR);
        System.out.println("Employee Daily wage is :"+ daily_wage);
    }
}