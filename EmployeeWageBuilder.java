import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        EmployeeWageBuilder emp = new EmployeeWageBuilder();
        emp.attendanceCheck(IS_FULL_TIME,EMP_RATE_PER_HOUR,FULL_DAY_HOUR);

    }
    public void attendanceCheck(int IS_FULL_TIME,int EMP_RATE_PER_HOUR,int FULL_DAY_HOUR){
        Random random=new Random();
        int empCheck=random.nextInt()%2;

        if (empCheck==IS_FULL_TIME){
            int total_Salary=(FULL_DAY_HOUR*EMP_RATE_PER_HOUR);
            System.out.println("Employee is present & his daily wage is :"+total_Salary);
        }else {
            System.out.println("Employee is absent & his daily wage is :0");
        }
    }
}
