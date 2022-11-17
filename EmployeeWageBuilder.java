import java.util.Random;

public class EmployeeWageBuilder {
    int IS_ABSENT = 0;
    int IS_FULL_TIME = 1;
    int IS_PART_TIME = 2;
    int EMP_RATE_PER_HOUR = 20;
    int FULL_MONTH = 20;
    public static void main(String[] args) {
        EmployeeWageBuilder emp = new EmployeeWageBuilder();
        emp.attendanceCheck();
    }
    public void attendanceCheck(){
        int empHrs = 0;
        int daily_Wage = 0;
        int monthly_Wage = 0;
        Random random=new Random();
        int empCheck=random.nextInt()%3;

        if (empCheck==IS_FULL_TIME){
            empHrs = 8;
        } else if (empCheck==IS_PART_TIME) {
            empHrs = 4;

        } else if (empCheck==IS_ABSENT){
            empHrs = 0;
        }
        daily_Wage = (empHrs*EMP_RATE_PER_HOUR);
        monthly_Wage = (FULL_MONTH*empHrs*EMP_RATE_PER_HOUR);
        System.out.println("Employee Monthly wage is :"+ monthly_Wage+" & daily wage is :"+daily_Wage);
    }
}