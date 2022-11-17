import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        EmployeeWageBuilder emp = new EmployeeWageBuilder();
        emp.attendanceCheck(1);
    }
    public void attendanceCheck(int IS_FULL_TIME){
        Random random=new Random();
        int empCheck=random.nextInt()%2;
        if (empCheck==IS_FULL_TIME){
            System.out.println("Employee is present");
        }else {
            System.out.println("Employee is absent");
        }
    }
}
